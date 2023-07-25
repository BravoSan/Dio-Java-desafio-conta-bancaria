
// TODO: Resolver erro MismathException
import java.util.Locale;
// TODO: Conhecer e importar a classe Scanner
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        // Implatação da classe Scanner

        Scanner contaBancaria = new Scanner(System.in);
        contaBancaria.useLocale(Locale.US);

        // Obter pela Scanner os valores digitados no Terminal

        System.out.println("Por favor, insira seu nome completo: ");
        String nomeCliente = contaBancaria.nextLine();
        System.out.println("Por favor, insira o número de sua Agência (com dígito)? ");
        String agencia = contaBancaria.nextLine();
        System.out.println("Por favor, insira o número de sua conta: ");
        int conta = contaBancaria.nextInt();
        System.out.println("Por favor, insira o saldo disponível: ");
        double saldoConta = contaBancaria.nextDouble();

        contaBancaria.close();

        // Exibir a mensagem da conta criada

        System.out.println("Olá, " + nomeCliente
                + "! Obrigado por abrir uma conta em nosso banco! Sua agência é: " + agencia
                + " Sua conta é: " + conta + " Seu saldo disponível é de R$ " + saldoConta);

    }
}
