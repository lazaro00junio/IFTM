import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Lista01 {

    // declaracão das variaveis globais
    public static int somasNegativas = 0, somasPositivas = 0, somaDePares = 0, somaDeImpares = 0, numerosPares = 0,
            numerosImpares = 0, numerosPositivos = 0, numerosNegativos = 0;

    public static int leInt1(int x) {
        return Integer.parseInt(JOptionPane.showInputDialog("Insira o " + x + "º número:"));
    }

    public static String compara1(int n1, int n2) {
        String ret;
        if (n1 > n2) {
            ret = n1 + " é maior que " + n2;
        } else if (n1 < n2) {
            ret = n1 + " é menor que " + n2;
        } else {
            ret = n1 + " é igual a " + n2;
        }
        return ret;
    }

    public static void exibe1(String x) {
        JOptionPane.showMessageDialog(null, x);
    }

    public static void exe1() {
        int n1, n2;
        String resultado;
        n1 = leInt1(1);
        n2 = leInt1(2);
        resultado = compara1(n1, n2);
        exibe1(resultado);
    }

    public static double leDouble2(char x) {
        double ret;
        ret = Double.parseDouble(JOptionPane.showInputDialog("Insira o coeficiente " + x
                + "\n(Haverão terríveis consequências caso A seja igual a 0...não ouse.):"));
        return ret;
    }

    public static double calculaDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double calculaX1(double d, double a, double b) {
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public static double calculaX2(double d, double a, double b) {
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    public static void exibe2(double x1, double x2) {
        JOptionPane.showMessageDialog(null, "As raízes são" + x1 + " e " + x2);
    }

    public static void exe2() {
        double a, b, c, d, x1, x2;
        a = leDouble2('a');
        if (a != 0) {
            b = leDouble2('b');
            c = leDouble2('c');
            d = calculaDelta(a, b, c);
            if (d < 0) {
                JOptionPane.showMessageDialog(null, "Não existem raizes reais para esta equação.");
            } else {
                x1 = calculaX1(d, a, b);
                x2 = calculaX2(d, a, b);
                exibe2(x1, x2);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Você foi avisado... verifique-se de trancar bem as portas da sua casa.");
        }
    }

    public static double leDouble3(int x) {
        return Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do " + x + "º número:"));
    }

    public static double calculaMedia(double n1, double n2, int q) {
        return (n1 + n2) / 2;
    }

    public static void exibe3(double media) {
        JOptionPane.showMessageDialog(null, "O resultado da média é: " + media);
    }

    public static void exe3() {
        double n1, n2, media;
        n1 = leDouble3(1);
        n2 = leDouble3(2);
        media = calculaMedia(n1, n2, 2);
        exibe3(media);
    }

    public static double leDouble4(int x) {
        return Double
                .parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do " + x + "º lado do triângulo: "));
    }

    public static String tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "É um triângulo equilátero";
        } else if ((a == b || b == a || b == c || c == a) && (a != b || b != a || b != c || c != a)) {
            return "É um triângulo isóceles";
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
                || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
                || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)) {
            return "É um triângulo retângulo";
        } else {
            return "É um triângulo escaleno";
        }
    }

    public static void exibe4(String x) {
        JOptionPane.showMessageDialog(null, x);
    }

    public static void exe4() {
        double a = 0, b = 0, c = 0;
        String resultado;
        a = leDouble4(1);
        b = leDouble4(2);
        c = leDouble4(3);
        if (((a + b < c) && (b + c < a) && (a + c < b))) {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo");
        } else {
            resultado = tipoTriangulo(a, b, c);
            exibe4(resultado);
        }

    }

    public static int leInt5() {
        return Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
    }

    public static int somar5(int n, int soma) {
        while (true) {
            n = leInt5();
            soma += n;
            if (n != 0) {
                exibe5(soma, n);
            } else {
                exibe5(soma, 0);
                break;
            }
        }
        return soma;
    }

    public static void exibe5(int soma, int n) {
        if (n != 0) {
            if (soma < 0) {
                somasNegativas++;
            } else if (soma >= 0) {
                somasPositivas++;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Somas positivas = " + somasPositivas + "\nSomas Negativas = " + somasNegativas);
            somasNegativas = 0;
            somasPositivas = 0;
        }
    }

    public static void exe5() {
        somar5(0, 0);

    }

    public static int leNatural6() {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural: "));
        while (x < 0) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Entrada Inválida. Insira um número natural: "));
        }
        return x;
    }

    public static void fatorar(int n) {
        Integer[] fatores = new Integer[n];
        int p = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                fatores[p] = i;
                p++;
            }
        }
        exibirFatores(fatores, n);
    }

    public static void exibirFatores(Integer[] fatores, int n) {
        String resultado = Arrays.stream(fatores).filter(Objects::nonNull).map(Object::toString)
                .collect(Collectors.joining(", "));
        JOptionPane.showMessageDialog(null, "Fatores de " + n + ": " + resultado + ".");
        repetirCalculo();
    }

    public static void repetirCalculo() {
        String r = JOptionPane.showInputDialog("Deseja repetir o calcúlo(s/S): ").trim().toLowerCase();
        if (r.equals("s") || r.equals("sim")) {
            exe6();
        } else {
            JOptionPane.showMessageDialog(null, "Entendido. Retornando a tela inicial...");
        }
    }

    public static void exe6() {
        int n = leNatural6();
        fatorar(n);
    }

    public static int leInt7() {
        int x;
        return x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
    }

    public static void somar7(int soma) {
        int n = leInt7();
        if (n == 0) {
            exibir7(soma);
        } else {
            if (n > 0 && n % 2 == 0) {
                numerosPositivos++;
                numerosPares++;
                somasPositivas += n;
                somaDePares += n;
            } else if (n < 0 && n % 2 == 0) {
                numerosPares++;
                numerosNegativos++;
                somasNegativas += n;
                somaDePares += n;
            } else if (n > 0 && n % 2 != 0) {
                numerosPositivos++;
                numerosImpares++;
                somasPositivas += n;
                somaDeImpares += n;
            } else if (n < 0 && n % 2 != 0) {
                numerosNegativos++;
                numerosImpares++;
                somasNegativas += n;
                somaDeImpares += n;
            }
            soma += n;
            somar7(soma);
        }
    }

    public static void exibir7(int soma) {
        JOptionPane.showMessageDialog(null, "Quantidade de números positivos: " + numerosPositivos
                + "\nQuatidade de números negativos: " + numerosNegativos + "\nQuantidade de números pares: "
                + numerosPares + "\nQuantidade de números ímpares: " + numerosImpares + "\nSoma dos números positivos: "
                + somasPositivas + "\nSoma dos números negativos: " + somasNegativas + "\nSoma dos números pares: "
                + somaDePares + "\nSoma dos números ímpares: " + somaDeImpares + "\nSoma total: " + soma);
        somasNegativas = 0;
        somasPositivas = 0;
        somaDePares = 0;
        somaDeImpares = 0;
        numerosPares = 0;
        numerosImpares = 0;
        numerosPositivos = 0;
        numerosNegativos = 0;
    }

    public static void exe7() {
        somar7(0);
    }

    public static int leNatural8() {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural: "));
        while (n < 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Input inválido.\nInsira um número natural: "));
        }
        return n;
    }

    public static boolean verificarPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void exibir8(boolean b) {
        if (b) {
            JOptionPane.showMessageDialog(null, "O número digitado é primo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado não é primo.");
        }
    }

    public static void exe8() {
        int n = leNatural8();
        exibir8(verificarPrimo(n));
    }

    public static long leNatural9() {
        Scanner s = new Scanner(System.in);
        long n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural: "));
        while (n < 0) {
            n = Integer.parseInt(
                    JOptionPane.showInputDialog("O número digitado não é natural.\nInsira um número natural: "));
        }
        return n;
    }

    public static long fatorial(long n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void exibir9(long n, long f) {
        JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + f + ".");
    }

    public static void exe9() {
        long n = leNatural9();
        exibir9(n, fatorial(n));
    }

    public static int leNatural10() {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural: "));
        while (n < 0) {
            n = Integer.parseInt(
                    JOptionPane.showInputDialog("O número digitado não é natural.\nInsira um número natural: "));
        }
        return n;
    }

    public static int mmc(int x, int y) {
        int mmc = x;
        while (mmc % y != 0) {
            mmc += x;
        }
        return mmc;
    }

    public static void exibe10(int x, int y, int mmc) {
        JOptionPane.showMessageDialog(null, "O MMC de " + x + " e " + y + " é " + mmc + ".");
    }

    public static void exe10() {
        int x, y;
        x = leNatural10();
        y = leNatural10();
        exibe10(x, y, mmc(x, y));
    }

    public static int leNatural11() {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural: "));
        while (n < 0) {
            n = Integer.parseInt(
                    JOptionPane.showInputDialog("O número digitado não é natural.\nInsira um número natural: "));
        }
        return n;
    }

    public static int mdc(int x, int y) {
        int resto = 0, menor = 1;

        if (y > x) {
            menor = x;
            x = y;
            y = menor;
        }

        while (resto != 0) {
            resto = x % y;
            x = y;
            y = resto;
        }
        return x;
    }

    public static void exibe11(int x, int y, int mdc) {
        JOptionPane.showMessageDialog(null, "O MMC de " + x + " e " + y + " é " + mdc + ".");
    }

    public static void exe11() {
        int x, y;
        x = leNatural11();
        y = leNatural11();
        exibe11(x,y,mdc(x, y));
    }

    public static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "    \t MENU\n\n1- Compara Números\n2- Equação do Segundo Grau\n3- Calcula média aritimética \n4- Tipo do triângulos\n5- Somar inteiros\n6- Exibir fatores\n7- Quantidade e soma de números inteiros\n8- Verificar número primo\n9- Calcular fatorial\n10- Calcular MMC\n11- Calcular MDC\n17- SAIR\n\nDIGITE A OPÇÃO:"));
    }

    public static void main(String[] args) {
        int op = 0;
        while (op != 17) {
            op = menu();
            switch (op) {
                case 1:
                    exe1();
                    break;
                case 2:
                    exe2();
                    break;
                case 3:
                    exe3();
                    break;
                case 4:
                    exe4();
                    break;
                case 5:
                    exe5();
                    break;
                case 6:
                    exe6();
                    break;
                case 7:
                    exe7();
                    break;
                case 8:
                    exe8();
                    break;
                case 9:
                    exe9();
                    break;
                case 10:
                    exe10();
                    break;
                case 11:
                    exe11();
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        }
    }
}
