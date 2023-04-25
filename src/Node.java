public class Node {
    Livro livro;
    Node next;

    public Node(Livro livro) {
        this.livro = livro;
        this.next = null;
    }

    public Livro getLivro() {
        return livro;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
