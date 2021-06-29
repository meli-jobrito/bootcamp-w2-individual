package aula2tm.Exercicio5;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    //Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e o
    //método toString, conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro para
    //adicionar um dia ao valor atual da data. A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.
    private Date dataGravada;

    public Data(){
        GregorianCalendar gc = new GregorianCalendar();
        this.setDataGravada(gc.getTime());
    }
    public Data(String data){
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            GregorianCalendar gc = new GregorianCalendar();
            f.setLenient(false);
            gc.setTime(f.parse(data));
            this.setDataGravada(gc.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public void adicionaDia(int numDeDias){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(this.dataGravada);
        gc.add(Calendar.DAY_OF_MONTH, numDeDias);
        this.dataGravada = gc.getTime();
    }

    public Date getDataGravada() {
        return dataGravada;
    }

    public void setDataGravada(Date dataGravada) {
        this.dataGravada = dataGravada;
    }

    public static void validaData(String data){
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        try{
            f.setLenient(false);
            Date teste = f.parse(data);
            System.out.println("A data é valida!");
        } catch (ParseException e) {
            System.out.println("Data não é valida!");
        }
    }

    public String toString(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
        return formatador.format(getDataGravada().getTime());
    }


}
