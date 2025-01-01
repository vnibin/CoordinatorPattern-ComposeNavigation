package com.example.login



class LoginCoordinator(private val loginNavigation: LoginNavigation) : Navigator {

    override fun navigateTo(destination: NavigationDestination) {
        when (destination) {
            is NavigationDestination.Login -> loginNavigation.navigateToLoginScreen()
            else -> throw IllegalArgumentException("Unknown destination in Login module")
        }
    }

    override fun navigateUp() {
        loginNavigation.navigateUp()
    }
}