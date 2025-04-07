/*  COMO VERIFICAR DE UMA PALAVRA É PALINDROMA?
Uma palavra é palindroma quando é possível lê-la de tras para frente e sem mudar de estrutura,
é aquela que pode ser lida da mesma forma de trás pra frente.
ex: arara  >> arara,  ana >> ana,  reviver >> reviver
Dot I was saw I tod
*/
package strings;
public class Palindroma {
    public static void main(String[] args) {
        ///////////////////////////////////////////// PALAVRA
        /* Palavra a ser analisada e conversao para minusculo*/
        String palavra = "bananaa";
        palavra = palavra.toLowerCase();

        /* logica para comparar cada caractere do incio e fim da string */
        boolean isPalindrome = true;
        int fim = palavra.length() -1;
        for (int i = 0; i < fim; i++) {
            if (palavra.charAt(i) != palavra.charAt(fim)){
                isPalindrome = false;
                break;
            }
            fim--;
        }
        System.out.println("É palindroma? " + isPalindrome);

        /////////////////////////////////////////// FRASE
        isPalindrome =true;
        String frase = "    Socorram me subi no onibus em Marrocos";
        frase = frase.toLowerCase().replaceAll("\\s+", "");
        int j = frase.length() -1;
        for (int i = 0; i < j ; i++) {
            if (frase.charAt(i) != frase.charAt(j) ){
                isPalindrome = false;
                break;
            }
            j--;

        }
        System.out.println(isPalindrome);


    }
}
