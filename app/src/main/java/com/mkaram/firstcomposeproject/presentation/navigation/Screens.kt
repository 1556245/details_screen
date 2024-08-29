package com.mkaram.firstcomposeproject.presentation.navigation

import com.mkaram.firstcomposeproject.presentation.utils.Constants

sealed class Screens (val route : String){
    data object RepoListScreen : Screens(route = "repo_list_screen")
    data object RepoDetailsScreen : Screens(route = "repo_details_screen/{${Constants.name_key}}"){
        fun passRepoName(name:String):String{
            return "repo_details_screen/$name"
        }
    }
    data object RepoIssuesScreen : Screens (route = "repo_issues_screen")
    data object RepoErrorScreen : Screens (route = "repo_error_screen")
}