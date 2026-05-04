package br.com.exemplo.catalogodelivros

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LibraryFragment : Fragment() {

    private val tagCiclo = "CICLO_BOOKVAULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tagCiclo, "LibraryFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(tagCiclo, "LibraryFragment: onCreateView")

        val tela = inflater.inflate(R.layout.fragment_library, container, false)

        val recycler = tela.findViewById<RecyclerView>(R.id.rvBiblioteca)

        val minhaBiblioteca = listOf(
            Livro(1, "Memórias Póstumas de Brás Cubas", "Machado de Assis", "Clássico", "Lido"),
            Livro(2, "Vidas Secas", "Graciliano Ramos", "Drama", "Lido"),
            Livro(3, "Auto da Compadecida", "Ariano Suassuna", "Comédia", "Lido"),
            Livro(4, "Grande Sertão: Veredas", "João Guimarães Rosa", "Regionalista", "Lido"),
            Livro(5, "A Moreninha", "Joaquim Manuel de Macedo", "Romance", "Lido"),
            Livro(6, "O Cortiço", "Aluísio Azevedo", "Naturalismo", "Lido"),
            Livro(7, "O Alienista", "Machado de Assis", "Clássico", "Lido"),
            Livro(8, "Macunaíma", "Mário de Andrade", "Modernismo", "Lido"),
            Livro(9, "A Hora da Estrela", "Clarice Lispector", "Romance", "Lido"),
            Livro(10, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fantasia", "Lido")
        )

        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = LivroAdapter(minhaBiblioteca)

        return tela
    }

    override fun onStart() {
        super.onStart()
        Log.d(tagCiclo, "LibraryFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tagCiclo, "LibraryFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tagCiclo, "LibraryFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tagCiclo, "LibraryFragment: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tagCiclo, "LibraryFragment: onDestroy")
    }
}