package com.example.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text


@Composable
fun ProfileScreen(profileCoordinator: ProfileCoordinator)
{
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        // Back to Main Button
        Button(
            onClick = { profileCoordinator.onBackPressed() },
            modifier = Modifier.align(Alignment.Start)) {
            Text("Back to Dashboard")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Title
        Text("Select a Profile", style = MaterialTheme.typography.titleLarge, modifier = Modifier.align(
            Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(16.dp))

        // List of Donuts
        val donuts = listOf("Profile 1", "Profile 2", "Profile 3", "Profile 4", "Profile 5")
        donuts.forEach { donut ->
            Button(
                onClick = { profileCoordinator.navigationController.navigate(ProfileRoutes.PROFILE_DETAILS.route)  },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text(donut)
            }
        }
    }

}
