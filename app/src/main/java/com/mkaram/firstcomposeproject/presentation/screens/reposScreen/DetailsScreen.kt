package com.mkaram.firstcomposeproject.presentation.screens.reposScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mkaram.firstcomposeproject.R

@Composable
fun Details() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White)
            .padding(bottom = 24.dp, top = 64.dp)

    )
    {
        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "google image"
        )
        Text(
            text = "language",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Row(
            modifier = Modifier.padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(text = "1525", Modifier.padding(end = 6.dp))
            Image(
                painter = painterResource(id = R.drawable.star_ic),
                contentDescription = "star image",
                Modifier
                    .padding(end = 8.dp), colorFilter = ColorFilter.tint(color = Color.Yellow)

            )
            Text(text = "Python", Modifier.padding(end = 4.dp))

            Canvas(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(30.dp)
            ) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawCircle(
                    color = Color.Blue,
                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                    radius = size.minDimension / 4
                )
            }
            Text(text = "347", Modifier.padding(end = 6.dp))
            Image(
                painter = painterResource(id = R.drawable.fork),
                contentDescription = "fork image", Modifier.size(20.dp)
            )

        }
        Text(
            text = "Shared repository for open-sourced\n" +
                    "projects from the Google A1\n" +
                    "Language team."
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { /*TODO*/ },
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

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewDetails(
) {
    Details()
}