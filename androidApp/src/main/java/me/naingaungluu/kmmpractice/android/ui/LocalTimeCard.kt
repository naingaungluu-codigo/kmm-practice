package me.naingaungluu.kmmpractice.android.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import me.naingaungluu.kmmpractice.android.theme.primaryColor
import me.naingaungluu.kmmpractice.android.theme.primaryDarkColor

@Composable
fun LocalTimeCard(city: String, time: String, date: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.White)
            .padding(8.dp)
    ) {

        Card(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Black),
            elevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // 1
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                primaryColor,
                                primaryDarkColor,
                            )
                        )
                    )
                    .padding(8.dp)
            ) {
                // 2
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    // 3
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        // 4
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(
                            "Your Location", style = typography.h4
                        )
                        Spacer(Modifier.height(8.dp))
                        // 5
                        Text(
                            city, style = typography.h2
                        )
                        Spacer(Modifier.height(8.dp))
                    }
                    // 6
                    Spacer(modifier = Modifier.weight(1.0f))
                    // 7
                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Spacer(modifier = Modifier.weight(1.0f))
                        // 8
                        Text(
                            time, style = typography.h1
                        )
                        Spacer(Modifier.height(8.dp))
                        // 9
                        Text(
                            date, style = typography.h3
                        )
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}
