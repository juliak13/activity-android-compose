package com.example.useractivity

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.useractivity.views.LoginActivity
import com.example.useractivity.views.RegisterActivity

@Composable
fun UserActivityNavigation(
    modifier : Modifier = Modifier,
    authViewModel: AuthViewModel
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login",
        builder = {
            composable("login") {
                LoginActivity(
                    modifier,
                    navController,
                    authViewModel
                )
            }
            composable("signup") {
                RegisterActivity(
                    modifier,
                    navController,
                    authViewModel
                )
            }
            composable("welcome") {
                WelcomeActivity(
                    modifier,
                    navController,
                    authViewModel
                )
            }
        }
    )
}