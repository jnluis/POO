package Aula06;
import Aula05.Date;

public class Bolseiro extends Aluno{
    
    private double bolsa;
    public Bolseiro (String nome, int cc, Date dataNasc, Date DataInsc) {
		super (nome, cc, dataNasc, DataInsc);
	}
	
	public Bolseiro (String nome, int cc, Date DataNasc) {
		super (nome, cc, DataNasc);
	}

    public Bolseiro(String nome, int cc, Date dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}
    //getters e setters

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
    @Override
	public String toString() {
		return this.getName() + ", NMec: " + this.getNMec() + ", Bolsa: " + bolsa;
	}
}
