package AulasDH.aula24_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text1: TextView = findViewById(R.id.text1)
        var text2: TextView = findViewById(R.id.text2)

        botao = findViewById(R.id.botao)
        botao.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("nome", text1.text.toString())
            intent.putExtra("mail", text2.text.toString())
            startActivity(intent)
        }
    }
}