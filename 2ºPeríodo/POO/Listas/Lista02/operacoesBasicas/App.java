import java.util.Scanner;

public class App {

    public static int le() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        return x;

    }

    public static void exibeSoma(int x, int y, int r) {
        System.out.println(x + " + " + y + " = " + r);
    }

    public static void exibeSubtracao(int x, int y, int r) {
        System.out.println(x + " - " + y + " = " + r);
    }

    public static void exibeMultiplicacao(int x, int y, int r) {
        System.out.println(x + " * " + y + " = " + r);
    }

    public static void exibeDivisao(int x, int y, int r) {
        System.out.println(x + " / " + y + " = " + r);
    }

    public static void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("1-Somar dois inteiros.");
        System.out.println("2-Subtrair dois inteiros.");
        System.out.println("3-Multiplicar dois inteiros.");
        System.out.println("4-Dividir dois inteiros.");
        System.out.println("5-Sair");
        System.out.println("------------------------------------------------");

    }

    public static void main(String[] args) {
        int x = 0, y = 0, r = 0, e = 0;

        while (e != 5) {
            menu();
            e = le();

            if (e != 5) {
                System.out.println("Digite o primeiro número");
                x = le();
                System.out.println("Digite o segundo número");
                y = le();
            }

            switch (e) {
                case 1:
                    Adicao soma = new Adicao(x, y);
                    r = soma.soma();
                    exibeSoma(x, y, r);
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao(x, y);
                    r = subtracao.subtrai();
                    exibeSubtracao(x, y, r);
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao(x, y);
                    r = multiplicacao.multiplica();
                    exibeMultiplicacao(x, y, r);
                    break;
                case 4:
                    Divisao divisao = new Divisao(x, y);
                    r = divisao.divide();
                    exibeDivisao(x, y, r);
                    break;
                case 5:
                    System.out.println("Você escolheu sair.");
            }
        }
    }
}