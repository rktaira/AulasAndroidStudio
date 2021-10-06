package aula30.exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//https://github.com/hdodenhof/CircleImageView
//https://github.com/square/picasso


class MainActivity : AppCompatActivity() {


    private val recycler by lazy{
        RecyclerView(this)
    }

    private val manager by lazy {
        LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    val listaContatos: MutableList<Contato> = mutableListOf(
        Contato("Contato Teste 1", "1234-5678", "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-5.jpg"),
        Contato("Contato Teste 2", "4561-8754", "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
        Contato("Contato Teste 3", "1235-1268", "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
        Contato("Contato Teste 4", "7526-7531", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Video-Game-Controller-Icon-IDV-green.svg/1024px-Video-Game-Controller-Icon-IDV-green.svg.png"),
        Contato("Contato Teste 5", "1238-7895", "https://www.showmetech.com.br/wp-content/uploads//2021/02/capa-dog.png"),
        Contato("Contato Teste 6", "7946-7290", "https://agrafica.com.br/wp-content/uploads/2016/01/resolucao_300dpi.jpg"),
        Contato("Contato Teste 7", "3458-1230", "https://icon-library.com/images/22215-dog.ico.ico")

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(recycler)

        recycler.layoutManager = manager
        recycler.adapter = Adapter(listaContatos)
    }
}