package com.example.aula31_exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var circulo: ImageView

    fun animaciclo(objeto: ImageView){
        objeto.animate()
            .scaleX(1.25f)
            .scaleY(1.25f)
            .alpha(0f)
            .setDuration(250)
            .withEndAction{
                objeto.animate()
                    .scaleX(1f)
                    .scaleY(1f)
                    .alpha(1f)
                    .setDuration(0)
//                .withEndAction {
//                    animaciclo(objeto)
//                }
            }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circulo = findViewById(R.id.circulo)

        circulo.setOnClickListener {
            animaciclo(circulo)
        }
    }
}