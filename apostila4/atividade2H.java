package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade2H {
    public static void main(String[] args) {
        double angulo, cosseno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do angulo: ");
        angulo = ler.nextDouble();
        cosseno = Math.cos(angulo);
        System.out.println("Cosseno: " + cosseno);
    }
}

