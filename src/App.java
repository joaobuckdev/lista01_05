import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double metros;

        System.out.print("Insira o valor a ser convertido: ");

        Scanner teclado = new Scanner(System.in);
        metros = teclado.nextDouble();

        System.out.println("O valor convertido para centímetros: " + metros*100);
    }
}
