package academy.flower.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Osito";
        String address = "Rua são João 117, Prazeres - PE";
        double wage = 2446.00;
        Date date = new Date();

        System.out.println("Eu " + name + ", morando no endereço " + address + " " +
                ", confirmo que recebi o salário de " + wage + ", na data " + date);
    }
}
