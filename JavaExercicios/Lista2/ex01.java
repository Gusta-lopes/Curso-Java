import java.util.Scanner;

public class ex01{

    public static void main (String [] args) {
      Scanner ler = new Scanner(System.in);

      int eleitores, brancos, nulos, validos;
      double brancosPercentual, nulosPercentual, validosPercentual;

      System.out.printf("Escreva a quantidade de eleitores:\n");
      eleitores = ler.nextInt();
      System.out.printf("\nEscreva a quantidade de votos validos:\n");
      validos = ler.nextInt();
      System.out.printf("\nQual o numero de votos brancos?:\n");
      brancos = ler.nextInt();
      System.out.printf("\nQual o numero de votos nulos?\n");
      nulos = ler.nextInt();

      validosPercentual = ((double)validos / eleitores) * 100;
      brancosPercentual = ((double)brancos / eleitores) * 100;
      nulosPercentual = ((double)nulos / eleitores) * 100;

      System.out.printf("\n\n%6.2f%% dos votos são validos.", validosPercentual);
      System.out.printf("\n Destes, %4.2f%% são votos em branco e", brancosPercentual);
      System.out.printf(" %4.2f%% são votos nulos.\n", nulosPercentual);
    }

}