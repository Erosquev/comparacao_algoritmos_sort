package org.example;

class BucketSort {
    private int comparacoes;
    private int movimentacoes;
    static final int M = 5; // número de buckets

    public BucketSort() {
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }



    void bucketSort(int tamanhoVetor, int[] vetor) {
        this.comparacoes = 0;
        this.movimentacoes = 0;
        if (tamanhoVetor == 0) return;

        // Encontra o mínimo e máximo do vetor
        int min = vetor[0];
        int max = vetor[0];

        for (int num : vetor) {
            this.comparacoes +=1;
            if (num < min) min = num;
            this.comparacoes +=1;
            if (num > max) max = num;
        }

        int div = (max - min) / M;
        this.comparacoes +=1;
        if (div == 0) div = 1;

        // Cria buckets
        Node[] buckets = new Node[M];

        // Distribui elementos nos buckets
        for (int num : vetor) {
            int index = (num - min) / div;
            this.comparacoes +=1;
            if (index >= M) index = M - 1;// garante que o maior caia no último bucket
            this.movimentacoes +=3;
            Node novo = new Node(num);
            novo.setProx(buckets[index]);
            buckets[index] = novo;
        }

        // Ordenar cada bucket individualmente por inserçao ordenada
        for (int i = 0; i < M; i++) {
            buckets[i] = inserirSort(buckets[i]);
        }

        // Concatena buckets de volta pro vetor
        int i_retornoVetor = 0;
        for (int i = 0; i < M; i++) {
            Node atual = buckets[i];
            // inverte a lista
            atual = reverterLista(atual);
            while (atual != null) {
                vetor[i_retornoVetor++] = atual.getValor();
                atual = atual.getProx();
            }
        }
    }

    // inserçao ordenada:
    static Node inserirSort(Node head) {
        Node ordenado = null;
        Node atual = head;

        while (atual != null) {
            Node next = atual.getProx();
            ordenado = inserirOrdenado(ordenado, atual);
            atual = next;
        }
        return ordenado;
    }

    // Insere um nó na lista encadeada que ja está ordenada
    static Node inserirOrdenado(Node head, Node node) {
        if (head == null || node.getValor() < head.getValor()) {
            node.setProx(head);
            return node;
        }
        Node atual = head;
        while (atual.getProx() != null && atual.getProx().getValor() < node.getValor()) {
            atual = atual.getProx();
        }
        node.setProx(atual.getProx());
        atual.setProx(node);
        return head;
    }

    // Função para inverter a lista
    static Node reverterLista(Node head) {
        Node anterior = null, atual = head;
        while (atual != null) {
            Node prox = atual.getProx();
            atual.setProx(anterior);
            anterior = atual;
            atual = prox;
        }
        return anterior;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(int movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
}
