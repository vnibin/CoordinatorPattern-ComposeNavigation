package com.example.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onLogOut: () -> Unit)
{
    Box(modifier = Modifier.fillMaxSize()) {
        // Logout button at the top-left corner
        IconButton(
            onClick = { onLogOut() },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = "Logout"
            )
        }

        // Title at the top center
        Text(
            text = "Dashboard",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.align(Alignment.TopCenter).padding(top = 24.dp)
        )



        // Go to Orders button at the bottom center
        Button(
            onClick = {  },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text("Go to Orders")
        }
    }
}