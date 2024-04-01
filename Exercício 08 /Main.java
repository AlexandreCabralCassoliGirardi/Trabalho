import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Pizza> pizzasDisponiveis = new ArrayList<>();
        List<String> ingredientesMussarela = new ArrayList<>();
        ingredientesMussarela.add("Molho de tomate");
        ingredientesMussarela.add("Mussarela");
        Pizza pizzaMussarela = new Pizza("Mussarela", 25.0, ingredientesMussarela);

        List<String> ingredientesCalabresa = new ArrayList<>();
        ingredientesCalabresa.add("Molho de tomate");
        ingredientesCalabresa.add("Calabresa");
        Pizza pizzaCalabresa = new Pizza("Calabresa", 28.0, ingredientesCalabresa);

        pizzasDisponiveis.add(pizzaMussarela);
        pizzasDisponiveis.add(pizzaCalabresa);

        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        boolean continuar = true;
        while (continuar) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menu:");
            System.out.println("1. Adicionar pizza ao pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Gerar relatório do pedido");
            System.out.println("4. Sair");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Menu de Pizzas Disponíveis: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    for (int i = 0; i < pizzasDisponiveis.size(); i++) {
                        System.out.println((i + 1) + ". " + pizzasDisponiveis.get(i).getNome());
                    }

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Escolha o número da pizza desejada: ");
                    int escolha = scanner.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    if (escolha >= 1 && escolha <= pizzasDisponiveis.size()) {
                        Pizza pizzaEscolhida = pizzasDisponiveis.get(escolha - 1);
                        pedido.adicionarPizza(pizzaEscolhida);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Pizza adicionada ao pedido");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    } 
                    else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Opção inválida");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                case 2:
                    pedido.cancelarPedido();
                    break;
                case 3:
                    pedido.gerarRelatorio();
                    public class Main {
    public static void main(String[] args) {


        List<Pizza> pizzasDisponiveis = new ArrayList<>();
        List<String> ingredientesMussarela = new ArrayList<>();
        ingredientesMussarela.add("Molho de tomate");
        ingredientesMussarela.add("Mussarela");
        Pizza pizzaMussarela = new Pizza("Mussarela", 25.0, ingredientesMussarela);

        List<String> ingredientesCalabresa = new ArrayList<>();
        ingredientesCalabresa.add("Molho de tomate");
        ingredientesCalabresa.add("Calabresa");
        Pizza pizzaCalabresa = new Pizza("Calabresa", 28.0, ingredientesCalabresa);

        pizzasDisponiveis.add(pizzaMussarela);
        pizzasDisponiveis.add(pizzaCalabresa);

        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        boolean continuar = true;
        while (continuar) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menu:");
            System.out.println("1. Adicionar pizza ao pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Gerar relatório do pedido");
            System.out.println("4. Sair");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Menu de Pizzas Disponíveis: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    for (int i = 0; i < pizzasDisponiveis.size(); i++) {
                        System.out.println((i + 1) + ". " + pizzasDisponiveis.get(i).getNome());
                    }

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Escolha o número da pizza desejada: ");
                    int escolha = scanner.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    if (escolha >= 1 && escolha <= pizzasDisponiveis.size()) {
                        Pizza pizzaEscolhida = pizzasDisponiveis.get(escolha - 1);
                        pedido.adicionarPizza(pizzaEscolhida);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Pizza adicionada ao pedido");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    } 
                    else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Opção inválida");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                case 2:
                    pedido.cancelarPedido();
                    break;
                case 3:
                    pedido.gerarRelatorio();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case 4:
                    continuar = false;
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Saindo");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Opção inválida");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
            }
        }

        scanner.close();
    }
}
                    break;
                case 4:
                    continuar = false;
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Saindo");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Opção inválida");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
            }
        }

        scanner.close();
    }
}
