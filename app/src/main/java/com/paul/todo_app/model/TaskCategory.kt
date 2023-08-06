package com.paul.todo_app.model

sealed class TaskCategory(var isSelected: Boolean = true) {
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object Other : TaskCategory()
}