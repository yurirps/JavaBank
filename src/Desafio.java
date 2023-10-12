import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        double saldo = 500;
        double adicinaSaldo;
        double tranferirSaldo;
        String tipoConta = "Corrente";
        int opcao;
        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("Dados do Cliente: \n");

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("******************************************* \n");

        System.out.println(" Operações: selecione a opção desejada");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 Sacar Dinheiro");
        System.out.println("0 Sair");

        opcao = leitura.nextInt();

        while (true) {
            System.out.println(" Operações: selecione a opção desejada");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar Dinheiro");
            System.out.println("0 - Sair");

            opcao = leitura.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do programa.");
                break;  // Encerra o loop quando o usuário escolhe a opção 0
            }

            switch (opcao) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1 - Consulta Saldo");
                    System.out.println("Saldo Atual: R$ "+saldo);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("2 - Depositar Saldo");
                    System.out.println("Valor a ser depositado: ");
                    adicinaSaldo = leitura.nextDouble();
                    saldo += adicinaSaldo;
                    System.out.println("Saldo atualizado: R$"+saldo);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case 3:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("3 - Transferir Saldo");
                    System.out.println("Valor a ser sacado: ");
                    tranferirSaldo = leitura.nextDouble();
                    if (tranferirSaldo > saldo) {
                        System.out.println("Saldo insuficiente");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    } else {
                        saldo -= tranferirSaldo;
                        System.out.println("Saldo atualizado: R$"+saldo);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        leitura.close(); // Feche o scanner quando terminar
    }
}