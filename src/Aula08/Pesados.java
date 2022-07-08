package Aula08;

public class Pesados extends Veiculos {
    private int quadro;
    protected int peso;

    public Pesados(String matricula, String marca, String modelo, int potencia,int quadro, int peso) {
        super(matricula, marca, modelo, potencia);
        this.quadro = quadro;
        this.peso = peso;
    }

    public int getQuadro() {return quadro;}
    public int getPeso() {return peso;}

    public void setQuadro(int quadro) {this.quadro=quadro;}
    public void SetPeso(int peso) {this.peso=peso;}

    //GETTERS- Utilizam-se para ler o valor (utilizam-se quase sempre)
    //SETTERS- só faz sentido se quisermos alterar o valor daquele atributo (Se não precisarmos de mudar o valor, podemos apagar)
}
