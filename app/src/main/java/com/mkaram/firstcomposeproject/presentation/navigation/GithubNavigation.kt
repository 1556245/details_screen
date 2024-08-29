package com.mkaram.firstcomposeproject.presentation.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mkaram.firstcomposeproject.presentation.utils.Constants
import com.mkaram.firstcomposeproject.presentation.screens.error_screen.ErrorScreenPage
import com.mkaram.firstcomposeproject.presentation.screens.issues_screen.AllIssueScreen
import com.mkaram.firstcomposeproject.presentation.screens.repo_list_screen.RepoListScreen
import com.mkaram.firstcomposeproject.presentation.screens.repo_list_screen.components.fakeRepoUiModelList
import com.mkaram.firstcomposeproject.presentation.screens.repo_details_screen.RepoDetailsScreen
import com.mkaram.firstcomposeproject.presentation.screens.repo_details_screen.components.fakeRepoDetailsUiModel



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
                RepoDetailsScreen(repoDetailsUiModel = fakeRepoDetailsUiModel.copy(name = passedName),
                    onClickBack = {
                                  navController.navigate(Screens.RepoListScreen.route){
                                      popUpTo(navController.graph.startDestinationId) {
                                          inclusive = true
                                      }
                                  }
                    },
                    onClickViewIssues = {
                        navController.navigate(Screens.RepoIssuesScreen.route)
                    },
                )
            }
        }

        composable(route = Screens.RepoIssuesScreen.route){
            AllIssueScreen(){
                navController.navigate(Screens.RepoDetailsScreen.route)
            }
        }

        composable(route = Screens.RepoErrorScreen.route){
            ErrorScreenPage(errorCode = "404") {
                println("retry")
            }

        }
    }
}