
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("001", "1234", "Diogo");
        boolean continuar = true;

         while (continuar){
            System.out.print("-----DIGITE UMA DAS OPÇÕES A BAIXO----- \n\n(D) = DEPOSITAR\n(S) = SACAR\n(E) = ENCERRAR A CONTA\n\nDIGITE AQUI:  ");
            String op = scanner.nextLine();

            if (op.equalsIgnoreCase("D")){
                System.out.print("QUAL VALOR DESEJA DEPOSITAR: ");
                double value = 0.0;
                boolean entradavalida = false;

                while (!entradavalida){
                    if(scanner.hasNextDouble()){ // Verifica se é um número
                        value = scanner.nextDouble();
                        if (value > 0){
                            entradavalida = true;
                        }else {
                            System.out.println("O VALOR DEVE SER MAIOR QUE (0). TENTE NOVAMENTE .");
                        }
                    }else {
                            System.out.println(" ENTRADA INVÁLIDA. POR FAVOR, DIGITE APENAS NÚMEROS.");
                            scanner.next(); // Descarta a entrada inválida
                            System.out.print("DIGITE AQUI O VALOR: ");
                        }
                }

                account.deposit(value);
                scanner.nextLine(); // Limpa o buffer

            } else if (op.equalsIgnoreCase("S")) {
                System.out.print("QUAL VALOR DESEJA SACAR: " );
                boolean entradavalida= false;
                double value = 0.0;
                 while (!entradavalida){
                    if(scanner.hasNextDouble()){ // Verifica se é um número
                        value = scanner.nextDouble();
                        if (value > 0){
                            entradavalida = true;
                        }else {
                            System.out.println("O VALOR DEVE SER MAIOR QUE (0). TENTE NOVAMENTE .");
                        }
                    }else {
                            System.out.println(" ENTRADA INVÁLIDA. POR FAVOR, DIGITE APENAS NÚMEROS.");
                            scanner.next(); // Descarta a entrada inválida
                            System.out.print("DIGITE AQUI O VALOR: ");
                        }
                }

                 account.withDraw(value);
                scanner.nextLine(); // Limpa o buffer

            } else if (op.equalsIgnoreCase("E")) {
                System.out.print("SAINDO DA CONTA, PROGRAMA ENCERRANDO ... ");
                continuar = false;
            }else {
                System.out.print("COMANDO INVALIDO TENTE NOVAMENTE");

            }
            scanner = new Scanner(System.in);
         }
    }

}

