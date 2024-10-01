package com.example.contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.contador.ui.theme.ContadorTheme
import com.example.contador.view.MainView
import com.example.contador.view.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ViewModel: MainViewModel = MainViewModel()

        enableEdgeToEdge()
        setContent {
            ContadorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier.padding(innerPadding), viewModel = ViewModel)
                }
            }
        }
    }
}