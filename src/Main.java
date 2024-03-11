import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar veículo cadastrado");
            System.out.println("3 - Buscar veículo por parte do nome");
            System.out.println("4 - Cadastrar cliente (Pessoa Física)");
            System.out.println("5 - Cadastrar cliente (Pessoa Jurídica)");
            System.out.println("6 - Alterar cliente (Pessoa Física)");
            System.out.println("7 - Alterar cliente (Pessoa Jurídica)");
            System.out.println("8 - Alugar veículo para pessoa física");
            System.out.println("9 - Alugar veículo para pessoa jurídica");
            System.out.println("10 - Devolver veículo de aluguel");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    alterarVeiculo();
                    break;
                case 3:
                    buscarVeiculoPorParteNome();
                    break;
                case 4:
                    cadastrarClientePessoaFisica();
                    break;
                case 5:
                    cadastrarClientePessoaJuridica();
                    break;
                case 6:
                    alterarClientePessoaFisica();
                    break;
                case 7:
                    alterarClientePessoaJuridica();
                    break;
                case 8:
                    alugarVeiculoPessoaFisica();
                    break;
                case 9:
                    alugarVeiculoPessoaJuridica();
                    break;
                case 10:
                    devolverVeiculo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarVeiculo() {
    }

    private static void alterarVeiculo() {
    }

    private static void buscarVeiculoPorParteNome() {
    }

    private static void cadastrarClientePessoaFisica() {

    }

    private static void cadastrarClientePessoaJuridica() {

    }

    private static void alterarClientePessoaFisica() {

    }

    private static void alterarClientePessoaJuridica() {

    }

    private static void alugarVeiculoPessoaFisica() {

    }

    private static void alugarVeiculoPessoaJuridica() {

    }

    private static void devolverVeiculo() {

    }
}