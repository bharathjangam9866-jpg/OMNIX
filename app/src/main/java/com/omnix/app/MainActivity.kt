package com.omnix.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OmnixHome()
        }
    }
}

@Composable
fun OmnixHome() {
    var search by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF080B14)
    ) {
        Column(
            modifier = Modifier.padding(22.dp),
            verticalArrangement = Arrangement.spacedBy(22.dp)
        ) {
            Text(
                "OMNIX",
                color = Color(0xFF38BDF8),
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Text(
                "Your Universe of Innovation.",
                color = Color.White,
                fontSize = 20.sp
            )

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text("Search anything...")
                }
            )

            Text("Explore Your Universe",
                color = Color.White,
                fontSize = 23.sp
            )

            listOf(
                "AI Teacher",
                "3D Simulator",
                "Code Studio",
                "Projects",
                "Science & Technology"
            ).forEach { item ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color(0xFF17243D),
                            RoundedCornerShape(16.dp)
                        )
                        .padding(22.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        item,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
