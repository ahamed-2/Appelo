package com.appelo.automation


class TaskPlanner {


    fun createPlan(
        command: String
    ): List<Task> {


        val tasks = mutableListOf<Task>()


        if(command.contains("alarm", true)) {

            tasks.add(
                Task(
                    title = "Create Alarm",
                    action = "ALARM"
                )
            )
        }


        if(command.contains("weather", true)) {

            tasks.add(
                Task(
                    title = "Check Weather",
                    action = "WEATHER"
                )
            )
        }


        if(command.contains("message", true)) {

            tasks.add(
                Task(
                    title = "Send Message",
                    action = "SMS"
                )
            )
        }


        return tasks
    }
}
