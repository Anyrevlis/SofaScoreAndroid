package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.textView)
        var button : Button = findViewById(R.id.button)
        var visible: Boolean = true;

        textView.text = "Hello World"
        button.text = "Hide"

        button.setOnClickListener {

            if(visible) {
                textView.visibility = View.GONE
                visible = false;
                button.text = "Show"
            } else {
                textView.visibility = View.VISIBLE
                visible = true;
                button.text = "Hide"
            }
        }
    }
}