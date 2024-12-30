package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun DynamicNavigationHost(startDestination: String, registerRoutesFunctions: List<NavGraphBuilder.() -> Unit>) {
    val navController = rememberNavController()

    // Attach the navController to each coordinator (if necessary)
    // You can skip this if coordinators are already handling their own navigation
    // Example: coordinators.forEach { it.navigationController.attachNavController(navController) }

    NavHost(navController = navController, startDestination = startDestination) {
        // Dynamically register the routes using the passed functions
        registerRoutesFunctions.forEach { registerRoutes ->
            // Call the function to register the routes
            registerRoutes.invoke(this)
        }
    }
}




