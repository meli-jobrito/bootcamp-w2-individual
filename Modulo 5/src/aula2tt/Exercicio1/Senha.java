package aula2tt.Exercicio1;

public class Senha {
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
    private String senha;

    public Senha(String senha){
        String regex = "^.*(?=.{8,})(?=.*\\d)(?=.*[a-zA-Z])|(?=.{8,})(?=.*\\d)(?=.*[!@#$%^&])|(?=.{8,})(?=.*[a-zA-Z])(?=.*[!@#$%^&]).*$";
        if (senha.matches(regex)) {
            this.senha = senha;
            System.out.println("Senha passou pela validacao");
        }else {
            System.out.println("Senha inválida");
        }
    }

    public String toString(){
        return this.senha;
    }
}
