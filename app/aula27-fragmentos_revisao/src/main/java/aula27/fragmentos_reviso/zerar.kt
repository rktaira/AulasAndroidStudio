package aula27.fragmentos_reviso

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible

class zerar : Fragment() {

    lateinit var botao: Button
    private lateinit var listener: IBotaoZerar

    interface IBotaoZerar{
        fun zerarCont()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IBotaoZerar) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "Fragmento não implementado")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_zerar, container, false)
        botao = view.findViewById(R.id.botao)
        botao.isVisible=false

        botao.setOnClickListener{
            listener?.zerarCont()
        }

        // Inflate the layout for this fragment
        return view
    }
}