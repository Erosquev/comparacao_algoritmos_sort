# Comparativo de Algoritmos de Ordenação

Este documento apresenta a análise de desempenho de diferentes algoritmos de ordenação implementados em Java, considerando número de comparações e movimentações (trocas) realizadas sobre os seguintes três vetores de teste:

vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}.

## Algoritmos Avaliados

- Comb Sort  
- Gnome Sort  
- Bucket Sort  
- Bubble Sort  
- Selection Sort  
- Cocktail Sort


## Métricas Analisadas

- **Comparações:** quantidade de verificações entre elementos.
- **Trocas:** número de movimentações realizadas entre elementos.


## Resultados — Vetor 1 (desordenado)

| Algoritmo       | Comparações | Trocas |
|------------------|--------------|--------|
| Comb Sort        | 22           | 66     |
| Gnome Sort       | 22           | 66     |
| Bucket Sort      | 61           | 60     |
| Bubble Sort      | 22           | 66     |
| Selection Sort   | 22           | 66     |
| Cocktail Sort    | 22           | 66     |

### Análise
- **Menor número de comparações:** Comb, Gnome, Bubble, Selection e Cocktail Sort (22 comparações).  
- **Menor número de trocas:** Bucket Sort (60 trocas).  
- **Melhor desempenho geral:** Bucket Sort, pois movimentou menos elementos.  



## Resultados — Vetor 2 (já ordenado)

| Algoritmo       | Comparações | Trocas |
|------------------|--------------|--------|
| Comb Sort        | 0            | 0      |
| Gnome Sort       | 0            | 0      |
| Bucket Sort      | 0            | 0      |
| Bubble Sort      | 0            | 0      |
| Selection Sort   | 0            | 0      |
| Cocktail Sort    | 0            | 0      |

### Análise
- Todos os algoritmos executaram 0 comparações e 0 trocas, pois o vetor já estava ordenado .  
- **Conclusão:** todos os algoritmos apresentaram o mesmo desempenho.  



## Resultados — Vetor 3 (parcialmente ordenado)

| Algoritmo       | Comparações | Trocas |
|------------------|--------------|--------|
| Comb Sort        | 18           | 54     |
| Gnome Sort       | 18           | 54     |
| Bucket Sort      | 0            | 0      |
| Bubble Sort      | 18           | 54     |
| Selection Sort   | 18           | 54     |
| Cocktail Sort    | 18           | 54     |

### Análise
- **Menor número de comparações:** Bucket Sort (0).  
- **Menor número de trocas:** Bucket Sort (0).  
- **Melhor desempenho geral:** Bucket Sort.  


## Conclusão Geral

| Situação | Melhor Algoritmo | Justificativa |
|-----------|------------------|----------------|
| Vetor 1 (desordenado) | Bucket Sort | Realizou menos movimentações, demonstrando melhor eficiência de agrupamento. |
| Vetor 2 (já ordenado) | Todos | Nenhum algoritmo precisou realizar operações. |
| Vetor 3 (parcialmente ordenado) | Bucket Sort | Foi o único a não precisar de comparações ou trocas. |


## Considerações Finais

- Bucket Sort foi o algoritmo mais eficiente , especialmente quando os dados estavam parcialmente ou totalmente ordenados.  
- Algoritmos simples como Bubble, Gnome, Selection e Cocktail apresentaram desempenho equivalente entre si.  
- Comb Sort manteve desempenho próximo aos básicos.
