package com.rja.explicitapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.extras ?: return

        val mensaje = data.getString("data")
        val txMensaje: TextView = findViewById(R.id.second_activity_tv_text1)
        txMensaje.text = mensaje
    }


}
