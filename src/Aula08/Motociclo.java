package Aula08;

public class Motociclo extends Veiculos {
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia,String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public String getTipo(){return tipo;}

    public void setTipo(String tipo){this.tipo = tipo;}

    @Override
    public String toString(){
        return "Matricula: "+ matricula +" marca: "+marca+" modelo "+ modelo+" com potência "+potencia+" e do tipo "+tipo;
    }
}
