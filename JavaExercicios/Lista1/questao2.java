import java.util.Scanner;
public class questao2{

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)
        {
            System.out.print("Digite seu salário bruto: ");
            double salarioBruto = SCANNER.nextDouble();
 
            System.out.print("\nDigite o valor dos descontos: ");
            double descontos = SCANNER.nextDouble();
 
            if (descontos > salarioBruto) 
            {
                System.out.println("Valores incorretos.");
                continue;
            }
            double valorEmprestimo = (salarioBruto - descontos)*0.3;
            valorEmprestimo = (double)((int)(valorEmprestimo*100))/100;
            
            System.out.print("\nDigite a quantidade de parcelas: ");
            double parcelas = SCANNER.nextDouble();

            
            double valorParcelas;
            if (parcelas <= 60){
                valorParcelas = valorEmprestimo / parcelas;
            

            System.out.println("O valor máximo que você poderá financiar é de: R$" + valorEmprestimo);
            System.out.println("O valor pode ser dividido em " + parcelas + " de " + valorParcelas);
        }
        }
    }
}