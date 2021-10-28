import static java.lang.System.out;

import java.io.PrintStream;
import java.util.Scanner;

public class ex05{

    private static PrintStream printf;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double horasMes, salarioHora, salarioTotal, horaExtra;

        System.out.printf("Quantas horas você trabalhou este mês?\n");
        horasMes = ler.nextDouble();

        System.out.printf("\nQuanto você recebe por hora?\n");
        salarioHora = ler.nextDouble();

        if(horasMes <= 160) {
            salarioTotal = salarioHora * horasMes;
            System.out.printf("\n Você não fez hora extra esse mês. Seu salário é %.0f reais",salarioTotal);
        } else {
            horaExtra = (salarioHora * 0.5)* horasMes;
            System.out.printf("\n Você receberá %.0f reais de horas extras. ",horaExtra); 
            salarioTotal = salarioHora * horasMes + horaExtra;
            printf = out.printf("\n Seu salário total deste mês é de %.0f reais.",salarioTotal );
        }
    }
}