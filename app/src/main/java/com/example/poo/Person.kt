package com.example.poo

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
import com.example.poo.ui.theme.POOTheme

open class Person(var name: String, var passport: String? = null) {
    var alive: Boolean = true;

    fun die(){
        alive = false
    }
}

class Athlete(name: String, passport: String?, var sport: String): Person(name, passport){

}