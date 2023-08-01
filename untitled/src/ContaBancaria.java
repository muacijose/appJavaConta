import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Muaci josé ";
        String tipoConta = "Corrente";
        double saldoConta = 1599.99;
        int opcao = 0;
        System.out.println("************************************\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("saldo da conta: " + saldoConta);
        System.out.println("\n************************************");

        String menu = """
                *** Gigite sua Opção ***
                 1 - Consultar saldo 
                 2 - Transferir valores
                 3 - Receber valores               
                 4 - sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O Saldo atualizado é " + saldoConta );
            }else if(opcao == 2){
                System.out.println(" Qual o valor que deseja Transferir");
                double val = leitura.nextDouble();
                if (val > saldoConta){
                    System.out.println("não há saudo para realizar a tranferência");
                }else {
                    saldoConta = saldoConta - val;
                    System.out.println("Novo Saldo " + saldoConta);
                }
            } else if (opcao == 3) {
                System.out.println("Valor Recebido:");
                double valor= leitura.nextDouble();
                saldoConta = saldoConta + valor;
                System.out.println("Novo Saldo " + saldoConta);
            } else if (opcao != 4) {
                System.out.println("opcao invalida ");

            }


        }


    }
}
