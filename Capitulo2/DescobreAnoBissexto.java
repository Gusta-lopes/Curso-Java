import java.util.Scanner;
public class DescobreAnoBissexto {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano: ");

        int ano = entrada.nextInt();

        if (ano % 400 == 0) { // Se for multiplo de 400 é bissexto
            System.out.println("O ano \"" + ano + "\" é um ano bissexto");
        } else if (ano %4 == 0) {
            if (ano % 100 != 0 ) { //Multiplo de 4 e não multiplo de 100 é outra propriedade do ano bissexto
                System.out.println("O ano \"" + ano + "\" é um ano bissexto");
            } else{
                System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
            }

        } else {
            System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
        }



    }
}
