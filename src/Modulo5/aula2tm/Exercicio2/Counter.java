package Modulo5.aula2tm.Exercicio2;

public class Counter {
    //Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
    // A classe conterá um construtor padrão, um construtor com parâmetros,
    // um construtor de cópia e os setters e getters correspondentes (métodos de acesso).
    private int count;

    public Counter(){
        this.count = 0;
    }
    public Counter(int contadorInicial){
        this.setCount(contadorInicial);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void somarContador() {
        this.setCount(this.count+1);
    }
    public void somarContador(int count) {
        this.setCount(this.count+count);
    }

    public void subtrairContador() {
        this.setCount(this.count-1);
    }
    public void subtrairContador(int count) {
        this.setCount(this.count-count);
    }
}
