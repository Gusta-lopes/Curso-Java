import java.util.Scanner;

public class ex02{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario, percentualAumento, novoSalario;

        System.out.printf("Digite o salario:\n");
        salario = ler.nextDouble();

        System.out.printf("\nQual o percentual de aumento do novo salario?\n");
        percentualAumento = ler.nextDouble();

        novoSalario = salario + (salario * (percentualAumento / 100));
        
        System.out.printf("\nO seu atual salário é %.2f\n", novoSalario);
}
}