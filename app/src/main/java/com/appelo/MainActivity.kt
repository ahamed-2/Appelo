package com.appelo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.appelo.ui.AppNavigation
import com.appelo.ui.AppeloTheme


class MainActivity : ComponentActivity(){


    override fun onCreate(
        savedInstanceState: Bundle?
    ){

        super.onCreate(savedInstanceState)



        setContent {


            AppeloTheme {


                AppNavigation()


            }

        }

    }

}
