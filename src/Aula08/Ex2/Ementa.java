package Aula08.Ex2;

public class Ementa {
    private String nome;
    private String local;
    private Prato[] pratos = new Prato[7];
    
    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato prato,DiaSemana ds){
        int index = ds.ordinal();
		pratos[index] = prato;
    }

    	//Getter e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i =0 ; i <7; i++){
			s += pratos[i] + ",dia " + DiaSemana.values()[i] + "\n";
		}
		return nome + " - " + local + "\n" + s;
	}
}
