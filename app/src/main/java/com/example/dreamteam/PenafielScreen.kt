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
fun PenafielProfile(navController: NavController) {
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
                    .height(330.dp),
                    painterResource(R.drawable.penafiel)
                )

                NameDisplay("John Lester D. Peñafiel")

                BioDisplay(
                    "I am a 21 year old 3rd Year Bachelor of Science in Information Technology student and I like to play guitar, play games like dead cell, blasphemous and omori."
                )

                NavigationButton("Go Back", {
                    navController.popBackStack()
                })
            }
        }
    }
}