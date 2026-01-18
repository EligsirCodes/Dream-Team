package com.example.dreamteam

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.example.dreamteam.ui.theme.DreamTeamTheme

class RabanoScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            DreamTeamTheme {
                RabanoProfile(this)
            }
        }
    }
}

@Composable
fun RabanoProfile(context: Context) {
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
                    painterResource(R.drawable.rabano)
                )

                NameDisplay("Trisha Ann J. Rabano")

                BioDisplay(
                    "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student and I like to read and watch horror movies."
                )

                NavigationButton("Go Back", {
                    val mainIntent = Intent(context, MainActivity::class.java)
                    context.startActivity(mainIntent)
                })
            }
        }
    }
}
