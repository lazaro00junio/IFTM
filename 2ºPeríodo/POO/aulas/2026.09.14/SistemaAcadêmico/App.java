import java.util.Scanner;

public class App {
    public static Pessoa lePessoa() {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o nome da pessoa: ");
        String nome = s.nextLine();
        System.out.print("Insira o sexo da pessoa: ");
        char sexo = s.next().charAt(0);
        System.out.print("Insira a idade da pessoa: ");
        int idade = s.nextInt();
        return new Pessoa(nome, sexo, idade);
    }

    public static Formacao leFormacao() {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o nível da formação da pessoa: ");
        String nivel = s.nextLine();
        System.out.print("O " + nivel + " foi completo? (S/N) ");
        char c = s.next().charAt(0);
        boolean concluido = c == 's' || c == 'S';
        while (c != 'n' && c != 'N' && !concluido) {
            System.out.print("Entrada incorreta. Tente novamente: ");
            c = s.next().charAt(0);
        }
        s.nextLine();
        System.out.print("Insira o nome da instituição de ensino: ");
        String instituicao = s.nextLine();
        System.out.print("Insira o ano: ");
        int ano = s.nextInt();
        return new Formacao(nivel, concluido, instituicao, ano);
    }

    public static String exibePessoa(Pessoa p) {
        return "Nome: " + p.nome + "\nSexo: " + p.sexo + "\nIdade: " + p.idade;
    }

    public static String exibeFormacao(Formacao f) {
        return "Nível: " + f.nivel + "\nConcluído: " + f.concluido + "\nInstituição: " + f.instituicao + "\nAno: "
                + f.ano;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op = 0;
        Pessoa p = null;
        Formacao f = null;
        while (op != 5) {
            System.out.println("====================================");
            System.out.println("1- Preencher dados da  pessoa.");
            System.out.println("2- Preencher dados da formacao.");
            System.out.println("3 - Exibir dados da pessoa.");
            System.out.println("4 - Exibir dados da formacao.");
            System.out.println("5 - Sair");
            System.out.println("====================================");
            op = s.nextInt();
            switch (op) {
                case 1:
                    p = lePessoa();
                    break;
                case 2:
                    f = leFormacao();
                    break;
                case 3:
                    System.out.println(exibePessoa(p));
                    break;
                case 4:
                    System.out.println(exibeFormacao(f));
                default:
                    break;
            }
        }
        s.close();
    }
}
