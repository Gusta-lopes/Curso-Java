import java.util.Scanner;

public class usaElevador { 
 
    public static void main(String[] args) {
    int opcao=-1, totalAndar, capacidadePessoas, qddPessoas;
    Scanner Ler = new Scanner(System.in);
    
    Elevador elev[]=new Elevador[1]; 
 
    elev[0]=new Elevador(0,0,0,0); 
 
    System.out.printf("Olá! Me informe a seguir a capacidade do elevador: ");
    capacidadePessoas=Ler.nextInt();

    System.out.printf("Agora me diga quantos andares existe no prédio: ");
    totalAndar=Ler.nextInt();
    elev[0].Inicializa(capacidadePessoas,totalAndar); 
 
    while(true){
      pintaMenu();
      opcao = Ler.nextInt();
      if(opcao==0)
        break; 
 
      System.out.printf("\n\n");
      switch (opcao) {
       case 1:
        System.out.printf("Quantidade de pessoas neste momento: ");
        qddPessoas=Ler.nextInt();
        if(qddPessoas<elev[0].getCapac())
         elev[0].setPes(qddPessoas);
       break;
       case 2:
        //só sobe se o andar atual for menor que o total
        if (elev[0].getAtual()<elev[0].getTotal())
         elev[0].Sobe();
       break;
       case 3:
        //só desce se o andar atual for maior que o terreo
        if (elev[0].getAtual()>0)
         elev[0].Desce();
       break;
       case 4:
        //só entra, se não tiver atingido a capacidade
        if (elev[0].getPessoas()<elev[0].getCapac())
         elev[0].Entra();
       break;
       case 5:
        //só sai, se houverem pessoas (>0)
        if (elev[0].getPessoas()>0)
         elev[0].Sai();
       break;
       case 6:
        System.out.printf("Quantidade de Pessoas: %d\n",elev[0].getPessoas());
        System.out.printf("Capacidade Suportada: %d\n",elev[0].getCapac());
        System.out.printf("Andar Atual: %d\n",elev[0].getAtual());
        System.out.printf("Quantidade de Andares: %d\n",elev[0].getTotal());
        //espera 2 segundos
        try { Thread.sleep (2000); }
        catch (InterruptedException ex) {}
       break;
       default:
        System.out.printf("\n --> Valor Invalido <--");
       break;
      }
    }
    System.out.printf("\n\nObrigado! Volte sempre\n\n");
  } 
 
  //função eu mostra menu
  private static void pintaMenu(){
    System.out.printf("\n\n > Menu ");
    System.out.printf("\n  1- Numero de pessoas ");
    System.out.printf("\n  2- Subir um andar ");
    System.out.printf("\n  3- Descer um andar ");
    System.out.printf("\n  4- Uma pessoa entrou ");
    System.out.printf("\n  5- Uma pessoa saiu ");
    System.out.printf("\n  6- Exibir dados ");
    System.out.printf("\n  0- Desligar elevador (CUIDADO! Faça isso apenas em caso de urgência) ");
    System.out.printf("\n > Digite uma opção: ");
  }
}
