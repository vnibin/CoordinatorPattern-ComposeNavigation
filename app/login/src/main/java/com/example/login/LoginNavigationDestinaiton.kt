package com.example.login

sealed class LoginNavigationDestination(route: String) : NavigationDestination(route) {
    object LoginScreen : LoginNavigationDestination("login_screen")
}