package Aula06;
import Aula05.Date;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;
    private double bolsa;

    //Construtores
    public Pessoa(String nome, int cc, Date dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
/*
public void validate(Date d) {
    if (!Date.Isvalid(d)){
        System.out.println("Data inválida!!");
    }
}*/
    
    //Getters e setters

	public String getName() {
		return nome; // retorna o nome da pessoa
	}

	public double getBolsa() {
		return bolsa;
	}

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
	public String toString() {
		return String.format("Nome: %s, Cartão de Cidadão: %s, Data de Nascimento: %s", nome, cc, dataNasc);
	}
}

