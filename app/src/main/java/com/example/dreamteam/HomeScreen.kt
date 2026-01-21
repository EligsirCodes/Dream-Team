package com.example.dreamteam

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = { TopBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainText("Meet the", "DreamTeam", Modifier.weight(.4f))

            NavigationButtonCollection(Modifier.weight(.6f), navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TopAppBar(
            title = {
                Text(
                    text = "DreamTeam",
                    fontWeight = FontWeight.SemiBold
                )
            }
        )

        HorizontalDivider(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp),
            thickness = 3.dp
        )
    }
}

@Composable
fun MainText(subText: String, mainText: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 3.dp),
            text = subText,
            fontSize = 25.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .padding(top = 3.dp),
            text = mainText,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun NavigationButtonCollection(modifier: Modifier = Modifier, navController: NavController) {
    val penafielOnClick ={
        navController.navigate(Routes.PENAFIEL_SCREEN)
    }
    val quitorioOnClick ={
        navController.navigate(Routes.QUITORIO_SCREEN)
    }
    val rabanoOnClick ={
        navController.navigate(Routes.RABANO_SCREEN)
    }
    val recioOnClick ={
        navController.navigate(Routes.RECION_SCREEN)
    }
    val rosalesOnClick ={
        navController.navigate(Routes.ROSALES_SCREEN)
    }

    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavigationButton("Peñafiel Bio", penafielOnClick)
        NavigationButton("Quitorio Bio", quitorioOnClick)
        NavigationButton("Rabano Bio", rabanoOnClick)
        NavigationButton("Recio Bio", recioOnClick)
        NavigationButton("Rosales Bio", rosalesOnClick)
    }
}

@Composable
fun NavigationButton(buttonText: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(top = 10.dp, bottom = 10.dp, start = 45.dp, end = 45.dp),
        onClick = onClick
    ) {
        Text(
            text = buttonText,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}