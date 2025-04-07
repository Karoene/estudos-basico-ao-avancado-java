/*
Escreva um código que receba um nome e informe quantas vezes letras se repetem (não
conte a primeira)
Exemplo:
repetidas( “Marcos Henrique" ) -> Resultado 2*/
package strings;
public class ContandoChars {

    public static void main(String[] args) {
        String nome = "Marcos Henriqueie";
        nome = nome.toLowerCase().replaceAll("\\s+","");

        int count = 0;
        int soma = 0;

        for (int i = 0; i < nome.length() -1; i++) {
            for (int j = i+1; j < nome.length() ; j++) {
                if (nome.charAt(i) == nome.charAt(j)){
                    nome = nome.replace(i,'');
                    soma = soma+1;
                    break;
                }
            }


        }
        System.out.println(soma);

    }
}
