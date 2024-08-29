package com.mkaram.firstcomposeproject.presentation.screens.error_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkaram.firstcomposeproject.R
import com.mkaram.firstcomposeproject.presentation.commonComponents.RepoAppBar
import com.mkaram.firstcomposeproject.presentation.screens.error_screen.components.errorCodesReversed
import com.mkaram.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.mkaram.firstcomposeproject.ui.theme.LightGreen

@Composable
fun ErrorScreenPage(
    errorCode: String,
    onPressingRetry: () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            RepoAppBar(
                title = R.string.github_repo_main_title,
                showArrowBack = false
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .padding(bottom = 8.dp, top = 8.dp)
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ErrorImage(modifier = Modifier.padding(top = 80.dp),R.drawable.error_2)

            Text(
                text = stringResource(id = R.string.something_went_wrong),
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.titleLarge.fontSize
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = errorCodesReversed[errorCode]?: "UnknownError",
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(100.dp))

            RetryButton(onPressingRetry)
        }
    }
}


@Composable
fun ErrorImage(modifier: Modifier = Modifier,id:Int) {
    Box(
        modifier = modifier.size(400.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = id),
            contentDescription = stringResource(id = R.string.error_image_description),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

    }
}


@Composable
fun RetryButton(onPressingRetry: () -> Unit) {
    OutlinedButton(
        onClick = { onPressingRetry() },
        modifier = Modifier
            .size(width = 300.dp, height = 50.dp),
        border = BorderStroke(2.dp, LightGreen),
        shape = RectangleShape,

        ) {
        Text(
            text = stringResource(id = R.string.button_text_retry),
            color = LightGreen,
            fontSize = MaterialTheme.typography.titleLarge.fontSize

        )
    }
}

@Preview
@Composable
fun PreviewErrorScreenPage() {
    FirstComposeProjectTheme {
        ErrorScreenPage(errorCode = "505", onPressingRetry = {})
    }
}
