package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade3D {
    public static void main(String[] args) {
        double angulo, arcoTangente;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        angulo = ler.nextDouble();
        arcoTangente = Math.acos(angulo);
        System.out.println("Arco tangente: " + arcoTangente);
    }
}

