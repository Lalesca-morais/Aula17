import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = 1, canal = 1;
        while (true) {
            System.out.println("-----------MENU CANAIS-----------");
            System.out.println("1 Aumentar volume");
            System.out.println("2 Diminuir volume");
            System.out.println("3 Aumentar canal");
            System.out.println("4 Diminuir canal");
            System.out.println("5 Desligar");
            System.out.println("6 Consultar volume");
            System.out.println("7 Consultar canal");
            int opcaoUsuario = scanner.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    if (volume == 10) {
                        System.out.println("Volume máximo atingido");
                    } else {
                        volume++;
                    }
                    break;
                case 2:
                    if (volume == 0) {
                        System.out.println("Volume mínimo atingido");
                    } else
                        volume--;
                case 3:
                    if (canal == 15) {
                        canal = 1;
                    } else {
                        canal++;
                    }
                    break;
                case 4:
                    if (canal == 1) {
                        canal = 15;
                    } else {
                        canal--;
                    }
                    break;
                case 5:
                    System.out.println("Desligando...");
                    break;
                case 6:
                    System.out.println("Seu volume está em: " + volume);
                    break;
                case 7:
                    System.out.println("Você está no canal: " + canal);
                    break;
                default:
                    System.out.println("Opção indisponível!");
            }
            if (opcaoUsuario == 5) {
                break;
            }
        }
    }
}
