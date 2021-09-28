package aula24.Ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var email: EditText = findViewById(R.id.email)
        var senha: EditText = findViewById(R.id.senha)

        botao = findViewById(R.id.botao)
        botao.setOnClickListener {
            if (email.text.toString().contains("@") &&
                email.text.toString().contains(".") &&
                email.text.toString() != null &&
                senha.text != null
            ) {
                var intent = Intent(this, BoasVindas::class.java)
                intent.putExtra("email", email.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Erro: Verifique os dados informados!", Toast.LENGTH_SHORT).show()
            }

        }

    }


}