package com.example.mvvmpattern.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmpattern.R
import com.example.mvvmpattern.model.TodoModel
import com.example.mvvmpattern.view.adapter.TodoListAdapter
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var mTodoListAdapter : TodoListAdapter
    private val mTodoitems : ArrayList<TodoModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTodoitems.run {
            add(TodoModel("안드로이드 포스팅1", " Kotlin + Mvvm", Date().time))
            add(TodoModel("안드로이드 포스팅2", " Kotlin + Mvvm", Date().time))
            add(TodoModel("안드로이드 포스팅3", " Kotlin + Mvvm", Date().time))
        }

        initRecyclerView()
    }

    private fun initRecyclerView(){
        mTodoListAdapter = TodoListAdapter(mTodoitems)
        findViewById<RecyclerView>(R.id.rl_todo_list).run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mTodoListAdapter
        }

    }
}