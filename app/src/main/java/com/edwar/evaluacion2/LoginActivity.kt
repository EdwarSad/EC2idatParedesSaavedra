package com.edwar.evaluacion2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Referencias a los elementos del diseño
        usernameEditText = findViewById(R.id.txt_user)
        passwordEditText = findViewById(R.id.txt_pass)
        loginButton = findViewById(R.id.boton)

        // Configuración del OnClickListener para el botón de inicio de sesión
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Validación de los datos ingresados
            if (username == "A18004486@idat.edu.pe" && password == "123456") {
                Toast.makeText(this,"Login Iniciado", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this,"Usuario o Password Incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}