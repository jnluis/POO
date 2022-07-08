package Aula08;

public class Pesado_passageiros extends Pesados{
    protected int pass_max;

    public Pesado_passageiros(String matricula, String marca, String modelo, int potencia,int quadro, int peso,int pass_max){
        super(matricula, marca, modelo, potencia,quadro, peso);
        this.pass_max = pass_max;
    }

    public int getPass_max(){return pass_max;}
    public void setPass_max(int pass_max) {this.pass_max = pass_max;}

    @Override
    public String toString(){
        return "Matricula: "+ matricula +" marca: "+marca+" modelo "+ modelo+" com potência "+potencia+" pesando "+peso+" e levando "+pass_max+" passageiros";
    }
}
