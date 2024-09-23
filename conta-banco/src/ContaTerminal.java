import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        //Exibir as mensagens para o nosso usuario

        System.out.println("Por favor, digite o número");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agencia");
        agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente:");
        nomeCliente = scanner.next();
        scanner.next();
        System.out.println();

        /*
        System.out.println("Por favor, digite o Saldo");
        saldo = scanner.nextDouble();*/

        //Obter pela scanner os valores digitados no terminal


        //Exibir a menagem conta criada

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo $" + saldo + " já está disponivel para saque");
        
    

    }
}
