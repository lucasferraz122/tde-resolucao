import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao;
        do {
            System.out.println("\n1 - Empilhar na Pilha");
            System.out.println("2 - Remover da Pilha");
            System.out.println("3 - Mostrar Pilha");
            System.out.println("4 - Inserir na Fila");
            System.out.println("5 - Remover da Fila");
            System.out.println("6 - Mostrar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    pilha.empilhar(sc.nextInt());
                    break;
                case 2:
                    pilha.remove();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 4:
                    System.out.print("Digite um valor: ");
                    fila.insere(sc.nextInt());
                    break;
                case 5:
                    fila.remove();
                    break;
                case 6:
                    fila.mostrar();
                    break;
            }
        } while(opcao != 0);

        sc.close();
    }
}
