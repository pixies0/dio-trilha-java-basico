import java.util.Scanner;

public class ContaTerminal {

    // Atributos da classe ContaTerminal
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor da classe ContaTerminal
    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void mensagemBoasVindas(String nomeCliente, int numeroConta, String agencia, double saldo) {
        limparConsole();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é %s, conta %d e seu saldo R$%.2f já está disponivel pra salque.\n", nomeCliente, agencia,
                numeroConta, saldo);
    }

    private static void coletarDadosConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\n--- Pressione ENTER para continuar ---");
        scanner.nextLine();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);
        mensagemBoasVindas(conta.nomeCliente, conta.numeroConta, conta.agencia, conta.saldo);

        scanner.close();
    }

    /* Metodo principal
     *
     * @param args Argumentos de linha de comando (não utilizados)
     * @throws Exception Se ocorrer algum erro durante a execução
     * @return void
     */
    public static void main(String[] args) throws Exception {
        coletarDadosConta();
    }
}
