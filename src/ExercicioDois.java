import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println(dizerInformacao(nome));
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println(dizerInformacao(idade));
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println(dizerInformacao(peso, altura));
    }
    public static String dizerInformacao(String nome) {
        return "Meu nome é  " +nome;
    }
    public static String dizerInformacao(int idade) {
        return "Minha idade é: "+idade;
    }
    public static String dizerInformacao (double peso, double altura) {

        return "Meu peso év" +peso+ " e " + " minha altura é " +altura;
    }
}
