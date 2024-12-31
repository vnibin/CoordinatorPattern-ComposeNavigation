package com.example.home

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigation.Coordinator

class HomeCoordinator(
    navigationController: NavController,
    private val onLogOut: () -> Unit): Coordinator(navigationController) {
    override fun start() {
        navigationController.navigate(HomeRoutes.HOME.route)
    }

    override fun getRouteRegistrationLambda(): NavGraphBuilder.() -> Unit {
        return {
            Log.d("Nibin","Home Coordinator")
            composable(HomeRoutes.HOME.route) {
                HomeScreen(onLogOut = {
                    onLogOut()
                })
            }
        }
    }
}