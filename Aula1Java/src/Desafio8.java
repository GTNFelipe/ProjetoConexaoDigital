import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String menu;
        int opcao = 0;
        double saldoEmConta = 5000.00;
        double valorRecebido = 0;


        while (opcao != 4) {
            menu = """
                -----------------------------
                  Dados iniciais do cliente:
                
                  Nome: Felipe Santana
                  Tipo conta: Corrente
                  Saldo inicial: R$ 5000,00
                -----------------------------
                
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
            System.out.println(menu);
            System.out.println("Digite uma opção:");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: R$" + saldoEmConta);

            } else if (opcao == 2) {
                System.out.println("Qual valor será recebido?");
                double valorAReceber = leitura.nextDouble();
                valorRecebido = saldoEmConta+ valorAReceber;
                System.out.println("Seu saldo atualizado é: R$" + valorRecebido);

            } else if (opcao == 3) {
                System.out.println("Qual valor será transferido:");
                double valorSaida = leitura.nextDouble();


                if (valorSaida > valorRecebido) {
                    System.out.println("Seu saldo em conta é menor que R$" + valorSaida + ", então você não poderá realizar a transferência ");

                } else {
                    double saldoAtual = saldoEmConta - valorSaida;
                    System.out.println("Seu saldo atualizado é: R$" + saldoAtual);
                }

            } else if (opcao == 4) {
                System.out.println("Obrigado por utilizar nosso sistema, até mais!");

            } else
                System.out.println("Digite um número entre 1 e 4");
        } leitura.close();
    }
}