package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade2G {
   

    public static void main(String[] args) {
        double angulo, seno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do angulo: ");
        angulo = ler.nextDouble();
        seno = Math.sin(angulo);
        System.out.println("Seno: " + seno);
    }
}

