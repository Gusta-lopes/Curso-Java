public class OperadoresdeComparacao {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;
//Sempre vai retrnar true ou false
        boolean maior = b > a;
        boolean maiorOuIgual = b >= a;
        boolean menor = a < b;
        boolean menorOuIgual = a <= 10;
        boolean igual = a == b - c;
        boolean diferente = a != c;

        System.out.println(maior);
        System.out.println(maiorOuIgual);
        System.out.println(menor);
        System.out.println(menorOuIgual);
        System.out.println(igual);
        System.out.println(diferente);


        boolean bloqueado = true;
        bloqueado = !bloqueado; // inverte o valor e realoca a variavel

        System.out.println(bloqueado); //imprime false
    }
}
