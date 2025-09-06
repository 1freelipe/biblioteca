public class Biblioteca {
    public static void main(String[] args){
        Livros livro1 = new Livros("O pequeno príncipe", "Saint-Exupéry", 2011);
        Livros livro2 = new Livros("Harry Potter e a pedra filosofal", "JK Rowling", 2002);
        Livros livro3 = new Livros("Harry Potter e o prisioneiro de askaban", "JK Rowling", 2005);

        Clientes cliente = new Clientes("Felipe", 1);
        Clientes cliente2 = new Clientes("Jonas", 2);
        Clientes cliente3 = new Clientes("Beatriz", 3);

        livro1.mostrarStatus();
        livro2.mostrarStatus();
        livro3.mostrarStatus();

        emprestar(livro1, cliente);
        emprestar(livro2, cliente);
        emprestar(livro3, cliente);
        devolver(livro3, cliente);
        cliente.mostraLivrosEmprestados();
    }

    public static void emprestar(Livros livro, Clientes cliente){
        if(livro.disponivel) {
            System.out.println("O livro: " + livro.titulo + " foi emprestado por: " + cliente.nome);
            cliente.livrosEmprestados.add(livro);
            livro.disponivel = false;
        } else {
            System.out.println("Esse livro se encontra indisponível.");
        }
    }

    public static void devolver(Livros livro, Clientes cliente){
        boolean livroEncontrado = false;
        if(cliente.livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestado ainda");
            return;
        } else {
            for(int i=0; i < cliente.livrosEmprestados.size(); i++){
                Livros livroEmprestado = cliente.livrosEmprestados.get(i);

                if(livroEmprestado.titulo.equals(livro.titulo)){
                    cliente.livrosEmprestados.remove(i);
                    livroEncontrado = true;
                    livro.disponivel = true;
                    System.out.println("O livro foi encontrado e devolvido por: " + cliente.nome);
                    return;
                }

            }
                if(!livroEncontrado) {
                    System.out.println("O livro não foi encontrado");
                }
        }

    }
}
