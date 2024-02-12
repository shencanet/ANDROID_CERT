package com.rja.explicitapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun sendText(view: View) {
        //intent explicito
        val intent = Intent(this, SecondActivity::class.java)

        //recoger el valor de la caja de texto
        val cajaTexto: EditText = findViewById(R.id.main_activity_et_text1)
        val mensaje = cajaTexto.text.toString()
        intent.putExtra("data", mensaje)
        //lanzar el intent
        startActivity(intent)
    }
}
