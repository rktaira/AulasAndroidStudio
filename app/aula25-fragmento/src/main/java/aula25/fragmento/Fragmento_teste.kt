package aula25.fragmento

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragmento_teste : Fragment() {

    val name = this.javaClass.name

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("ciclo", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragmento_teste, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo", "onDetach")
    }

}
