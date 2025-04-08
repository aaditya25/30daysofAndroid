package com.example.a30daysofandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofandroid.model.UnitRepository
import com.example.a30daysofandroid.ui.theme._30DaysOfAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    _30DaysOfAndroidApp()
                }
            }
        }
    }
}

@Composable
fun _30DaysOfAndroidApp() {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        TopAppBar()
    }) {
        val units = UnitRepository.Units
        UnitList(units = units, Modifier.padding(it))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row {
                Text(
                    text = "Android Learnings",
                    style = MaterialTheme.typography.displaySmall,
                    modifier = modifier.padding(13.dp),
                )
            }
        }, modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _30DaysOfAndroidTheme {
        _30DaysOfAndroidApp()
    }
}