package com.mkaram.firstcomposeproject.presentation.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubreposapp.presentation.screens.repo_details_screen.RepoDetailsScreen
import com.mkaram.firstcomposeproject.presentation.screens.Constants
import com.mkaram.firstcomposeproject.presentation.screens.repoListScreen.RepoListScreen
import com.mkaram.firstcomposeproject.presentation.screens.repoListScreen.fakeRepoUiModelList
import com.mkaram.firstcomposeproject.presentation.screens.repo_details_screen.fakeRepoDetailsUiModel

sealed class Screens (val route : String){
    data object RepoListScreen : Screens(route = "repo_list_screen")
    data object RepoDetailsScreen : Screens(route = "repo_details_screen/{${Constants}}"){
        fun passRepoName(name:String):String{
            return "repo_details_screen/$name"
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun GithubNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screens.RepoListScreen.route){
        composable(route = Screens.RepoListScreen.route){
            RepoListScreen(repoListUiModel = fakeRepoUiModelList,navController = navController){
                navController.navigate(Screens.RepoDetailsScreen.passRepoName(it.name))
            }
        }
        composable(route=Screens.RepoDetailsScreen.route){
            val passedName = it.arguments?.getString(Constants.name_key)
            passedName?.let {
                RepoDetailsScreen(repoDetailsUiModel = fakeRepoDetailsUiModel.copy(name = passedName), onClickBack = {}, onClickViewIssues = {},navController = navController)
            }



        }
    }
}