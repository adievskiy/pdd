package com.example.pdd

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var infoTV: TextView
    private lateinit var checkBoxCB: CheckBox
    private lateinit var textPddTV: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        infoTV = findViewById(R.id.infoTV)
        checkBoxCB = findViewById(R.id.checkBoxCB)
        textPddTV = findViewById(R.id.textPddTV)

        checkBoxCB.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                infoTV.text = "Правила дорожного движения"
                textPddTV.text = "\"Автопоезд\" - механическое транспортное средство, сцепленное с прицепом (прицепами)."
            } else {
                infoTV.text = "Информация"
                textPddTV.text = ""
            }
        }
    }
}