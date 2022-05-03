package Aula05;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

	private ArrayList<Utilizador> alunos = new ArrayList<>();

	public void addAluno(String nome, int nMec, String curso) {
		alunos.add(new Utilizador(nome, nMec, curso));
	}

    public void removeAluno(int nMec){
        alunos.remove(searchAluno(nMec));
    }

    public int searchAluno(int nMec) {
        int i=0;
        for (Utilizador aluno : alunos) {
			if (aluno.getnMec() == nMec) {
				break;
			} else {
				i++;
			}
		}
		return i;
    }

    public void print(){
        System.out.println("Lista de alunos:");
		for (Utilizador aluno : alunos) {
			System.out.println(aluno.toString());
        }
    }

    public void addlivro(String titulo, String tipoEmprestimo){
        livros.add(new Livro(titulo, tipoEmprestimo));
    }

    public void printLivro(){
        System.out.println("Lista de livros:");
		for (Livro livro : livros) {
			System.out.println(livro.toString());
        } 
    }

    public int searchLivro(int idLivro){ 
        int i=0;
        for (Livro livro : livros) {
			if (livro.getId() == idLivro) {
				break;
			} else {
				i++;
			}
		}
		return i; 
    }

    public void emprestar(int idAluno, int idLivro){
        Utilizador thisAluno = alunos.get(searchAluno(idAluno));
		Livro thisLivro = livros.get(searchLivro(idLivro));
		

		if (Boolean.TRUE.equals(thisAluno.podeRequisitar())) {
			thisLivro.setStatus(false);
			thisAluno.getLivros().add(thisLivro.getId());
			System.out.println("Livro emprestado com sucesso");
		}
		else{
			System.out.println("Não pode requisitar mais livros");
		}
	}

    
    public void devolver(int idAl, int idLi){
        Utilizador thisAluno = alunos.get(searchAluno(idAl));
		Livro thisLivro = livros.get(searchLivro(idLi));
	
			thisLivro.setStatus(true);

        ArrayList<Integer> LA = thisAluno.getLivros();

		for(int i = 0; i < LA.size(); i++){    
			if(LA.get(i) == idLi){
                LA.remove(i);
            }
        }
        System.out.println("Livro devolvido com sucesso");
	}

}
