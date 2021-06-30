package aula2tm.Exercicio3;

public class Book {
    //Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo
    // protótipo deve ser: public String toString (). Este método deve retornar uma string que representa o objeto.
    // Por exemplo: se a classe tiver os atributos: título, isbn e autor, uma string representando um livro poderia
    // ser: "Harry Potter, 9780545582889, Rowling, J. K.". A classe conterá um construtor padrão, um construtor com parâmetros e os métodos de acesso.

    //Adicione a linha @Override logo acima do cabeçalho do método toString.
    // Em seguida, renomeie o método para: tostring (tudo em letras minúsculas). O que acontece?
    private String titulo;
    private String isbn;
    private String autor;
    private boolean emprestado = false;

    public Book(){

    }
    public Book(String titulo, String isbn, String autor){
        this.setTitulo(titulo);
        this.setIsbn(isbn);
        this.setAutor(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void situacao(){
        if(this.emprestado){
            System.out.println("O livro está emprestado");
        }else{
            System.out.println("O livro ainda não foi emprestado");
        }
    }

    public void emprestimo(){
        if(this.emprestado){
            System.out.println("O livro já foi emprestado!");
        }else{
            System.out.println("Emprestimo realizado com sucesso!");
            this.emprestado = true;
        }
    }

    public void devolver(){
        if (this.emprestado) {
            System.out.println("O livro foi devolvido com sucesso!");
            this.emprestado = false;
        }else{
            System.out.println("O livro ainda não foi emprestado!");
        }
    }

    @Override
    public String toString(){//Ocorre um erro ao deixar o override com o nome do metodo em minusculo, pois assim ele nao da override em nenhum metodo
        //"Harry Potter, 9780545582889, Rowling, J. K."

        return this.getTitulo()+", "+this.getIsbn()+", "+this.getAutor();
    }

}
