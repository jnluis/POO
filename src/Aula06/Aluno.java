package Aula06;
import Aula05.Date;

public class Aluno extends Pessoa{
    private int NMEC;
    private static int c =99;
    private Date dataIns;

    public Aluno(String nome, int cc, Date DataNasc, Date iDataInsc) {
        super(nome, cc, DataNasc);
        dataIns = iDataInsc;
        NMEC = ++c;
    }

    public Aluno(String nome, int cc, Date DataNasc) {
		super (nome, cc, DataNasc);
		dataIns = new Date(1,1,1999);
		NMEC = ++c;
		
	}

    public int getNMec(){
        return NMEC;
    }

    public void setNmec(int NMEC){
        this.NMEC = NMEC;
    }



    @Override
	public String toString() {
		return "Aluno [nmec=" + NMEC + ", dataIns=" + dataIns + "]";
	}
}
