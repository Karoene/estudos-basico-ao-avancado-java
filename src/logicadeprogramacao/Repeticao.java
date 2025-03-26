package logicadeprogramacao;

public class Repeticao {

    public static void main(String[] args) {
        //INSTRUCAO FOR
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
