package Aula08;

public class Pesado_mercadorias extends Pesados{
    private int carga_max;

    public Pesado_mercadorias(String matricula, String marca, String modelo, int potencia,int quadro, int peso,int carga_max){
        super(matricula, marca, modelo, potencia,quadro, peso);
       this.carga_max = carga_max;
    }

    public int getCarga_max(){return carga_max;}
    public void setCarga_max(int carga_max) {this.carga_max = carga_max;}
}
