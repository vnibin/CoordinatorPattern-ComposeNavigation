package com.example.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

public abstract class Coordinator( val navigationController: NavController) {
    abstract fun start()

    /**
     * Defines the navigation routes for this coordinator.
     */
//abstract fun NavGraphBuilder.registerRoutes()

    abstract fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit

    // Example of default behavior
    open fun onBackPressed() {
        navigationController.popBackStack()
    }

}