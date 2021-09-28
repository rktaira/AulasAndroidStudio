package aula24.Ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BoasVindas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boas_vindas)

        var mensagem: TextView = findViewById(R.id.mensagem)

        val extras: Bundle? = intent.extras
        mensagem.text = "Bem vindo ${extras?.getString("email")}"


    }
}