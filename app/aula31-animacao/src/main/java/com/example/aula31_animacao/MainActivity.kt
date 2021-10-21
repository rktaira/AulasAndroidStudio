package com.example.aula31_animacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // para não usar findviewbyid em tudo, colar
    // apply plugin: 'kotlin-android-extensions'
    // nas dependencies do gradle
    // obs.: Já é considerado "deprecated"

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

        anima.setOnClickListener {
            animaciclo(anima)
        }





    }
}