package Aula05;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        String op;
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        do {
            menu();
            op = sc.next();
            switch (op){
                case "8": break;
                case "1": 
                    System.out.println(" <<< Inscrever Utilizador >>> ");
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    nome = sc.nextLine();

                    System.out.println("Nº Mecanográfico: ");
                    int nMec = sc.nextInt();

                    System.out.println("Curso: ");
                    String curso = sc.nextLine();
                    curso = sc.nextLine();
                    biblioteca.addAluno(nome,nMec ,curso);
                break;
                case "2": 
                    System.out.println();
                    System.out.println(" <<< Remover Utilizador >>> ");
                    System.out.print("Insira o NMEC ");
                    int id = sc.nextInt();
                    biblioteca.removeAluno(id);
                case "3":
                    System.out.println();
                    System.out.println(" <<< Imprimir Utilizadores >>> "); 
                    biblioteca.print();
                    break;
                case "4":
                    System.out.println();
                    System.out.println(" <<< Registar um livro >>> "); 
                    System.out.println("Insira o título do livro ");
                    String titulo = sc.nextLine();
                    titulo =sc.nextLine();
                    System.out.println("Insira o tipo de empréstimo ");
                    String tipoEmprestimo = sc.nextLine();
                    biblioteca.addlivro(titulo, tipoEmprestimo);
                 break;
                 case "5": 
                    System.out.println();
                    System.out.println(" <<< Imprimir livros >>> ");
                    biblioteca.printLivro(); 
                 break;
                 case "6": 
                    System.out.println();
                    System.out.println(" <<< Emprestar >>> "); 
                    System.out.print("Nº Mec: ");
                    int idAluno = sc.nextInt();
                    System.out.print("Id Livro: ");
                    int idLivro = sc.nextInt();
                    biblioteca.emprestar(idAluno, idLivro);
                 break;
                 case "7": 
                    System.out.println();
                    System.out.println(" <<< Devolver >>> "); 
                    System.out.print("Nº Mec: ");
                    int idAl = sc.nextInt();
                    System.out.print("Id Livro: ");
                    int idLi = sc.nextInt();
                    biblioteca.devolver(idAl, idLi);

                 break;
                default: System.out.println("Insira uma opção válida!"); 
            }
            System.out.println();

        } while(!op.equals("8"));
        sc.close();
    }

    public static void menu(){
        System.out.println("--- BIBLIOTECA ---\n"
				+ "1 - inscrever Utilizador\n"
				+ "2 - remover Utilizador\n"
				+ "3 - imprimir lista de Utilizadores\n"
				+ "4 - registar um novo livro\n"
                + "5 - imprimir lista de livros\n"
                + "6 - emprestar\n" 
                + "7 - devolver\n"
				+ "8 - exit\n");
        }
}
