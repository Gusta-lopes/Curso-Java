import java.util.Scanner;

public class ex04{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double horaInicio, horaTermino, duracao;

        System.out.printf("Qual a hora de inicio da partida:\n");
        horaInicio = ler.nextDouble();

        System.out.printf("\nQual a hora de termino da partida?\n");
        horaTermino = ler.nextDouble();

        if(horaInicio >= horaTermino) {
            duracao = (24 - horaInicio) + horaTermino;
            System.out.printf("\n A duração é %.0f horas",duracao);
        } else {
            duracao = horaTermino - horaInicio;
            System.out.printf("\n A duração é %.0f horas",duracao); 
        }
    }
}