import java.util.Scanner;

public class ex08{
    public static void main(String[] args) {
        int codigo, senha;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o código de acesso: ");
        codigo = entrada.nextInt();

        if (codigo == 1234) {
            System.out.print("Insira a senha de acesso: ");
            senha = entrada.nextInt();
            if(senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Código incorreto");
        }

        entrada.close();
    }
}

