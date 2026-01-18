package com.example.dreamteam

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.example.dreamteam.ui.theme.DreamTeamTheme
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DreamTeamTheme {
                HomeScreen(this)
            }
        }
    }
}

@Composable
fun HomeScreen(context: Context) {
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

            NavigationButtonCollection(Modifier.weight(.6f), context)
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
fun NavigationButtonCollection(modifier: Modifier = Modifier, context: Context) {
    val penafielIntent = Intent(context, PenafielScreen::class.java)
    val quitorioIntent = Intent(context, QuitorioScreen::class.java)
    val rabanoIntent = Intent(context, RabanoScreen::class.java)
    val recioIntent = Intent(context, RecioScreen::class.java)
    val rosalesIntent = Intent(context, RosalesScreen::class.java)

    val penafielOnClick ={
        context.startActivity(penafielIntent)
    }
    val quitorioOnClick ={
        context.startActivity(quitorioIntent)
    }
    val rabanoOnClick ={
        context.startActivity(rabanoIntent)
    }
    val recioOnClick ={
        context.startActivity(recioIntent)
    }
    val rosalesOnClick ={
        context.startActivity(rosalesIntent)
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