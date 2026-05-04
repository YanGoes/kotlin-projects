package br.com.exemplo.catalogodelivros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LivroAdapter(
    private val livros: List<Livro>
) : RecyclerView.Adapter<LivroAdapter.LivroViewHolder>() {

    class LivroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitulo: TextView = itemView.findViewById(R.id.txtTitulo)
        val txtAutor: TextView = itemView.findViewById(R.id.txtAutor)
        val txtDetalhes: TextView = itemView.findViewById(R.id.txtDetalhes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LivroViewHolder {
        val item = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_livro, parent, false)

        return LivroViewHolder(item)
    }

    override fun onBindViewHolder(holder: LivroViewHolder, position: Int) {
        val livro = livros[position]

        holder.txtTitulo.text = livro.titulo
        holder.txtAutor.text = "Autor: " + livro.autor
        holder.txtDetalhes.text = livro.genero + " | " + livro.status
    }

    override fun getItemCount(): Int {
        return livros.size
    }
}