/*
Escreva um código que receba um nome e informe quantas letras se repetem (não
conte a primeira)
Exemplo:
repetidas( “Marcos Henrique" ) -> Resultado 2*/
package strings;
import java.util.HashMap;  // Importa a classe HashMap para armazenar pares (letra, quantidade)
import java.util.Map;      // Importa a interface Map, que HashMap implementa
import java.util.Scanner;  // Importa a classe Scanner para ler entrada do usuário

public class ContandoChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria o Scanner para ler entrada do teclado
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine()           // Lê a linha completa com o nome
                .toLowerCase()           // Converte todas as letras para minúsculas
                .replaceAll("\\s+", ""); // Remove todos os espaços da string
        scanner.close(); // Fecha o Scanner (boa prática para evitar vazamentos de recurso)

        Map<Character, Integer> frequencia = new HashMap<>();
        // Cria um mapa onde a chave é a letra e o valor é a quantidade de vezes que ela aparece

        int repetidas = 0; // Contador para letras que aparecem mais de uma vez (sem contar a primeira)

        // Converte o nome para um array de caracteres e percorre cada caractere
        for (char c : nome.toCharArray()) {
            // Verifica se a letra já está no mapa (ou seja, já apareceu antes)
            if (frequencia.containsKey(c)) {
                // Se ela apareceu exatamente 1 vez, agora está aparecendo pela segunda vez
                // Então é uma repetição (mas só contamos a repetição, não a primeira vez que apareceu)
                if (frequencia.get(c) == 1) {
                    repetidas++; // Incrementa o contador de repetidas
                }
                // Atualiza a contagem daquela letra no mapa
                frequencia.put(c, frequencia.get(c) + 1);
            } else {
                // Se a letra nunca apareceu antes, adiciona no mapa com valor 1
                frequencia.put(c, 1);
            }
        }

        // Exibe o total de letras que se repetiram (sem contar a primeira vez)
        System.out.println("Letras que se repetem (sem contar a primeira): " + repetidas);
    }
}
