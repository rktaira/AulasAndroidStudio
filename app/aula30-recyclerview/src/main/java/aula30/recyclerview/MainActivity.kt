package aula30.recyclerview

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val recycler by lazy{
        RecyclerView(this)
    }

    private val manager by lazy{
        LinearLayoutManager(this, RecyclerView.VERTICAL , false)
    }
//    ou  GridLayoutManager{}

    private val alunos = listOf(
        "Rafa",
        "Henrique",
        "Andréia",
        "Daniel",
        "Lucas",
        "Julia",
        "Cleiton"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(recycler)
        recycler.layoutManager = manager
        recycler.adapter = AdapterAlunos(alunos)
    }




}