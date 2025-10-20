package com.senai.tela_de_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // 1. Declaração das variáveis para os componentes da UI
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var textViewError: TextView
    private lateinit var textViewForgotPassword: TextView // Desafio 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout a ser usado

        // 2. Inicializa os componentes da UI, conectando as variáveis aos IDs do XML
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        textViewError = findViewById(R.id.textViewError)
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword) // Desafio 3

        // 3. Configura o listener de clique para o botão de login
        buttonLogin.setOnClickListener {
            performLogin() // Chama a função que contém a lógica de login
        }

        // Desafio 3: Configura o clique para o link "Esqueci a senha?"
        textViewForgotPassword.setOnClickListener {
            Toast.makeText(this, "Função de recuperação em breve!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun performLogin() {
        // Obtém o texto digitado nos campos
        val username = editTextUsername.text.toString().trim()
        val password = editTextPassword.text.toString().trim()

        // Reseta a mensagem de erro antes de uma nova tentativa
        textViewError.visibility = View.GONE

        // Validação 1: Verifica se o campo de usuário está vazio
        if (username.isEmpty()) {
            textViewError.text = "Por favor, insira seu nome de usuário ou e-mail."
            textViewError.visibility = View.VISIBLE
            return
        }

        // Desafio 2: Validação de formato de e-mail
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
            textViewError.text = "Por favor, insira um e-mail válido."
            textViewError.visibility = View.VISIBLE
            return
        }

        // Validação 2: Verifica se o campo de senha está vazio
        if (password.isEmpty()) {
            textViewError.text = "Por favor, insira sua senha."
            textViewError.visibility = View.VISIBLE
            return
        }

        // Desafio 2: Validação de tamanho mínimo de senha
        if (password.length < 6) {
            textViewError.text = "A senha deve ter pelo menos 6 caracteres."
            textViewError.visibility = View.VISIBLE
            return
        }

        // Simulação de login: credenciais fixas "teste@teste.com" e "123456"
        if (username == "teste@teste.com" && password == "123456") {
            // Login bem-sucedido!
            // Desafio 1: Navega para a HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Opcional: fecha a tela de login

        } else {
            // Credenciais inválidas
            textViewError.text = "Nome de usuário ou senha inválidos."
            textViewError.visibility = View.VISIBLE
        }
    }
}