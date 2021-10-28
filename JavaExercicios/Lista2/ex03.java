import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double carros, vendas, salarioBase, comissao, novoSalario;

        System.out.printf("Digite a quantidade de carros vendidos:\n");
        carros = ler.nextDouble();

        System.out.printf("\nQual o total de suas vendas?\n");
        vendas = ler.nextDouble();

        System.out.printf("\nQual o seu salario base? \n");
        salarioBase = ler.nextDouble();

        System.out.printf("\nQual o valor de comissão fixa por cada carro vendido? \n");
        comissao = ler.nextDouble();

        novoSalario = salarioBase + (comissao * carros) + (vendas * 0.05);
        
        System.out.printf("\nO seu salário é %.2f\n", novoSalario);
}
}