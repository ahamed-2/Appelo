package com.appelo.automation



class AutomationManager {


    private val planner =
        TaskPlanner()



    fun execute(
        command: String
    ) {


        val tasks =
            planner.createPlan(command)



        tasks.forEach {

            runTask(it)

        }
    }



    private fun runTask(
        task: Task
    ) {


        when(task.action) {


            "ALARM" -> {
                // Alarm module call হবে
            }


            "WEATHER" -> {
                // Weather API call হবে
            }


            "SMS" -> {
                // SMS module call হবে
            }

        }

    }
}
