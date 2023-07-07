package apostila3;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args)
    {
        int Num1, Num2, soma;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        Num1 = leia.nextInt();
        System.out.print("Digite o segundo numero: ");
        Num2 = leia.nextInt();
        soma = Num1 + Num2;
        System.out.println("Soma: " + soma);
    }
}

