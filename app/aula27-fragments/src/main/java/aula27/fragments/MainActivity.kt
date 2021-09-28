package aula27.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Login.ILoginListener {

    private lateinit var login: Login
    private lateinit var cadastro: Cadastro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login= Login()
        cadastro = Cadastro()
        supportFragmentManager.beginTransaction()
            .add(R.id.containerA, login)
            .add(R.id.containerB, cadastro)
            .commit()
    }

    override fun cadastrar(dados: Array<String>) {
        cadastro.recebe(dados)
    }

}