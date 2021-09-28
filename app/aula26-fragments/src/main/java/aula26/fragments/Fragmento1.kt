package aula26.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragmento1 : Fragment() {

    interface IFragmento1Listener {
        fun enviarDados1(dados: String)
    }

    private var listener: IFragmento1Listener? = null
    lateinit var botao: Button
    lateinit var editText: EditText

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is IFragmento1Listener){
            listener = context
        } else {
            throw RuntimeException(context.toString())
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_fragmento1, container, false)
        botao = view.findViewById(R.id.botao)
        editText = view.findViewById(R.id.editText)
        botao.setOnClickListener {
            listener?.enviarDados1(editText.text.toString())
        }

        // Inflate the layout for this fragment
        return view
    }

    fun atualiza1(dados: String) {
        editText.setText(dados)
    }

}