package com.example.dreamteam

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dreamteam.ui.theme.DreamTeamTheme

class PenafielScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DreamTeamTheme {
                PenafielProfile(this)
            }
        }
    }
}

@Composable
fun PenafielProfile(context: Context) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = { TopBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                ProfileImage(Modifier
                    .height(360.dp),
                    painterResource(R.drawable.penafiel)
                )

                NameDisplay("John Lester D. Peñafiel")

                BioDisplay(
                    "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student and I like to play guitar, play games like dead cell, blasphemous and omori."
                )

                NavigationButton("Go Back", {
                    val mainIntent = Intent(context, MainActivity::class.java)
                    context.startActivity(mainIntent)
                })
            }
        }
    }
}