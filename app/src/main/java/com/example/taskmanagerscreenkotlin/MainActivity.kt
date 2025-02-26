package com.example.taskmanagerscreenkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerscreenkotlin.ui.theme.TaskManagerScreenKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerScreenKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskCompleteCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompleteCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            stringResource(id = R.string.tasks_completed_text),
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.additional_comments),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerScreenKotlinTheme {
        Greeting("Android")
    }
}