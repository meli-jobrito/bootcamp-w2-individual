package Modulo5.aula2tt.Exercicio1;

public class Main {
    //Crie uma classe de senha. O construtor deve receber uma regex (expressão regular) que valida o formato exigido para a senha.
    //Pesquise na Internet quais recursos Java fornece para operar com expressões regulares.
    //
    //Adicione o método public void setValue (String pwd) que permite atribuir uma senha de acordo com a exigida pela regex do ponto anterior.
    //Em caso de incompatibilidade, o método deve lançar uma exceção.
    //
    //Discussão: que tipo de exceção você considera mais adequada?
    //Implemente o método conforme decidido em (i).
    //
    //Escreva três classes: PasswordForte, PasswordMedia, PasswordFraca, todas elas devem estender Password e codificar um
    // regex de acordo com o nível de segurança que o nome da classe indica.
    public static void main(String[] args) {
        Senha senha = new Senha("J");
        System.out.println(senha);
    }
}
