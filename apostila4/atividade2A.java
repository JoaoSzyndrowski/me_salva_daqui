package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade2A {
    public static void main(String[] args) {
        double numero;
        int resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero decimal: ");
        numero = ler.nextDouble();
        resultado = (int) Math.round(numero);
        System.out.println("Resulatdo: " + resultado);
    }
}

