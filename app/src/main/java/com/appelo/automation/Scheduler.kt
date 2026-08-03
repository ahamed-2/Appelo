package com.appelo.automation


import java.util.Timer
import java.util.TimerTask



class Scheduler {


    private val timer =
        Timer()



    fun schedule(
        delay: Long,
        task: () -> Unit
    ) {


        timer.schedule(
            object : TimerTask(){

                override fun run() {

                    task()

                }

            },
            delay
        )
    }
}
