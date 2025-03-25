package logicadeprogramacao;

public class VariaveisEOperadores {
    public static void main(String[] args) {
        //TIPOS DE VARIAVEIS, DE PRIMITIVOS A OBJETOS
        byte num1 = 127;
        short num2 = 32767;
        long num3 = 10000000L;

        float num4 = 123.4F;
        double num5 = 1234567890.1;

        char num6 = 'a';
        String num7 = "abc";

        boolean num8 = true;

        int num9 =  2147483647;

        //OPRERADORES
        String[] opSimples = {"=", "+","-","/", "*","%", "=="};
        String[] atribuicaoComposta = {"/=", "+=","-=","*=","%="};
        String[] opRelacionais = {"<=", ">="};

        //booleanos
        String[] opBoo = {"!", "|","||","&", "&&"};

        //incrmente e decremento
        System.out.println(++num6);
        System.out.println(--num4);

    }
}
