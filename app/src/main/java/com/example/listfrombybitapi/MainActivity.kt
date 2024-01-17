package com.example.listfrombybitapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.listfrombybitapi.ui.theme.ListFromBybitApiTheme
import com.example.listfrombybitapi.view.list
import com.example.listfrombybitapi.viewmodel.BybitViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListFromBybitApiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val bybitViewModel: BybitViewModel by viewModels()

                    list(bybitViewModel)
                }
            }
        }
    }
}

