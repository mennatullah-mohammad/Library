package com.menna.pj
class BookAdapter : RecyclerView.Adapter<BookAdapter.BookHolder>() {
    private var books: List<Book> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)
        return BookHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        val currentBook = books[position]
        holder.textViewTitle.text = currentBook.title
        holder.textViewAuthor.text = currentBook.author
        holder.textViewYear.text = currentBook.year.toString()
    }

    override fun getItemCount(): Int = books.size

    fun setBooks(books: List<Book>) {
        this.books = books
        notifyDataSetChanged()
    }

    class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTitle: TextView = itemView.findViewById(R.id.text_view_title)
        val textViewAuthor: TextView = itemView.findViewById(R.id.text_view_author)
        val textViewYear: TextView = itemView.findViewById(R.id.text_view_year)
    }
}
