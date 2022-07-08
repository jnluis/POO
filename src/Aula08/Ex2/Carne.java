package Aula08.Ex2;

public class Carne extends Alimento{
    private VariedadeCarne tipo;

    public Carne(VariedadeCarne tipo, double prot, double cal, double peso ) {
        super(prot, cal, peso);
        this.tipo = tipo;
    }

@Override
public String toString() {
    return "Carne " + tipo + super.toString();
}
}
