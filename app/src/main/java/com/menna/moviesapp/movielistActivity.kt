package com.menna.moviesapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListActivity : AppCompatActivity() {

    private lateinit var usernameTextView: TextView
    private lateinit var movieRecyclerView: RecyclerView
    private lateinit var moreButton: Button
    private lateinit var movieAdapter: MovieAdapter
    private val movieList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        usernameTextView = findViewById(R.id.usernameTextView)
        movieRecyclerView = findViewById(R.id.movieRecyclerView)
        moreButton = findViewById(R.id.moreButton)

        val username = intent.getStringExtra("USERNAME")
        usernameTextView.text = "Welcome, $username"
    }
}


