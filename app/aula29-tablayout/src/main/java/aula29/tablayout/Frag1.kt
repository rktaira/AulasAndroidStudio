package aula29.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class Frag1 : Fragment() {

    lateinit var item1: TextView
    lateinit var preco1: TextView
    lateinit var imagem1: ImageView
    lateinit var desc1: TextView

    lateinit var item2: TextView
    lateinit var preco2: TextView
    lateinit var imagem2: ImageView
    lateinit var desc2: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_frag1, container, false)
        // Inflate the layout for this fragment
        item1 = view.findViewById(R.id.item1)
        preco1 = view.findViewById(R.id.preco1)
        imagem1 = view.findViewById(R.id.imagem1)
        desc1 = view.findViewById(R.id.desc1)

        item2 = view.findViewById(R.id.item2)
        preco2 = view.findViewById(R.id.preco2)
        imagem2 = view.findViewById(R.id.imagem2)
        desc2 = view.findViewById(R.id.desc2)


        return view
    }

}