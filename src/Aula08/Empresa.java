package Aula08;

public class Empresa {
    private String nome, cpostal,email;
    private Veiculos[] viaturas = new Veiculos[3];

    public Empresa(String nome,String cpostal, String email, Veiculos[] viaturas){
        this.nome = nome;
        this.cpostal = cpostal;
        this.email = email;
        this.viaturas = viaturas;
    }

    public String getNome() {return nome;}
    public String getCpostal() {return cpostal;}
    public String getEmail() {return email;}
    public Veiculos[] getViaturas() {return viaturas;}

    public String[] compararDistancia(){
        int max = 0;
        String matricula = "";
        String marca = "";
        String[] veiculoMaxDist = new String[3];

        for(int i = 0; i < viaturas.length; i++){
            if(viaturas[i].distanciaTotal() >= max){
                max = viaturas[i].distanciaTotal();
            }

            if(max == viaturas[i].distanciaTotal()){
                matricula = viaturas[i].getMatricula();
                marca = viaturas[i].getMarca();
            }
        }
        veiculoMaxDist[0] = matricula;
        veiculoMaxDist[1] = marca;
        veiculoMaxDist[2] = Integer.toString(max);

        return veiculoMaxDist;
    }

    public String printViaturas(){
        String s = "";
        for(int i=0; i<viaturas.length; i++){
            s += viaturas[i].toString() + "\n";
        }
        return s;
    }

    @Override
    public String toString() {
        return printViaturas();
    }
}
