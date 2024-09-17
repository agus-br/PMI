package com.example.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column

import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }