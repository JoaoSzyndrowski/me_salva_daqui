package apostila3;
import java.util.Scanner;
public class atividade14 {
    

    public static void main(String[] args)
    {
        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        System.out.println("Cubo: " + numero * numero * numero);
    }
}

