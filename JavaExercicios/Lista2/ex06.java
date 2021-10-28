import java.util.Scanner;

public class ex06{
    public static void main(String[] args) {
        var ler = new Scanner(System.in);
        double valor1, valor2, valor3;

        System.out.printf("Digite o primeiro numero:\n");
        valor1 = ler.nextDouble();

        System.out.printf("\nDigite o segundo numero\n");
        valor2 = ler.nextDouble();

        System.out.printf("\nDigite o terceiro numero\n");
        valor3 = ler.nextDouble();

        if (valor1 < (valor2 + valor3) &&  
             valor2 < (valor1 + valor3) && 
              valor3 < (valor1 + valor2)) {
                 System.out.printf("o triangulo existe");   
            } else {   
                System.out.printf("O triângulo não existe.");  

        }
    }
}