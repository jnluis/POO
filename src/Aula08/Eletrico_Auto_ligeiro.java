package Aula08; 

public class Eletrico_Auto_ligeiro extends Auto_ligeiro implements VeiculoEletrico {
    private int AutonomiaRest, autonomia;

    public Eletrico_Auto_ligeiro(String matricula, String marca, String modelo, int potencia,int quadro, int cap_bag) {
        super(matricula, marca, modelo,potencia, quadro, cap_bag); 

    };
    public void trajeto(int quilometros) {
        super.trajeto(quilometros);
        AutonomiaRest -= quilometros;
    }

    @Override
    public int autonomia() {
        return AutonomiaRest;
    }

    @Override
    public void carregar(int percentagem) {
        double carregamento = percentagem * autonomia / 100;
        
        if(carregamento > AutonomiaRest){
            AutonomiaRest = (int) carregamento;
        }else{
            System.out.println("O automóvel tem mais do que " + percentagem + "% de autonomia"); 
        }        
    }

    @Override
    public String toString(){
        return "Matricula: "+ matricula +" marca: "+marca+" modelo "+ modelo+" com potência "+potencia+" com capacidade de bagageira:  "+cap_bag;
    }
}