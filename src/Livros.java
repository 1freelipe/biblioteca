public class Livros {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel = true;

    public Livros(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    void emprestarLivro() {
        if(disponivel) {
            System.out.println("O livro: " + this.titulo + " foi emprestado");
            disponivel = false;
        } else {
            System.out.println("O livro: " + this.titulo + " já foi emprestado");
        }
    }

    void devolverLivro(){
        if(!disponivel) {
            System.out.println("O livro: " + this.titulo + " foi devolvido");
            disponivel = true;
        } else {
            System.out.println("O livro: " + this.titulo + " já está na biblioteca");
        }
    }

    void mostrarStatus() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
        if(!disponivel){
            System.out.println("Este livro já está emprestado");
        } else {
            System.out.println("O livro se encontra disponível para emprestimo na biblioteca");
        }
        System.out.println("--------------------------------------------------------------------");
    }
}
