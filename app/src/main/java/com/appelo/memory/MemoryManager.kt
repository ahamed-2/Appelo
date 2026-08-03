package com.appelo.memory

class MemoryManager {

    private val memories =
        mutableListOf<Memory>()


    fun saveMemory(
        key: String,
        value: String
    ) {

        memories.add(
            Memory(
                key = key,
                value = value
            )
        )
    }


    fun getMemory(
        key: String
    ): String? {

        return memories
            .find { it.key == key }
            ?.value
    }
}
