package logicadeprogramacao;

public class Repeticao {

    public static void main(String[] args) {
        //INSTRUCAO FORi
        for (int i = 0; i < 10; i++){
            // bloco de código
            System.out.println("O valor é: "+ i);
        }

        //FOR-EACH
        int[] matrizTeste = {1,5,7,8};
        for (int a : matrizTeste){  //variavel a é do tipo de dados dos elementos da matriz
            //bloco de código
            System.out.println(a);  //vai imprimir cada elemento da matrizTeste
        }

        // COM MATRIZ
        int[][] matrizTeste2 = {{1,5,7,8}, {1,3,3}};
        for (int[] linha : matrizTeste2) {           // Para cada linha (array) da matriz
            for (int valor : linha) {                // Para cada valor dentro da linha
                System.out.print(valor + " ");       // Imprime o valor com espaço
            }
            System.out.println();                    // Pula uma linha após cada linha da matriz
        }


        //DO-WHILE   e WHILE
        boolean temp = true;
        while(temp){
            // BLOCO DE CÓDIGO AQUI
        }
        do { //executa pelo menos uma vez
            // BLOCO DE CÓDIGO AQUI
        }while (temp);





    }
}
