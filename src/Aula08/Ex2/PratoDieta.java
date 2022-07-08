package Aula08.Ex2;

public class PratoDieta extends Prato{
    double Max_Calorias;

    public PratoDieta(String nome, double Max_Calorias) {
        super(nome);
        this.Max_Calorias = Max_Calorias;
    }

    @Override
	public String toString() {
		return super.toString() + "- Dieta ("+ Max_Calorias + " Calorias)";
	}
}
