package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};


        Sort comb1 = new Sort(0,0);
        Sort comb2 = new Sort(0,0);
        Sort comb3 = new Sort(0,0);

        Sort gnome1 = new Sort(0,0);
        Sort gnome2 = new Sort(0,0);
        Sort gnome3 = new Sort(0,0);

        BucketSort bucket1 = new BucketSort();
        BucketSort bucket2 = new BucketSort();
        BucketSort bucket3 = new BucketSort();

        Sort bubble1 = new Sort(0,0);
        Sort bubble2 = new Sort(0,0);
        Sort bubble3 = new Sort(0,0);

        Sort selection1 = new Sort(0,0);
        Sort selection2 = new Sort(0,0);
        Sort selection3 = new Sort(0,0);

        Sort cocktail1  = new Sort(0,0);
        Sort cocktail2  = new Sort(0,0);
        Sort cocktail3  = new Sort(0,0);


        //Fazendo o sort do vetor 1:
        System.out.println("SORT VETOR 1:");
        comb1.combSort( 20, vetor1);
        int trocasComb1 = comb1.getMovimentacoes();
        int comparacoesComb1 = comb1.getComparacoes();
        gnome1.gnomeSort(20, vetor1);
        int trocasGnome1 = comb1.getMovimentacoes();
        int comparacoesGnome1 = comb1.getComparacoes();
        bucket1.bucketSort(20, vetor1);
        int trocasBucket1 = bucket1.getMovimentacoes();
        int comparacoesBucket1 = bucket1.getComparacoes();
        bubble1.bubbleSort(20, vetor1);
        int trocasBubble1 = comb1.getMovimentacoes();
        int comparacoesBubble1 = comb1.getComparacoes();
        selection1.selectionSort(20, vetor1);
        int trocasSelection1 = comb1.getMovimentacoes();
        int comparacoesSelection1 = comb1.getComparacoes();
        cocktail1.cocktailSort(20, vetor1);
        int trocasCocktail1 = comb1.getMovimentacoes();
        int comparacoesCocktail1 = comb1.getComparacoes();

        System.out.println();
        System.out.println("comparacoesComb1: " + comparacoesComb1);
        System.out.println("trocasComb1: " + trocasComb1);
        System.out.println("comparacoesGnome1: " + comparacoesGnome1);
        System.out.println("trocasGnome1: " + trocasGnome1);
        System.out.println("trocasBucket1: " + trocasBucket1);
        System.out.println("comparacoesBucket1: " + comparacoesBucket1);
        System.out.println("comparacoesBubble1: " + comparacoesBubble1);
        System.out.println("trocasBubble1: " + trocasBubble1);
        System.out.println("comparacoesSelection1: " + comparacoesSelection1);
        System.out.println("trocasSelection1: " + trocasSelection1);
        System.out.println("comparacoesSelection1: " + comparacoesSelection1);
        System.out.println("trocasCocktail1: " + trocasCocktail1);
        System.out.println("comparacoesCocktail1: " + comparacoesCocktail1);

        System.out.println();
        System.out.println("-----------------");
        System.out.println();


        //Fazendo o sort do vetor 2:
        System.out.println("SORT VETOR 2:");
        comb2.combSort( 20, vetor2);
        int trocasComb2 = comb2.getMovimentacoes();
        int comparacoesComb2 = comb2.getComparacoes();
        gnome2.gnomeSort(20, vetor2);
        int trocasGnome2 = comb2.getMovimentacoes();
        int comparacoesGnome2 = comb2.getComparacoes();
        int trocasBucket2 = bucket2.getMovimentacoes();
        int comparacoesBucket2 = bucket2.getComparacoes();
        bubble2.bubbleSort(20, vetor2);
        int trocasBubble2 = comb2.getMovimentacoes();
        int comparacoesBubble2 = comb2.getComparacoes();
        selection2.selectionSort(20, vetor2);
        int trocasSelection2 = comb2.getMovimentacoes();
        int comparacoesSelection2 = comb2.getComparacoes();
        cocktail2.cocktailSort(20, vetor2);
        int trocasCocktail2 = comb2.getMovimentacoes();
        int comparacoesCocktail2 = comb2.getComparacoes();

        System.out.println();
        System.out.println("comparacoesComb2: " + comparacoesComb2);
        System.out.println("trocasComb2: " + trocasComb2);
        System.out.println("comparacoesGnome2: " + comparacoesGnome2);
        System.out.println("trocasGnome2: " + trocasGnome2);
        System.out.println("trocasBucket2: " + trocasBucket2);
        System.out.println("comparacoesBucket2: " + comparacoesBucket2);
        System.out.println("comparacoesBubble2: " + comparacoesBubble2);
        System.out.println("trocasBubble2: " + trocasBubble2);
        System.out.println("comparacoesSelection2: " + comparacoesSelection2);
        System.out.println("trocasSelection2: " + trocasSelection2);
        System.out.println("comparacoesSelection2: " + comparacoesSelection2);
        System.out.println("trocasCocktail2: " + trocasCocktail2);
        System.out.println("comparacoesCocktail2: " + comparacoesCocktail2);

        System.out.println();
        System.out.println("-----------------");
        System.out.println();


        //Fazendo o sort do vetor 3:
        System.out.println("SORT VETOR 3:");
        comb3.combSort( 20, vetor3);
        int trocasComb3 = comb3.getMovimentacoes();
        int comparacoesComb3 = comb3.getComparacoes();
        gnome3.gnomeSort(20, vetor3);
        int trocasGnome3 = comb3.getMovimentacoes();
        int comparacoesGnome3 = comb3.getComparacoes();
        int trocasBucket3 = bucket3.getMovimentacoes();
        int comparacoesBucket3 = bucket3.getComparacoes();        bubble3.bubbleSort(20, vetor3);
        int trocasBubble3 = comb3.getMovimentacoes();
        int comparacoesBubble3 = comb3.getComparacoes();
        selection3.selectionSort(20, vetor3);
        int trocasSelection3 = comb3.getMovimentacoes();
        int comparacoesSelection3 = comb3.getComparacoes();
        cocktail3.cocktailSort(20, vetor3);
        int trocasCocktail3 = comb3.getMovimentacoes();
        int comparacoesCocktail3 = comb3.getComparacoes();


        System.out.println();
        System.out.println("comparacoesComb3: " + comparacoesComb3);
        System.out.println("trocasComb3: " + trocasComb3);
        System.out.println("comparacoesGnome3: " + comparacoesGnome3);
        System.out.println("trocasGnome3: " + trocasGnome3);
        System.out.println("trocasBucket3: " + trocasBucket3);
        System.out.println("comparacoesBucket3: " + comparacoesBucket3);
        System.out.println("comparacoesBubble3: " + comparacoesBubble3);
        System.out.println("trocasBubble3: " + trocasBubble3);
        System.out.println("comparacoesSelection3: " + comparacoesSelection3);
        System.out.println("trocasSelection3: " + trocasSelection3);
        System.out.println("comparacoesSelection3: " + comparacoesSelection3);
        System.out.println("trocasCocktail3: " + trocasCocktail3);
        System.out.println("comparacoesCocktail3: " + comparacoesCocktail3);


        System.out.println();
        System.out.println("-----------------");
        System.out.println();










    }
}

