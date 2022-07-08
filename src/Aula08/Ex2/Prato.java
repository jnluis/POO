package Aula08.Ex2;
import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Alimento> composicao = new ArrayList<Alimento>();
    private DiaSemana dia;
    
    public Prato(String nome) {
		this.nome = nome;
	}
    

    public ArrayList<Alimento> getComposicao() {
		return composicao;
	}

	public void setComposicao(ArrayList<Alimento> composicao) {
		this.composicao = composicao;
	}

    public boolean addIngrediente(Alimento c) {
		composicao.add(c);
		return true;
	}

    public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Prato " + nome +" composto por " + composicao.size() + " Ingredientes";
	}
}
