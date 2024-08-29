package com.mkaram.firstcomposeproject.presentation.commonComponents

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkaram.firstcomposeproject.R
import com.mkaram.firstcomposeproject.ui.theme.FirstComposeProjectTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoAppBar(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    titleStyle : TextStyle = MaterialTheme.typography.titleLarge,
    color : Color = MaterialTheme.colorScheme.primary,
    showArrowBack : Boolean = true,
    onBackButtonClicked :()->Unit ={}

    ) {
    CenterAlignedTopAppBar(title = {
        Text(
            stringResource(id = title),
            style = titleStyle
            )
    },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = color),
        navigationIcon = {
            if(showArrowBack){
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.back_arrow),
                    modifier = Modifier.clickable { onBackButtonClicked() }
                        .padding(8.dp)
                        .size(30.dp)

                )
            }
        }
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewRepoAppBar() {
    FirstComposeProjectTheme {
        RepoAppBar(title = R.string.details_appbar_title)
    }
}