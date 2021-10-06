package aula30.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterAlunos(val alunos: List<String>) :
    RecyclerView.Adapter<AdapterAlunos.AlunosViewHolder>() {

    class AlunosViewHolder(view:View): RecyclerView.ViewHolder(view) {
        val nomes: TextView
        init {
            nomes = view.findViewById(R.id.recyclerAqui)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunosViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)

        return AlunosViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: AlunosViewHolder, position: Int) {
        viewHolder.nomes.text = alunos[position]
    }

    override fun getItemCount(): Int {
        return alunos.size
    }

}