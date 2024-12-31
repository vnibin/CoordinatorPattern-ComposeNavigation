package com.example.coordinatorpattern_composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.login.LoginRoutes
import com.example.navigation.DynamicNavigationHost


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // Create the AppCoordinator and AuthCoordinator
    val appCoordinator = AppCoordinator(navController)

    // Collect the registerRoutes functions from each coordinator (AppCoordinator and AuthCoordinator)
    val registerRoutesFunctions =
        appCoordinator.coordinators.map { it.getRouteRegistrationLambda() }

    // Pass the functions to the DynamicNavigationHost
    DynamicNavigationHost(
        navController,
        startDestination = LoginRoutes.LOGIN.route,  // Directly start at the "login" route
        registerRoutesFunctions = registerRoutesFunctions
    )
}