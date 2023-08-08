package com.paul.todo_app.Categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paul.todo_app.R
import com.paul.todo_app.model.TaskCategory

class CategoriesAdapter(private val categories: List<TaskCategory>, private val onItemSelected:(Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }

    override fun getItemCount() = categories.size
}