package Aula08; 

public class Eletrico_Pesado_passageiros extends Pesado_passageiros implements VeiculoEletrico {
    private int AutonomiaRest, autonomia;
    
    public Eletrico_Pesado_passageiros(String matricula, String marca, String modelo, int potencia,int quadro, int peso,int pass_max){
        super(matricula, marca, modelo, potencia, quadro, peso,pass_max);
 
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
        return "Matricula: "+ matricula +" marca: "+marca+" modelo "+ modelo+" com potência "+potencia+" pesando "+peso+" e levando "+pass_max+" passageiros";
    }
}