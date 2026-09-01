import javax.swing.JOptionPane;

public class Lista01 {

    // declaracão das variaveis globais
    public static int somasNegativas = 0, somasPositivas = 0;

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
                exibe5(0, 0);
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
        }
    }

    public static void exe5() {
        int n = 0;
        somar5(n, 0);

    }

    public static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "    \t MENU\n\n1- Compara Números\n2- Equação do Segundo Grau\n3- Calcula média aritimética \n4- Tipo do triângulos\n\n17- SAIR\n\nDIGITE A OPÇÃO:"));
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
                // case 6:
                // exe6();
                // break;

                default:
                    System.out.println("Opcão inválida");
            }
        }
    }
}
