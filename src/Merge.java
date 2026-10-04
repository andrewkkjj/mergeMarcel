public class Merge {

    public static void mergeSort(Jogo[] jogos, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            // Ordena a primeira metade
            mergeSort(jogos, inicio, meio);

            // Ordena a segunda metade
            mergeSort(jogos, meio + 1, fim);

            // Junta as duas metades
            merge(jogos, inicio, meio, fim);
        }
    }

    public static void merge(Jogo[] jogos, int inicio, int meio, int fim) {

        int tamanho = fim - inicio + 1;

        Jogo[] auxiliar = new Jogo[tamanho];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        // Compara os elementos das duas partes
        while (i <= meio && j <= fim) {

            if (jogos[i].nota >= jogos[j].nota) {
                auxiliar[k] = jogos[i];
                i++;
            } else {
                auxiliar[k] = jogos[j];
                j++;
            }

            k++;
        }

        // Copia o restante da primeira parte
        while (i <= meio) {
            auxiliar[k] = jogos[i];
            i++;
            k++;
        }

        // Copia o restante da segunda parte
        while (j <= fim) {
            auxiliar[k] = jogos[j];
            j++;
            k++;
        }

        // Copia de volta para o vetor original
        for (i = 0; i < tamanho; i++) {
            jogos[inicio + i] = auxiliar[i];
        }
    }
}