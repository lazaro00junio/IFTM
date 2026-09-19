import java.util.Scanner;
public class App {
    public static Pessoa lePessoa(){
        Scanner s = new Scanner(System.in);
        String nome=s.nextLine();
        char sexo = s.next().charAt(0);
        int idade = s.nextInt();
        return p(nome,sexo,idade);
    }

    public static Formacao leFormacao(){
        Scanner s = new Scanner(System.in);
        String nivel=s.nextLine();
        char c = s.next().charAt(0);
        s.nextLine();
        boolean concluido = c=='s' || c=='S'; 
        String instituicao =s.nextLine();
        int ano = s.nextInt();
        return f(nivel,concluido,instituicao,ano)
    }

    public static String exibePessoa(Pessoa p){

    }

    public  static String exibeFormacao(Formacao f){
        
    }

    public static void main(String[] args){
        int op=0;
        Pessoa p=null;
        Formacao f=null;
        while (op!=5){
            System.out.println("====================================");
            System.out.println("1- Preencher dados da  pessoa.");
            System.out.println("2- Preencher dados da formacao.");
            System.out.println("3 - Exibir dados da pessoa.");
            System.out.println("4 - Exibir dados da formacao.");
            System.out.println("5 - Sair");
            switch (op) {
                case 1:
                    lePessoa();
                    break;
                case 2:
                    leFormacao();
                    break;
                case 3:
                    exibePessoa(p);
                    break;
                case 4:
                    exibeFormacao(f);
                default:
                    break;
            }
        }
    }
}
