package com.mkaram.firstcomposeproject.presentation.screens.shimmer_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mkaram.firstcomposeproject.presentation.screens.shimmer_screen.components.AnimatedShimmer

@Composable
fun ShimmerScreen() {
    Column (modifier = Modifier.fillMaxSize()){
        repeat(7){
            AnimatedShimmer()
        }
    }
}