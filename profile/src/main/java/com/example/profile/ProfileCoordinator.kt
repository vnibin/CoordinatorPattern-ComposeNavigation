package com.example.profile

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigation.Coordinator

class ProfileCoordinator(
    navigationController: NavController,
) : Coordinator(navigationController) {

    override fun start() {
        // Navigate to the login screen
        navigationController.navigate(ProfileRoutes.PROFILE.route)
    }

    override fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit {
        return {

            composable(ProfileRoutes.PROFILE.route) {
                // Display the login screen
                ProfileScreen(this@ProfileCoordinator)
            }

            composable(ProfileRoutes.PROFILE_DETAILS.route) {
                // Display the login screen
                ProfileDetailScreen(this@ProfileCoordinator)
            }
        }
    }
}