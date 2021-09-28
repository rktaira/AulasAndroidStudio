package com.example.aula23_ciclodevidaactivity

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.aula23_ciclodevidaactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Chamado na criação da activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = "On Create!"
        val duration = Toast.LENGTH_SHORT
        Log.i("Teste", "onCreate")
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Teste", "onStart")
        val toast = Toast.makeText(applicationContext, "On Start!", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("Teste", "onResume")
        val toast = Toast.makeText(applicationContext, "On Resume!", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onPause() {
        super.onPause()

        val toast = Toast.makeText(applicationContext, "On Pause!", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val text = "On Stop!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val text = "On Destroy!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}