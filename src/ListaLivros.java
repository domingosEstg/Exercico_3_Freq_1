public class ListaLivros {

    Node ini;

    public ListaLivros() {
        ini = null;
    }

    public void insereLivro(Livro l) {
        Node novoElemento = new Node(l);
        novoElemento.setNext(ini);
        ini = novoElemento;
    }

    public float valorTotalLivros(float preco) {
        float total = 0;
        for (Node n = ini; n != null; n = n.next) {
            if (n.livro.preco > preco) total += n.livro.preco;
        }

        Node aux = ini;
        while (aux != null) {
            if (aux.livro.preco > preco) total += aux.livro.preco;
            aux = aux.next;
        }


        do {
            if (aux.livro.preco > preco) total += aux.livro.preco;
            aux = aux.next;
        }
        while (aux.next != null);

        return total;
    }


    public void alteraPreco(String isbn, float preco){
        for (Node n = ini; n != null; n = n.next) {
            if(n.livro.ISBN.compareTo(isbn) ==0)
                n.livro.setPreco(preco);
        }
    }

}
