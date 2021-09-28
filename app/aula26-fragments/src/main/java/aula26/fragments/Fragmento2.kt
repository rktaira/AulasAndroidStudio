package aula26.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragmento2 : Fragment() {

    interface IFragmento2Listener {
        fun enviarDados2(dados: String)
    }

    private var listener: IFragmento2Listener? = null
    lateinit var botao: Button
    lateinit var editText: EditText

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is IFragmento2Listener){
            listener = context
        } else {
            throw RuntimeException(context.toString())
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_fragmento2, container, false)
        botao = view.findViewById(R.id.botao)
        editText = view.findViewById(R.id.editText)

        botao.setOnClickListener {
            listener?.enviarDados2(editText.text.toString())
        }
        // Inflate the layout for this fragment
        return view
    }

    fun atualiza2(dados: String) {
        editText.setText(dados)
    }

}