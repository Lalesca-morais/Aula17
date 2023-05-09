import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("Digite a nota do aluno de 0 a 10: ");
        double nota = entrada.nextDouble();

        if ((nota < 0) || (nota >=10)) {
            System.out.println("Nota fora da tabela!");
        }else {
            System.out.println(retornoNotas(nota));
        }
    }
    public static char retornoNotas (double nota) {
        char letra;

        if(nota >= 9.00) {
            letra = 'A';
        }else if((nota >= 8.0) && (nota < 9.0)) {
            letra = 'B';
        }else if ((nota >= 7.0) && (nota < 8.0)) {
            letra = 'C';
        }else if((nota >= 6.0) && (nota < 7.0)) {
            letra = 'D';
        }else {
            letra = 'E';
        }
        return letra;
    }
}
