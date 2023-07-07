package apostila4;
import java.util.Scanner;
import java.lang.Math;
public class atividade3C {  
  public static void main(String[] args) {
        double angulo, arcoCosseno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        angulo = ler.nextDouble();
        arcoCosseno = Math.acos(angulo);
        System.out.println("Arco cosseno: " + arcoCosseno);
    }
}

