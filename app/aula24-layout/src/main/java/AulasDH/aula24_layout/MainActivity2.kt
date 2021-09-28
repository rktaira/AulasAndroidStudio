package AulasDH.aula24_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var campo1: TextView = findViewById(R.id.nomeRecebido)
        var campo2: TextView = findViewById(R.id.mailRecebido)

        val extras: Bundle? = intent.extras
        campo1.text = "Nome do usuário: ${extras?.getString("nome")}"
        campo2.text = "Email do usuário: ${extras?.getString("mail")}"

    }
}