package com.example.pracadomowa

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pracadomowa.ui.theme.PracaDomowaTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracaDomowaTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(title = {Text("Lista",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            color = Color(0xFFFFC0CB))
                        })
                    },
                    modifier = Modifier.fillMaxSize())
                    {
                        innerPadding -> Func(
                            modifier = Modifier.padding(innerPadding).fillMaxSize()
                        )
                    }
                }
            }
        }
    }

@Composable
fun Func(modifier: Modifier = Modifier) {
    val lista = listOf("Owca", "Kot", "Koń", "Lis", "Szop pracz")
    var inputText by remember { mutableStateOf("") }
    var displayedText by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       for(item in lista) {
           Text(
               text = item,
               fontSize = 18.sp,
               modifier = Modifier.padding(vertical = 7.dp)
           )
       }
        Spacer(modifier = Modifier.height(16.dp))
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = inputText,
                onValueChange = { inputText = it },
                label = { Text("Wprowadź tekst") },
                modifier = Modifier.weight(1f))

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    Toast.makeText(context,
                         inputText, Toast.LENGTH_SHORT).show()
                    displayedText = inputText
                }
            ) {
                Text("Wyświetl")
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Text(
            text = "Tekst: $displayedText",
            fontSize = 18.sp,
            color = Color(0xFFADD8E6),
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FuncPr() {
    PracaDomowaTheme {
        Func()
    }
}