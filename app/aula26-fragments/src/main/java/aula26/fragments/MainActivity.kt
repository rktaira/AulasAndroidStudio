package aula26.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Fragmento1.IFragmento1Listener, Fragmento2.IFragmento2Listener {

    lateinit var fragmento1: Fragmento1
    lateinit var fragmento2: Fragmento2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()
    }

    private fun initFragments() {

        fragmento1 = Fragmento1()
        fragmento2 = Fragmento2()

        supportFragmentManager.beginTransaction()
            .add(R.id.container1, fragmento1)
            .add(R.id.container2, fragmento2)
            .commit()

    }

    override fun enviarDados1(dados: String) {
        fragmento1.atualiza1(dados)
    }

    override fun enviarDados2(dados: String) {
        fragmento2.atualiza2(dados)
    }
}