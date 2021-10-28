import java.util.Scanner;

public class questao3{
   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       int matriz[][] ={ {1, 2, 3, 4, 5, 7},
                         {8, 9, 10, 11, 12, 13},
                         {14,15,16,17,18,19},
                         {20,21,22,23,24,25},
                         {26,27,28,29,30},
                        };

       int num;
       int x;
       int y; 

      System.out.print("Digite um número para multiplicar a matriz: ");      
      num = ler.nextInt();
       System.out.println("");
       for (x = 0; x <= 4; x++) {
           for (y = 0; y <= 5; y++) {
               matriz[x][y] *= num;
               System.out.print("["+matriz[x][y]+"], " );          
           }
           System.out.println("");
       }
   }
}