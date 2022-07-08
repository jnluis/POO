package Aula08.Ex2;

public class Alimento {
private double proteinas;
private double calorias;
private double peso;

public Alimento (double prot, double cal, double peso) {
    proteinas = prot;
    calorias = cal;
    this.peso = peso;
}

public double getProteinas() {
    return proteinas;
}

public void setProteinas(double proteinas) {
    this.proteinas = proteinas;
}

public double getCalorias() {
    return calorias;
}

public void setCalorias(double calorias) {
    this.calorias = calorias;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

@Override
public String toString() {
    return ", Proteinas " + proteinas + ", calorias " + calorias + ", Peso " + peso;
}
}