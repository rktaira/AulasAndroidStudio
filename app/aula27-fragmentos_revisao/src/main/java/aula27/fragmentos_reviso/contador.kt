package aula27.fragmentos_reviso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible

class contador : Fragment() {

    var contagem: Int = 0
    lateinit var texto: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_contador, container, false)

        texto = view.findViewById(R.id.contador)
        texto.text="CONTADOR: 0"

       texto.isVisible=false

        return view
    }


}