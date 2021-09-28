package aula27.fragmentos_reviso

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class mais : Fragment() {

    private lateinit var botao: Button
    private lateinit var listener: IBotaoMais

    interface IBotaoMais{
        fun somar()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IBotaoMais) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "Fragmento não implementado")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_mais, container, false)
        botao = view.findViewById(R.id.botao)

        botao.setOnClickListener{
            listener?.somar()
        }
        // Inflate the layout for this fragment
        return view
    }
}