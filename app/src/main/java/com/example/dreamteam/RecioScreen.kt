package com.example.dreamteam

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.example.dreamteam.ui.theme.DreamTeamTheme

class RecioScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DreamTeamTheme {
                RecioProfile(this)
            }
        }
    }
}

@Composable
fun RecioProfile(context: Context) {
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
                ProfileImageDisplay(Modifier
                    .height(400.dp),
                    painterResource(R.drawable.recio)
                )

                NameFormatDisplay("Joaquin Aaron P. Recio")

                BioFormatDisplay(
                    "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student. I am also the Society of Information Technology Students - 3rd Year Representative, and I like to play mobile games, watch Netflix, and play sports, especially when it comes to basketball."
                )

                NavigationButton("Go Back", {
                    val mainIntent = Intent(context, MainActivity::class.java)
                    context.startActivity(mainIntent)
                })
            }
        }
    }
}

@Composable
fun ProfileImageDisplay(modifier: Modifier = Modifier, painter: Painter) {
    Image(
        modifier = modifier
            .padding(bottom = 10.dp)
            .border(
                width = 7.dp,
                color = Color.Black
            ),
        painter = painter,
        contentDescription = "Profile Image"
    )
}

@Composable
fun NameFormatDisplay(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun BioFormatDisplay(bio: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = bio,
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )
    }
}