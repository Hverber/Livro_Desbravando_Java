public class CadastroDeLivros {
    public static void main (String[] arg){


        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro Livro = new LivroFisico(autor);
        Livro.setNome("Java 8 Pratico");
        Livro.setDescricao("Novos recurso da linguagem");
        Livro.setValor(59.90);
        Livro.setIsbn("978-85-66250-46-6");

        Livro.setAutor(autor);

        Livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("112.345.678.12");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Logica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");
        
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();





    }

}
