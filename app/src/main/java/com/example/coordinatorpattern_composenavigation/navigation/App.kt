package com.example.coordinatorpattern_composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.navigation.DynamicNavigationHost

/*@Composable
fun App() {
    // Create a NavController for navigation
    val navController = rememberNavController()

    // Initialize the AppCoordinator with the NavController
    val appCoordinator = remember {
        AppCoordinator(navController)
    }

    // State to track if the navigation graph is initialized
    var isGraphInitialized by remember {
        mutableStateOf(false)
    }

    // Collect the registerRoutes functions
    val registerRoutesFunctions = appCoordinator.coordinators.map { it.getRouteRegistrationLambda() }

    // Set up the navigation host
    DynamicNavigationHost(
        registerRoutesFunctions = registerRoutesFunctions,
        onGraphInitialized = { isGraphInitialized = true } // Update state when graph is ready
    )

    // Start the AppCoordinator only after the navigation graph is initialized
    LaunchedEffect(isGraphInitialized) {
        if (isGraphInitialized) {
            appCoordinator.start()
        }
    }
}*/


/*
@Composable
fun App() {
    val navController = rememberNavController()
    val appCoordinator = remember { AppCoordinator(navController) }

    // Collect the registerRoutes functions from the coordinators
    val registerRoutesFunctions = appCoordinator.coordinators.map { it.getRouteRegistrationLambda() }

    // Set up the navigation host and trigger start once the graph is initialized
    DynamicNavigationHost(
        registerRoutesFunctions = registerRoutesFunctions,
        onGraphInitialized = {
            // Start AppCoordinator after the graph is ready
            appCoordinator.start()
        }
    )
}*/

@Composable
fun App() {
    val navController = rememberNavController()

    // Create the AppCoordinator and AuthCoordinator
    val appCoordinator = AppCoordinator(navController)

    // Collect the registerRoutes functions from each coordinator (AppCoordinator and AuthCoordinator)
    val registerRoutesFunctions = appCoordinator.coordinators.map { it.getRouteRegistrationLambda() }

    // Pass the functions to the DynamicNavigationHost
    DynamicNavigationHost(
        startDestination = "login",  // Directly start at the "login" route
        registerRoutesFunctions = registerRoutesFunctions
    )
}