package Aula08;

public class Taxi extends Auto_ligeiro  {
    private int n_licenca;

    public Taxi(String matricula, String marca, String modelo, int potencia,int quadro, int cap_bag, int n_licenca){
        super(matricula, marca, modelo, potencia,quadro, cap_bag);
        this.n_licenca = n_licenca;       
    }

    public int getN_licenca(){
        return n_licenca;
    }

    public void setN_licenca(int n_licenca){
        this.n_licenca = n_licenca;
    }
}
