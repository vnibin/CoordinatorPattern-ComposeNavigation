package com.example.coordinatorpattern_composenavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.home.HomeCoordinator
import com.example.login.AuthCoordinator
import com.example.navigation.Coordinator


class AppCoordinator(navigationController: NavController) : Coordinator(navigationController) {

    private val authCoordinator = AuthCoordinator(
        navigationController,
        onLoginSuccess = {
            switchToHomeCoordinator()
        }
    )

    private val homeCoordinator = HomeCoordinator(
        navigationController,
        onLogOut = {
            onBackPressed()

        }
    )

    override fun start() {}

    override fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit {
        return {
            // Register routes for the AuthCoordinator
            authCoordinator.getRouteRegistrationLambda().invoke(this)
            homeCoordinator.getRouteRegistrationLambda().invoke(this)
        }
    }

    private fun switchToHomeCoordinator() {
        homeCoordinator.start()
    }

    val coordinators: List<Coordinator>
        get() = listOf(authCoordinator, homeCoordinator)
}
