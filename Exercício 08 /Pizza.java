import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public Pizza(String nome, double valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}

class Pedido {
    private List<Pizza> pizzas;
    private double valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pedido cancelado");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void gerarRelatorio() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Relatório do Pedido: ");
        System.out.println("Número total de pizzas: " + pizzas.size());
        System.out.println("Valor total do pedido: R$ " + valorTotal);
        double mediaPreco = pizzas.isEmpty() ? 0.0 : valorTotal / pizzas.size();
        System.out.println("Média de preço por pizza: R$ " + mediaPreco);
        System.out.println("Detalhes das Pizzas: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Pizza pizza : pizzas) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("- " + pizza.getNome() + ", Valor: R$ " + pizza.getValor());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
