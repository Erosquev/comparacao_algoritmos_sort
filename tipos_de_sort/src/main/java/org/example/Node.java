package org.example;

public class Node {
    int valor;
    Node prox;

    Node(int valor) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}

