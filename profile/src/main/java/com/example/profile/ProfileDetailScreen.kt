package com.example.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
 fun ProfileDetailScreen(profileCoordinator: ProfileCoordinator)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Order Detail Screen", style = MaterialTheme.typography.h5)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Profile: Unknown")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { profileCoordinator.onBackPressed()}) {
            Text("Back to Profile List")
        }
    }
 }
