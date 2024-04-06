import java.util.Scanner;

public class Beecrowd1177 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.close();
        int valor = 0;
        int [] Numero = new int[1000];

        for(int i = 0; i < Numero.length; i++){
            if (valor < T) {
                Numero[i] = valor;
                System.out.println("N[" + i + "] = " + Numero[i]);
                valor++;
            } else{
                valor = 0;
                Numero[i] = valor;
                System.out.println("N[" + i + "] = " + Numero[i]);
                valor++;
            }
        }
    }
}