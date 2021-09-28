package com.caren.studysession928

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listOfItems = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = RecyclerViewAdapter(listOfItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 1. Add another activity - EditActivity (new screen, to edit items in the RecyclerView)
        // 1a. Add code so that user can go to EditActivity when an item in the list is clicked

        // 2. Edit items in my list through the new activity
        // 3. Go back to my main activity to see the edited item

        // A new task will be added when the 'Save Button' is clicked
        findViewById<Button>(R.id.saveButton).setOnClickListener {
            // Grab the text from the EdiText view
            val textInputted = findViewById<EditText>(R.id.editText).text.toString()
            // Add it to our list
            listOfItems.add(textInputted)
            // Refresh the RecyclerView
            adapter.notifyDataSetChanged()
        }

    }
}