package aula27.fragmentos_reviso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity(), mais.IBotaoMais, menos.IBotaoMenos, zerar.IBotaoZerar {

    private lateinit var mais: mais
    private lateinit var menos: menos
    private lateinit var zerar: zerar
    private lateinit var clicks: clicks
    private lateinit var contador: contador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mais = mais()
        menos = menos()
        zerar = zerar()
        clicks = clicks()
        contador = contador()

        supportFragmentManager.beginTransaction()
            .add(R.id.container1, mais)
            .add(R.id.container2, menos)
            .add(R.id.container3, zerar)
            .add(R.id.container4, clicks)
            .add(R.id.container5, contador)
            .commit()

    }


    override fun somar() {
        contador.contagem++
        contador.texto.text="CONTADOR: ${contador.contagem.toString()}"
        clicks.contaClicks++
        clicks.texto.setText("CLICKS: ${clicks.contaClicks.toString()}")
        clicks.texto.isVisible=true
        if(contador.contagem == 0) {
            contador.texto.isVisible=false
            zerar.botao.isVisible=false
        } else {
            contador.texto.isVisible=true
            zerar.botao.isVisible=true
        }
    }

    override fun subtrair() {
        contador.contagem--
        contador.texto.setText("CONTADOR: ${contador.contagem.toString()}")
        clicks.contaClicks++
        clicks.texto.setText("CLICKS: ${clicks.contaClicks.toString()}")
        clicks.texto.isVisible=true
        if(contador.contagem == 0) {
            contador.texto.isVisible=false
            zerar.botao.isVisible=false
        } else {
            contador.texto.isVisible=true
            zerar.botao.isVisible=true
        }
    }

    override fun zerarCont() {
        contador.contagem=0
        contador.texto.setText("CONTADOR: ${contador.contagem.toString()}")
        clicks.contaClicks++
        clicks.texto.setText("CLICKS: ${clicks.contaClicks.toString()}")
        contador.texto.isVisible=false
        zerar.botao.isVisible = false
    }


}