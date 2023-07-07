package apostila3;

import java.util.Scanner;
import java.lang.Math;

public class atividade2 {
     public static void main(String[] args)
    {
        double raio, area;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = leia.nextDouble();
        area = raio * raio * Math.PI;
        System.out.println("Área do circulo: " + area);

    }
}

