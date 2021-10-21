package aula30.exercicio

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class Adapter(val context: Context, private val listaContatos: MutableList<Contato>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cartao: ConstraintLayout
        val nome: TextView
        val numero: TextView
        val imagem: CircleImageView

        init {
            cartao = view.findViewById(R.id.cartao)
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
        val nomeCont: Contato = listaContatos[position]
        viewholder.nome.text = listaContatos[position].nome
        viewholder.numero.text = listaContatos[position].numero.toString()

        Picasso.get()
            .load(listaContatos[position].imagem)
            .into(viewholder.imagem)

        viewholder.cartao.setOnClickListener{
            (context as IOnClick).onClick(position)
            context.startActivity(
                Intent(context, Activity2::class.java)
                    .putExtra("nome", nomeCont.nome)
            )
            Toast.makeText(context,"clicou", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount()=listaContatos.size

}