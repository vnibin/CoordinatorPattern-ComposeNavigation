package com.example.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.navigation.Coordinator


class AuthCoordinator(
    navigationController: NavController,
    private val onLoginSuccess: () -> Unit
) : Coordinator(navigationController) {

    override fun start() {
        // Navigate to the login screen
        navigationController.navigate("login")
    }

    override fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit {
        return {
            composable("login") {
                // Display the login screen
                LoginScreen(onLoginSuccess = { onLoginSuccess() })
            }
        }
    }
}



