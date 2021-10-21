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
 * Use the [Doces.newInstance] factory method to
 * create an instance of this fragment.
 */
class Doces : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager

    val listaItens: MutableList<Item> = mutableListOf(
        Item("Bolo", "R$10,00", "descrição", "https://img.itdg.com.br/tdg/images/recipes/000/048/083/329518/329518_original.jpg?mode=crop&width=710&height=400"),
        Item("Pudim", "R$10,00", "descrição", "https://www.radiotucunare.com.br/wp-content/uploads/2021/07/pudim-de-leite.jpg"),
        Item("Cocada", "R$10,00", "descrição", "https://i.ytimg.com/vi/qNgsJ8VbzkI/maxresdefault.jpg"),
        Item("Quindim", "R$10,00", "descrição", "https://www.comidaereceitas.com.br/img/sizeswp/1200x675/2010/03/quindim_baiano.jpg")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_salgados, container, false)

        recyclerView = view.findViewById(R.id.recycler)
        layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = Adapter(listaItens)

        return view
    }


}