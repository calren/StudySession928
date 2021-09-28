package com.caren.studysession928

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val dataPassedToUs = intent.getStringExtra("string")
        Log.i("Caren", "data: " + dataPassedToUs)

        findViewById<EditText>(R.id.editText).setText(dataPassedToUs)
    }
}