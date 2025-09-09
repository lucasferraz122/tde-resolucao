class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void insere(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public int remove() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Removido da fila: " + valorRemovido);
        return valorRemovido;
    }

    public void mostrar() {
        No atual = inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
