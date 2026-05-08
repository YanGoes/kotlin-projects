# 📚 BookVault

Aplicativo Android de catálogo pessoal de livros, desenvolvido em Kotlin como projeto prático da disciplina de desenvolvimento Android.

## 📱 Sobre o App

O **BookVault** permite visualizar uma lista de livros organizada por título, autor, gênero e status de leitura.

A navegação é feita por uma **Bottom Navigation Bar**, que alterna entre duas telas principais do app:

- **Explorar** — exibe uma lista de livros que o usuário quer ler.
- **Biblioteca** — exibe uma lista de livros que já foram lidos.

O objetivo do aplicativo é simular uma biblioteca pessoal simples, separando livros com status **"Quero ler"** e livros com status **"Lido"**.

## 🚀 Funcionalidades

- Lista de livros com RecyclerView
- Navegação entre telas com Bottom Navigation
- Tela **Explorar** com 20 livros marcados como "Quero ler"
- Tela **Biblioteca** com 10 livros marcados como "Lido"
- Exibição de título, autor, gênero e status de cada livro
- Demonstração do ciclo de vida via Logcat

## 🛠️ Tecnologias e Conceitos Utilizados

### Kotlin

Linguagem principal do projeto. Todo o código foi escrito em Kotlin, utilizando recursos como classes, listas, funções sobrescritas e `data class`.

### XML

Utilizado para construir os layouts do aplicativo, como a tela principal, os Fragments e o layout de cada item da lista.

### Fragment

Um Fragment é um componente de tela que vive dentro de uma Activity. Em vez de criar uma Activity para cada tela, o Fragment permite reutilizar e trocar partes da interface sem recriar tudo.

O projeto possui dois Fragments:

- **ExploreFragment** — exibe a lista de livros com RecyclerView e status "Quero ler".
- **LibraryFragment** — exibe a lista de livros com RecyclerView e status "Lido".

### Bottom Navigation

A `BottomNavigationView` é a barra de navegação na parte inferior da tela.

Ela permite alternar entre os Fragments sem sair da `MainActivity`.

O menu é definido em:

```text
res/menu/bottom_nav_menu.xml
```

### data class

Recurso do Kotlin para criar classes de dados de forma simples e eficiente.

A `data class` gera automaticamente métodos como `equals()`, `hashCode()`, `toString()` e `copy()`.

No projeto, é utilizada para representar a entidade `Livro`.

```kotlin
data class Livro(
    val id: Int,
    val titulo: String,
    val autor: String,
    val genero: String,
    val status: String
)
```

### Entidade

A entidade do sistema é a classe `Livro`, que representa cada livro do catálogo com seus atributos.

Cada livro possui:

- `id`
- `titulo`
- `autor`
- `genero`
- `status`

O atributo `status` indica se o livro está marcado como **"Quero ler"** ou **"Lido"**.

### RecyclerView

Lista eficiente que recicla as views que saem da tela para exibir novos itens sem comprometer a performance.

Funciona com três componentes:

- **Lista de dados** — criada nos Fragments com objetos da classe `Livro`.
- **Adapter (`LivroAdapter`)** — conecta os dados às views de cada item.
- **Layout do item (`item_livro.xml`)** — define como cada livro é exibido na lista.

### Ciclo de Vida

O ciclo de vida define os estados pelos quais um Fragment passa durante sua existência.

Nos Fragments `ExploreFragment` e `LibraryFragment`, cada método é registrado via `Log.d` para demonstração no Logcat.

| Método | Quando é chamado |
|---|---|
| `onCreate` | O Fragment começa a ser criado |
| `onCreateView` | A view do Fragment está sendo criada |
| `onStart` | O Fragment fica visível na tela |
| `onResume` | O Fragment está em foco e interativo |
| `onPause` | O Fragment perde o foco |
| `onStop` | O Fragment sai da tela |
| `onDestroy` | O Fragment é destruído |

Os logs podem ser visualizados no Logcat usando o filtro:

```text
CICLO_BOOKVAULT
```

## 📁 Estrutura do Projeto

```text
br.com.exemplo.catalogodelivros/
├── MainActivity.kt          # Activity principal, gerencia os Fragments e a Bottom Nav
├── Livro.kt                 # data class que representa a entidade Livro
├── LivroAdapter.kt          # Adapter do RecyclerView
├── ExploreFragment.kt       # Fragment com a lista de livros "Quero ler"
└── LibraryFragment.kt       # Fragment com a lista de livros "Lido"

res/
├── layout/
│   ├── activity_main.xml        # Layout principal com FrameLayout + BottomNavigationView
│   ├── fragment_explore.xml     # Layout do ExploreFragment com RecyclerView
│   ├── fragment_library.xml     # Layout do LibraryFragment com RecyclerView
│   └── item_livro.xml           # Layout de cada item da lista
└── menu/
    └── bottom_nav_menu.xml      # Menu da Bottom Navigation
```

## ▶️ Como Executar

1. Clone o repositório.
2. Abra o projeto no Android Studio.
3. Aguarde a sincronização do Gradle.
4. Execute em um emulador ou dispositivo físico Android.
5. Clique em **Run** para iniciar o aplicativo.