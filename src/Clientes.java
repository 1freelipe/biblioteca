import java.sql.Array;
import java.util.ArrayList;

public class Clientes {
    String nome;
    int id;
    ArrayList<Livros> livrosEmprestados;

    public Clientes(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<Livros>();
    }

    void mostraLivrosEmprestados() {
        System.out.println("Livros do cliente: " + this.nome);
        if(livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado ainda");
        } else {
            for(Livros livro : this.livrosEmprestados) {
                System.out.println(livro.titulo);
            }
        }
    }
}
