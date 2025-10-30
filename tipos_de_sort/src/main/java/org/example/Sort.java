package org.example;

public class Sort {
    private int comparacoes;
    private int movimentacoes;

    public Sort(int comparacoes, int movimentacoes) {
        this.comparacoes = comparacoes;
        this.movimentacoes = movimentacoes;
    }


    void combSort(int tamanhoVetor, int[] vetor) {
        // Zero os contadores
        this.comparacoes = 0;
        this.movimentacoes = 0;

        int sorted = 0;       // Indica se o vetor está ordenado
        int gap = tamanhoVetor;  // defino o intervalo entre os elementos comparados
        int i;
        int segElem;
        int aux;

        // Enquanto o vetor não estiver ordenado o while roda
        while (sorted == 0) {
            // Diminui o gap gradualmente com o fator de encolhimento 1.3
            gap = (int)(gap / 1.3);

            // O gap mínimo é 1
            if (gap <= 1) {
                gap = 1;
                sorted = 1; // Indica que o vetor está ordenado
            }

            // Percorre o vetor comparando elementos distantes 'gap' posições
            for (i = 0; i < tamanhoVetor - gap; i++) {
                segElem = i + gap;

                // Se os elementos estão fora de ordem, troca
                if (vetor[i] > vetor[segElem]) {
                    this.comparacoes++;
                    aux = vetor[segElem];
                    vetor[segElem] = vetor[i];
                    vetor[i] = aux;
                    this.movimentacoes += 3; // aumenta em três movimentações por cada troca
                    sorted = 0; // Ainda está fora de ordem
                }
            }
        }
    }


    void gnomeSort(int tamanhoVetor, int[] vetor) {
        this.comparacoes = 0;
        this.movimentacoes = 0;

        int i = 0;

        //while roda enquanto não tiver percorrido o vetor inteiro
        while (i < tamanhoVetor) {
            // Se o elemento atual está na ordem correta ou é o primeiro do vetor, avança normalmente
            if (i == 0 || vetor[i - 1] <= vetor[i]) {
                i++;
            } else {
                // Caso contrário, troca os elementos fora de ordem e volta uma posição pra trás
                int aux = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = aux;
                i--;
                this.movimentacoes += 3;
            }
            this.comparacoes++;
        }


    }


    void cocktailSort(int tamanhoVetor, int[] vetor) {
        this.comparacoes = 0;
        this.movimentacoes = 0;

        int inicio = 0;
        int fim = tamanhoVetor - 1;
        boolean trocou = true;

        // O while roda até o break quando nada tiver sido trocado ou até a variavel inicio ser igual ao fim
        while (inicio < fim) {
            trocou = false;

            // itera da esquerda para a direita
            for (int i = inicio; i < fim; i++) {
                this.comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    this.movimentacoes += 3;
                    trocou = true;
                }
            }

            // Se nada foi trocado, o vetor está ordenado, fazendo o break do while
            if (!trocou) {
                break;
            }

            trocou = false;
            fim--; // O último elemento já está na posição correta

            // iteração de retorno (direita → esquerda)
            for (int i = fim - 1; i >= inicio; i--) {
                this.comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    this.movimentacoes += 3;
                    trocou = true;
                }
            }

            inicio++; // Aumenta o valor da variavel inicio para a próxima iteração
        }
    }


    void bubbleSort(int tamanhoVetor, int[] vetor) {
        this.comparacoes = 0;
        this.movimentacoes = 0;

        int tamanho = tamanhoVetor;
        boolean trocou;

        // Executa até que nenhuma troca seja feita
        do {
            trocou = false;

            // Percorre o vetor e troca pares fora de ordem
            for (int i = 0; i < tamanho - 1; i++) {
                this.comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    this.movimentacoes += 3;
                    trocou = true;
                }
            }

            // Diminui o tamanho da área de comparação pois o maior elemento ja foi para o final
            tamanho--;
        } while (trocou);
    }


    void selectionSort(int tamanhoVetor, int[] vetor) {
        int tamanho = tamanhoVetor;

        // Percorre o vetor selecionando o menor elemento a cada iteração
        for (int i = 0; i < tamanho - 1; i++) {
            int menorI = i; // é armazenado o índice do menor elemento encontrado
            for (int j = i + 1; j < tamanho; j++) {
                this.comparacoes++;
                if (vetor[j] < vetor[menorI]) {
                    menorI = j;
                }
            }

            // Troca o elemento atual com o menor encontrado
            int aux = vetor[i];
            vetor[i] = vetor[menorI];
            vetor[menorI] = aux;
            this.movimentacoes += 3;
        }
    }

    // Métodos getters e setters para os contadores
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
