public class Livro {

    String ISBN, autor, titulo;
    float preco;

    public Livro(String ISBN, String autor, String titulo, float preco) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
