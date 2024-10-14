package com.karan.basiccalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var etNumber1:TextView?=null
    var etNumber2:TextView?=null
    var result:TextView?=null
    var btnADDITION: Button?=null
    var btnSUBTRACTION: Button?=null
    var btnDIVISION: Button?=null
    var btnMULTIPLY: Button?=null
    var clear:Button?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        etNumber1 = findViewById(R.id.et1)
        etNumber2 = findViewById(R.id.et2)
        result = findViewById(R.id.tvresult)
        btnADDITION = findViewById(R.id.btnADDITION)
        btnSUBTRACTION = findViewById(R.id.btnSUBTRACTION)
        btnMULTIPLY = findViewById(R.id.btnMULTIPLY)
        btnDIVISION = findViewById(R.id.btnDIVIDE)
        clear = findViewById(R.id.clear)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnADDITION?.setOnClickListener {
            result?.text="${etNumber1?.text.toString().toInt() + etNumber2?.text.toString().toInt()}"
        }
        btnSUBTRACTION?.setOnClickListener {
            result?.text="${etNumber1?.text.toString().toInt() - etNumber2?.text.toString().toInt()}"
        }
        btnMULTIPLY?.setOnClickListener {
            result?.text="${etNumber1?.text.toString().toInt() * etNumber2?.text.toString().toInt()}"
        }
        btnDIVISION?.setOnClickListener {
            result?.text="${etNumber1?.text.toString().toFloat() / etNumber2?.text.toString().toFloat()}"
        }
        clear?.setOnClickListener {
            result?.setText("0")
            etNumber1?.setText("0")
            etNumber2?.setText("0")
        }
    }
}