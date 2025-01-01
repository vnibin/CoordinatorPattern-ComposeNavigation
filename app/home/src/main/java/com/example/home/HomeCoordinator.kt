package com.example.home


class HomeCoordinator(private val homeNavigation: HomeNavigation) : Navigˀator {

    override fun navigateTo(destination: NavigationDestination) {
        when (destination) {
            is NavigationDestination.Home -> homeNavigation.navigateToHomeScreen()
            else -> throw IllegalArgumentException("Unknown destination in Home module")
        }
    }

    override fun navigateUp() {
        homeNavigation.navigateUp()
    }
}