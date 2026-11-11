import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Como te chamas?");
        String nome = ler.nextLine();
        System.out.println("Ola, "+nome);
        ler.close();
    }
}