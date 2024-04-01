import java.util.Scanner;

public class Biblioteca {
    private Livro[] livros; 
    private int numLivros;  

    
    public Biblioteca(int tamanhoMaximo) {
        livros = new Livro[tamanhoMaximo];
        numLivros = 0;
    }

   
    public void cadastrarLivro(String titulo, String autor, int ano) {
        Livro novoLivro = new Livro(titulo, autor, ano);
        livros[numLivros] = novoLivro;
        numLivros++;
        System.out.println("Livro cadastrado com sucesso!");
    }

    
    public void exibirLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < numLivros; i++) {
            System.out.println("Livro " + (i+1) + ":");
            livros[i].exibirInfo();
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo à sua biblioteca pessoal!");

        
        Biblioteca minhaBiblioteca = new Biblioteca(10);

        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Exibir livros");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 
            switch (opcao) {

                case 1:
                    System.out.println("\nCadastro de livro:");
                    System.out.print("Digite o título do livro: ");
                    String titulo = leitor.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = leitor.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = leitor.nextInt();
                    minhaBiblioteca.cadastrarLivro(titulo, autor, ano);
                    break;

                case 2:
                    System.out.println("\nLivros na biblioteca: ");
                    minhaBiblioteca.exibirLivros();
                    break;
                case 3:

                    System.out.println("Saindo.");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        leitor.close();
    }
}
