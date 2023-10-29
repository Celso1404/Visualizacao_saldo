import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner auxiliar = new Scanner(System.in);
        String nome = "Celso Bitello";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("INFORMAÇÕES DO CLIENTE");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("***********************");

        String menu = """
                   ** Digite aqui a opção desejada:**
                   1) Consultar saldo;
                   2) Transferir valor;
                   3) Receber valor;
                   4) Sair.
                      """;

            while (opcao != 4) {
                System.out.println(menu);
                opcao = auxiliar.nextInt();

                if (opcao == 1) {
                    System.out.println("Você possuí R$ " + saldo + " em conta");
                } else if(opcao == 2) {
                    System.out.println("Quanto você deseja enviar? ");
                    double valor = auxiliar.nextDouble();
                        if (valor > saldo) {
                            System.out.println("Valor indísponível na conta.");
                        } else {
                            saldo -= valor;
                            System.out.println("Valor enviado com sucesso.");
                            System.out.println("Saldo atual: R$ " + saldo);
                        }
                } else if (opcao == 3) {
                    System.out.println("Quanto quer receber? ");
                    double valor_recebido = auxiliar.nextDouble();
                    saldo += valor_recebido;

                    System.out.println("Saldo atual: " + saldo);
                } else if (opcao == 4) {
                    System.out.println("Programa encerrando!");
                    auxiliar.close();
                    break;
                }
        }
    }
}
