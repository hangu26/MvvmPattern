package com.example.mvvmpattern.view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmpattern.R
import com.example.mvvmpattern.model.TodoModel

class TodoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val title = view.findViewById<TextView>(R.id.tv_todo_title)
    val description = view.findViewById<TextView>(R.id.tv_todo_description)
    val createdDate = view.findViewById<TextView>(R.id.tv_todo_created_date)

    fun bind(todoModel : TodoModel){
        title.text = todoModel.title
        description.text = todoModel.description
        createdDate.text = ("yyyy.MM.dd HH:")
    }
}//pr 첫번째