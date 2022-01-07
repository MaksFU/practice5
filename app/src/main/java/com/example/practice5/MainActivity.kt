package com.example.practice5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun record(view: View){
        val event = findViewById<EditText>(R.id.vevent).getText()
        val time = findViewById<EditText>(R.id.vtime).getText()
        val date = findViewById<EditText>(R.id.vdata).getText()
        val note = findViewById<EditText>(R.id.post).getText()
        val str = "Записано!\nСобытие: ${event}\nДата: $date\nВремя: $time\nЗаметка: $note"
        val toast = Toast.makeText(this, str,Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM,0,0)
        toast.show()
        event.clear()
        time.clear()
        date.clear()
        note.clear()
    }

    fun moodChange(view: View){
        val b: RadioButton =findViewById(R.id.good)
        val img: ImageView =findViewById(R.id.mood)
            if(b.isChecked)
                img.setImageResource(R.drawable.cheerful)
            else
                img.setImageResource(R.drawable.cry)
    }
}





