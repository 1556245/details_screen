package com.mkaram.firstcomposeproject.presentation.screens.reposScreen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkaram.firstcomposeproject.R
import com.mkaram.firstcomposeproject.presentation.screens.commonComponents.RepoAppBar
import com.mkaram.firstcomposeproject.presentation.screens.reposScreen.components.RepoDetailsItem
import com.mkaram.firstcomposeproject.presentation.screens.reposScreen.components.ScreenData
import com.mkaram.firstcomposeproject.ui.theme.FirstComposeProjectTheme

@Composable
fun Details(
    screenData: ScreenData,
    modifier: Modifier,
) {
    Column {
        RepoAppBar(title = R.string.details_appbar_title)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {


            Image(

                painter = painterResource(id = screenData.imgUrl),
                modifier = Modifier.size(150.dp),
                contentDescription = screenData.description
            )
            Text(
                text = screenData.name,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,


                ) {
                RepoDetailsItem(screenData.stars,
                    icon = {
                        Icon(painter = painterResource(id = R.drawable.star_ic), contentDescription ="" ,
                            tint = Color.Yellow,
                        )
                    }
                )

                RepoDetailsItem(title = screenData.language,
                    icon = {
                        Canvas(modifier = Modifier.size(20.dp)){
                            drawCircle(Color.Blue)
                        }
                    }
                )


                RepoDetailsItem(title = screenData.forks) {
                    Image(painter = painterResource(id = R.drawable.fork)
                        , contentDescription = "" ,
                        modifier = Modifier.size(20.dp)
                    )
                }

            }
            Text(
                text = screenData.description
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(Color.Blue),
            ) {
                Text(
                    text = "Show Issues",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }

}

val screenData = ScreenData(
    name = "language",
    language = "Python",
    imgUrl = R.drawable.google,
    forks = "347",
    stars = "1525",
    description = "this is the description of the screen ," +
            " it must be clear here  and I am going to explain everything here"

)

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewDetails(
) {
    FirstComposeProjectTheme {
        Details(screenData = screenData, modifier = Modifier)
    }
}