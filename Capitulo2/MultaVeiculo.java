import java.util.Scanner;

public class MultaVeiculo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veiculo (passeio, caminhão)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima de via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();

        //Multa para veiculo de passeio e caminhão com respectivamente 10% e 15% maior que a velocidade da via
        //O método equals é usado para comparar, neste caso duas variáveis

        if((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima *1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) ){
            System.out.println("Multa");
        }
    }
}
