import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
       int numeroConta;
       String agencia;
       String nomeCliente;
       double saldo;
       Scanner teclado = new Scanner(System.in);

        System.out.println("CRIANDO CONTA");
        System.out.println("Por favor, digite seu nome completo: ");
        nomeCliente = teclado.nextLine();
        System.out.println("Por favor, digite a agência: ");
        agencia = teclado.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta= teclado.nextInt();
        System.out.println("Por favor, digite seu saldo: ");
        saldo = teclado.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigada por criar uma conta em nosso banco, sua agência é "
                +agencia+", conta "+numeroConta+" e seu saldo R$"+saldo+" já está disponível para saque.");

    }
}