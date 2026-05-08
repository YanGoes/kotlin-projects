# BookVault - Catálogo de Livros

Projeto desenvolvido em Kotlin para Android como atividade prática sobre conceitos fundamentais do desenvolvimento mobile.

## Proposta do aplicativo

O **BookVault** é um aplicativo simples de catálogo de livros.

Ele organiza os livros em duas telas principais:

- **Explorar**: mostra uma lista com 20 livros marcados como "Quero ler".
- **Biblioteca**: mostra uma lista com 10 livros marcados como "Lido".

A ideia do projeto é simular uma pequena coleção pessoal de livros, permitindo visualizar livros que o usuário quer ler e livros que já foram lidos.

## Objetivo da atividade

O projeto foi desenvolvido para demonstrar, na prática, o uso dos seguintes conceitos:

- Bottom Navigation
- Classe de dados em Kotlin
- Entidade
- RecyclerView
- Fragment
- Ciclo de vida de Activity ou Fragment

## Tecnologias utilizadas

- Kotlin
- Android Studio
- XML
- RecyclerView
- Fragments
- Bottom Navigation
- Material Components

## Funcionalidades

- Navegação entre telas usando Bottom Navigation.
- Tela Explorar com 20 livros marcados como "Quero ler".
- Tela Biblioteca com 10 livros marcados como "Lido".
- Exibição dos livros em RecyclerView.
- Uso de data class para representar os livros.
- Demonstração do ciclo de vida dos Fragments usando Log.d.

## Principais arquivos

- `activity_main.xml`: estrutura principal da tela, com a área dos Fragments e a Bottom Navigation.
- `bottom_nav_menu.xml`: menu inferior com as opções Explorar e Biblioteca.
- `MainActivity.kt`: controla a troca entre os Fragments.
- `Livro.kt`: contém a data class Livro, que também é a entidade principal do sistema.
- `item_livro.xml`: layout visual de cada item da lista.
- `LivroAdapter.kt`: liga os dados dos livros ao layout do RecyclerView.
- `ExploreFragment.kt`: tela Explorar, com os livros marcados como "Quero ler".
- `LibraryFragment.kt`: tela Biblioteca, com os livros marcados como "Lido".

## Entidade Livro

```kotlin
data class Livro(
    val id: Int,
    val titulo: String,
    val autor: String,
    val genero: String,
    val status: String
)