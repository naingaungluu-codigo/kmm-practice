package me.naingaungluu.kmmpractice.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import me.naingaungluu.kmmpractice.android.ui.MainView

fun greet(): String {
    return "Hello"
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Napier.base(DebugAntilog())
        setContent {
            MainView {
                TopAppBar(
                    title = {
                        when (it) {
                            0 -> Text(text = "World Clocks")
                            else -> Text(text = "Find Meeting")
                        }
                    }
                )
            }
        }
    }
}
