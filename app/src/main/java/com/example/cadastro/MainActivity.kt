package com.example.cadastro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)
        var sexo : String

        amb.salvarBt.setOnClickListener {
            if (amb.masculinoRb.isChecked){
                sexo = "Masculino"
            }
            else{
                sexo = "Feminino"
            }
            var formulario = Formulario(amb.inputNameEt.text.toString(), amb.inputTelEt.text.toString(), amb.inputEmailEt.text.toString(), amb.emailCb.isChecked, sexo, amb.cidadeEt.text.toString(), amb.ufSpinner.selectedItem.toString() )

            Toast.makeText(this@MainActivity, formulario.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}