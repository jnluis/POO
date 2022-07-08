package Aula08.Ex2;

public class Legume extends Alimento implements AlimentoVegetariano{
    private String nome;
    public Legume(String nome,double prot, double cal, double peso ) {
        super(prot, cal, peso);
        this.nome = nome;
    }
    

    @Override
	public boolean isVegetarian() {
		return true;
	}

    @Override
    public String toString() {
        return "Legume " + nome + super.toString();
    }
}
