package com.example.dreamteam

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
                RabanoProfile()
            }
        }
    }
}

@Composable
fun RabanoProfile() {

    val context = LocalContext.current

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item {

                Image(
                    painter = painterResource(R.drawable.rabano),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .width(280.dp)
                        .height(380.dp)
                        .padding(16.dp)
                        .border(6.dp, Color.Black)
                )

                Text(
                    text = "Trisha Ann J. Rabano",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )

                Text(
                    text = "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student and I like to read and watch movies.",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(20.dp)
                )

                Button(
                    onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                    },
                    modifier = Modifier.padding(bottom = 40.dp)
                ) {
                    Text("Go Back")
                }
            }
        }
    }
}
