package Aula08.Ex2;

public class Peixe extends Alimento{
    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, double prot, double cal, double peso ) {
        super(prot, cal, peso);
        this.tipo = tipo;
    }

@Override
public String toString() {
    return "Peixe " + tipo + super.toString();
}
}
