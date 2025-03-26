package logicadeprogramacao;

public class Condicional {
    public static void main(String[] args) {
        //ISNTRUÇÃO IF
        boolean a =true;
        boolean b =false;
        if (a){
            System.out.println("Entrou no if");
        } else if (b) {
            System.out.println("Entrou no else if");
        }else {
            System.out.println("Entrou no else");
        }
        //SWITCH
        String name = "Fulano";
        switch (name){
            case "Ciclano":
                System.out.println("Não é ele");
                break;
            case "Beltrano":
                System.out.println("Não é ele");
                break;
            case "Fulano":
                System.out.println("É ele");
                break;
            default:
            System.out.println("Tente outro nome");
        }


        //TERNARIO
        int num1 = 10;
        int num2 = 20;

        int maior = (num1 > num2) ? num1 : num2; // maior receberá 2
    }
}
