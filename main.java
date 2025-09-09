import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao;
        do {
            System.out.println("\n1 - empilhar na pilha");
            System.out.println("2 - remover da pilha");
            System.out.println("3 - mostrar pilha");
            System.out.println("4 - inserir na fila");
            System.out.println("5 - remover da fila");
            System.out.println("6 - mostrar fila");
            System.out.println("0 - sair");
            System.out.print("escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("digite um valor: ");
                    pilha.empilhar(sc.nextInt());
                    break;
                case 2:
                    pilha.remove();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 4:
                    System.out.print("digite um valor: ");
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
