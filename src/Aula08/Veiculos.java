package Aula08;

public class Veiculos implements KmPercorridosInterface {
    public String matricula;
    public String marca;
    public String modelo;
    public int potencia;
    protected int km, Km_traje = 0, Km_total = 0;
    public int distancia;
    

    public Veiculos(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public String getMatricula() {return matricula;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getPotencia() {return potencia;}

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public void trajeto(int km){
        this.Km_traje = km;
        this.Km_total += this.Km_traje;
    }

    public int ultimoTrajeto() {
        return this.Km_traje;
    }

    public int distanciaTotal() {
        return this.Km_total;
    }
}
