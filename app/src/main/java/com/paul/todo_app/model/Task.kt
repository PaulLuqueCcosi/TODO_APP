package com.paul.todo_app.model

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)