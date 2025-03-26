package orientacaoaobjetos.abstratas;
/*IMPORTANTE
*Não podem ser instanciadas.
*Podem ter métodos concretos e abstratos.
*Usada para herança
* */
public abstract class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean fazerPix(){
        return true;
    }

    abstract void tipoConta();  //METODDO SEM CORPO, OBRIGATORIO FAZER SOBRESCRITA

}
