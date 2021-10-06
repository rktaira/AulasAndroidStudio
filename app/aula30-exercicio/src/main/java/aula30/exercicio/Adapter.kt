package aula30.exercicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class Adapter(private val listaContatos: MutableList<Contato>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView
        val numero: TextView
        val imagem: CircleImageView

        init {
            nome = view.findViewById(R.id.nome)
            numero = view.findViewById(R.id.numero)
            imagem = view.findViewById(R.id.imagem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        viewholder.nome.text = listaContatos[position].nome
        viewholder.numero.text = listaContatos[position].numero.toString()

        Picasso.get()
            .load(listaContatos[position].imagem)
            .into(viewholder.imagem)
    }

    override fun getItemCount()=listaContatos.size


}