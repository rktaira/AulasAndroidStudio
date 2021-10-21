package aula30.exercicio2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Bebidas.newInstance] factory method to
 * create an instance of this fragment.
 */
class Bebidas : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager

    val listaItens: MutableList<Item> = mutableListOf(
        Item("Pastel", "R$10,00", "descrição", "https://www.comidaereceitas.com.br/wp-content/uploads/2007/11/Pastel_feiraaoo.jpg"),
        Item("Coxinha", "R$10,00", "descrição", "https://s2.glbimg.com/3yEPNnGtV9kKZHFEXD8zoz7CZAI=/0x0:1280x854/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_e84042ef78cb4708aeebdf1c68c6cbd6/internal_photos/bs/2020/k/C/CyeFFuSSKLrOop79XWoQ/coxinha.jpeg"),
        Item("Bolinha de Queijo", "R$10,00", "descrição", "https://cdn.panelinha.com.br/receita/962766000000-Bolinha-de-queijo.jpg"),
        Item("Empada", "R$10,00", "descrição", "https://minhasdelicias.com/wp-content/uploads/2020/09/empafran.jpg")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_salgados, container, false)

        recyclerView = view.findViewById(R.id.recycler)
        layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = AdapterBebidas(listaItens)

        return view
    }


}
