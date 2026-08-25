import java.util.Scanner;
public class App {

    public static int le(){
        Scanner s = new Scanner(System.in);
        int x;
        return x=s.nextInt();
    }

    public static void exibeSoma(int x,int y,int r){
        System.out.println(x+" + "+y+" = "+r);
    }

    public static void exibeSubtracao(int x,int y,int r){
        System.out.println(x+" - "+y+" = "+r);
    }

    public static void exibeMultiplicacao(int x,int y,int r){
        System.out.println(x+" * "+y+" = "+r);
    }

    public static void main(String[] args) {
        int x,y,r;
        x=le();
        y=le();

        Adicao soma=new Adicao(x, y);
        r=soma.soma();
        exibeSoma(x, y, r);

        Subtracao subtracao = new Subtracao(x, y);
        r=subtracao.subtrai();
        exibeSubtracao(x, y, r);

        Multiplicacao multiplicacao = new Multiplicacao(x, y);
        r=multiplicacao.multiplica();
        exibeMultiplicacao(x, y, r);
    }
}