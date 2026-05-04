package br.com.exemplo.catalogodelivros

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExploreFragment : Fragment() {

    private val tagCiclo = "CICLO_BOOKVAULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tagCiclo, "ExploreFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(tagCiclo, "ExploreFragment: onCreateView")

        val tela = inflater.inflate(R.layout.fragment_explore, container, false)

        val recycler = tela.findViewById<RecyclerView>(R.id.rvExplorar)

        val livrosExplorar = listOf(
            Livro(1, "Dom Casmurro", "Machado de Assis", "Romance", "Quero ler"),
            Livro(2, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fantasia", "Quero ler"),
            Livro(3, "Capitães da Areia", "Jorge Amado", "Drama", "Quero ler"),
            Livro(4, "A Hora da Estrela", "Clarice Lispector", "Romance", "Quero ler"),
            Livro(5, "O Cortiço", "Aluísio Azevedo", "Naturalismo", "Quero ler"),
            Livro(6, "Iracema", "José de Alencar", "Romance", "Quero ler"),
            Livro(7, "Senhora", "José de Alencar", "Romance", "Quero ler"),
            Livro(8, "O Alienista", "Machado de Assis", "Clássico", "Quero ler"),
            Livro(9, "Macunaíma", "Mário de Andrade", "Modernismo", "Quero ler"),
            Livro(10, "Os Sertões", "Euclides da Cunha", "Histórico", "Quero ler"),
            Livro(11, "A Moreninha", "Joaquim Manuel de Macedo", "Romance", "Quero ler"),
            Livro(12, "O Guarani", "José de Alencar", "Romance", "Quero ler"),
            Livro(13, "Triste Fim de Policarpo Quaresma", "Lima Barreto", "Romance", "Quero ler"),
            Livro(14, "A Escrava Isaura", "Bernardo Guimarães", "Romance", "Quero ler"),
            Livro(15, "Sagarana", "João Guimarães Rosa", "Contos", "Quero ler"),
            Livro(16, "Quincas Borba", "Machado de Assis", "Romance", "Quero ler"),
            Livro(17, "Memórias de um Sargento de Milícias", "Manuel Antônio de Almeida", "Romance", "Quero ler"),
            Livro(18, "Clara dos Anjos", "Lima Barreto", "Romance", "Quero ler"),
            Livro(19, "Lucíola", "José de Alencar", "Romance", "Quero ler"),
            Livro(20, "Esaú e Jacó", "Machado de Assis", "Romance", "Quero ler")
        )

        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = LivroAdapter(livrosExplorar)

        return tela
    }

    override fun onStart() {
        super.onStart()
        Log.d(tagCiclo, "ExploreFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tagCiclo, "ExploreFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tagCiclo, "ExploreFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tagCiclo, "ExploreFragment: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tagCiclo, "ExploreFragment: onDestroy")
    }
}