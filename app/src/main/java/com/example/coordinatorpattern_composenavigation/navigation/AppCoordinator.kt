package com.example.coordinatorpattern_composenavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.login.AuthCoordinator
import com.example.navigation.Coordinator


class AppCoordinator(navigationController: NavController) : Coordinator(navigationController) {

    private val authCoordinator = AuthCoordinator(
        navigationController,
        onLoginSuccess = { switchToMainCoordinator() }
    )

    override fun start() {

    }

    override fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit {
        return {
            // Register routes for the AuthCoordinator
            authCoordinator.getRouteRegistrationLambda().invoke(this)
        }
    }

    private fun switchToMainCoordinator() {
        // Handle the transition after login success
    }

    val coordinators: List<Coordinator>
        get() = listOf(authCoordinator)
}
