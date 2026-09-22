import java.util.Scanner;
public class App {
    public  static void exibe(FichaPessoal f){
        System.out.println("Nome : "+f.getNome()+"\nIdade: "+f.getIdade());
    }

    public static void main(String[] args) {
        FichaPessoal f = new FichaPessoal(null, 0);
        Scanner s = new Scanner(System.in);
        int i=0;
        String n=" ";
        System.out.print("Digite o seu nome: ");
        n=s.nextLine();
        System.out.print("Digite a sua idade: ");
        i=s.nextInt();
        f.setIdade(i);
        f.setNome(n);
        exibe(f);
    }
}
