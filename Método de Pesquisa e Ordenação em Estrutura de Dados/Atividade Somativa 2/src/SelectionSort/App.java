package SelectionSort;

public class App {
    public static void main(String[] args) throws Exception {
        int vetorito[] = { 3, 6, 8, 1, 4, 9, 0 };
        System.out.println("Estrutura desordenada:");
        System.out.println("|Posicao  -   Valor|");
        for (int i = 0; i < vetorito.length; i++) {
            System.out.println("|" + i + "        -       " + vetorito[i] + "|");
        }
        System.out.println("--------------------");
        System.out.println("Reordernando com Selection Sort os números:");
        int posicaomenor, aux;
        for (int i = 0; i < vetorito.length; i++) {
            posicaomenor = i;
            for (int j = i + 1; j < vetorito.length; j++) {
                if (vetorito[j] < vetorito[posicaomenor]) {
                    posicaomenor = j;
                }
            }
            aux = vetorito[posicaomenor];
            vetorito[posicaomenor] = vetorito[i];
            vetorito[i] = aux;

        }

        System.out.println("Estrutura ordenada:");
        System.out.println("|Posicao  -   Valor|");
        for (int i = 0; i < vetorito.length; i++) {
            System.out.println("|" + i + "        -       " + vetorito[i] + "|");
        }
    }
}