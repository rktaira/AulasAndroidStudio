package aula30.exercicio2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class AdapterBebidas(var listaItens: MutableList<Item>) :
    RecyclerView.Adapter<AdapterBebidas.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView= view.findViewById(R.id.nome)
        val preco: TextView= view.findViewById(R.id.preco)
        val imagem: ImageView= view.findViewById(R.id.imagem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.bebida_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        viewholder.nome.text = listaItens[position].nome
        viewholder.preco.text = listaItens[position].preco

        Picasso.get()
            .load(listaItens[position].imagem)
            .into(viewholder.imagem)
    }

    override fun getItemCount(): Int {
        return listaItens.size
    }


}