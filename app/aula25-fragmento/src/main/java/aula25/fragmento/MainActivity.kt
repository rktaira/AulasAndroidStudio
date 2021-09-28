package aula25.fragmento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val name = this.javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(name, "On Create!")
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, Fragmento_teste())
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo", "On Start!")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo", "On Resume!")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo", "On Pause!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo", "On Destroy!")
    }
}