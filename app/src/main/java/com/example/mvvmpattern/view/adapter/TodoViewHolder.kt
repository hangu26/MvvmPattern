package com.example.mvvmpattern.view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmpattern.R
import com.example.mvvmpattern.model.TodoModel
import java.text.SimpleDateFormat
import java.util.*

class TodoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val title = view.findViewById<TextView>(R.id.tv_todo_title)
    val description = view.findViewById<TextView>(R.id.tv_todo_description)
    val createdDate = view.findViewById<TextView>(R.id.tv_todo_created_date)

    fun bind(todoModel : TodoModel){
        title.text = todoModel.title
        description.text = todoModel.description
        createdDate.text = todoModel.createdData.toDateString("yyyy.MM.dd HH:mm")
    }

    fun Long.toDateString(format: String) : String{
        val simpleDateFormat = SimpleDateFormat(format)
        return simpleDateFormat.format((Date(this)))
    }

}//pr 첫번째
