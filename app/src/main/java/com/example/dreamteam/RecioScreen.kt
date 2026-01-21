package com.example.dreamteam

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecioProfile(navController: NavController) {
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
                        .height(300.dp),
                    painterResource(R.drawable.recio)
                )

                NameDisplay("Joaquin Aaron P. Recio")

                BioDisplay(
                    "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student. I am also the Society of Information Technology Students - 3rd Year Representative, and I like to play mobile games, watch Netflix, and play sports, especially when it comes to basketball."
                )

                NavigationButton("Go Back", {
                    navController.popBackStack()
                })
            }
        }
    }
}