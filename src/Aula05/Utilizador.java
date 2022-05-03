package Aula05;
import java.util.ArrayList;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;
    private ArrayList<Integer> livros = new ArrayList<>();

    //Construtores
    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    //Getters e setters

    public void setnMec(int nMec) {
		this.nMec = nMec;
	}

    public int getnMec() {
        return nMec;
    }

    //Ex5
    public ArrayList<Integer> getLivros() {
		return livros;
	}
    
    public boolean podeRequisitar() {
		return livros.size() < 3;
	}

    @Override
	public String toString() {
		return "Aluno: " + nMec + "; " + nome + "; " + curso;
	}
}