package aula30.exercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(private val listaItens: MutableList<Item>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView
        val preco: TextView
        val desc: TextView
        val imagem: ImageView

        init {
            nome = view.findViewById(R.id.nome)
            preco = view.findViewById(R.id.preco)
            desc = view.findViewById(R.id.desc)
            imagem = view.findViewById(R.id.imagem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        viewholder.nome.text = listaItens[position].nome
        viewholder.preco.text = listaItens[position].preco
        viewholder.desc.text = listaItens[position].desc

        Picasso.get()
            .load(listaItens[position].imagem)
            .into(viewholder.imagem)
    }

    override fun getItemCount(): Int {
        return listaItens.size
    }


}