package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade3E {
    public static void main(String[] args)
    {
        double valor, logaritmo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        valor = ler.nextDouble();
        logaritmo = Math.log(valor);

        System.out.println("Logaritmo natural: " + logaritmo);
    }
}

