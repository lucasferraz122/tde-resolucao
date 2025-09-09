class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public int remove() {
        if (topo == null) {
            System.out.println("pilha vazia");
            return -1;
        }
        int valorRemovido = topo.valor;
        topo = topo.proximo;
        System.out.println("removido da pilha: " + valorRemovido);
        return valorRemovido;
    }

    public void mostrar() {
        No atual = topo;
        System.out.print("pilha: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
