package Aula05;

public class Livro {
    private int id;
    private String titulo;
    private String tipoEmprestimo;
    private static int contador = 100;
    private String disp;
    private boolean status;

        //Construtores
    public Livro(String titulo, String tipoEmprestimo) {
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.id = contador++; 
    }

    public Livro(String titulo) {
        this.titulo = titulo;
        this.tipoEmprestimo = "NORMAL";
        this.id = contador++; 
        
    }

       //Getters e setters

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}

    //Ex5
    public boolean isStatus() {
		return status && !"Condicionado".equals(tipoEmprestimo);
	}

	public void setStatus(boolean status) {
		this.status = status;
        
	}

    public void setDisp(String disp) {
        this.disp = disp;
    }

    public String getDisp(){
        return disp;
    }
    
    @Override
	public String toString() {
		return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
	}
}
