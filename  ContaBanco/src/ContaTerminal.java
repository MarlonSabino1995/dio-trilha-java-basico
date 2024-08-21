import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Realizar a leitura dos dados, utilizando a classe Scanner 
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Número da conta:  ");
        int numero = sc.nextInt();

        System.out.print("Agência:  ");
        String agencia = sc.next();

        //Um nextLine() extra para limpar o buffer de entrada
        sc.nextLine();
        System.out.print("Titular:  ");
        String nomeCliente = sc.nextLine().toUpperCase();

        System.out.print("Saldo R$ ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        //Escrita das informações recebidas
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco!");
        System.out.printf("Agência: %s\nConta: %d\nSaldo R$ %.2f",agencia,numero,saldo);

        sc.close();
    }
}
