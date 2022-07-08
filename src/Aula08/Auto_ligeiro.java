package Aula08;

public class Auto_ligeiro extends Veiculos {
    private int quadro;
    protected int cap_bag;

    public Auto_ligeiro(String matricula, String marca, String modelo, int potencia,int quadro, int cap_bag){
        super(matricula, marca, modelo, potencia);
        this.quadro = quadro;
        this.cap_bag = cap_bag;       
    }
    
    public int getQuadro(){return quadro;}
    public int getCap_bag(){return cap_bag;}

    public void setQuadro(int quadro){this.quadro = quadro;}
    public void setCap_bag(int cap_bag){this.quadro = cap_bag;}

    @Override
    public String toString(){
        return "Matricula: "+ matricula +" marca: "+marca+" modelo "+ modelo+" com potência "+potencia+" com capacidade de bagageira "+cap_bag;
    }
}
