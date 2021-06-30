package aula2tm.Exercicio2;

public class Main {
    //Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
    // A classe conterá um construtor padrão, um construtor com parâmetros,
    // um construtor de cópia e os setters e getters correspondentes (métodos de acesso).

    public static void main(String[] args) {
        Counter contador1 = new Counter(100);
        System.out.println("---------- Inicio do contador 1 ----------");
        contador1.somarContador();
        System.out.println(contador1.getCount());
        contador1.somarContador(10);
        System.out.println(contador1.getCount());
        contador1.subtrairContador();
        System.out.println(contador1.getCount());
        contador1.subtrairContador(2);
        System.out.println(contador1.getCount());

        Counter contador2 = new Counter();
        System.out.println("---------- Inicio do contador 2 ----------");
        contador2.somarContador();
        contador2.somarContador();
        contador2.somarContador();
        contador2.somarContador();
        contador2.somarContador();
        contador2.somarContador();
        System.out.println(contador2.getCount());
        contador2.somarContador(10);
        System.out.println(contador2.getCount());
        contador2.subtrairContador();
        System.out.println(contador2.getCount());
        contador2.subtrairContador(10);
        System.out.println(contador2.getCount());
    }
}
