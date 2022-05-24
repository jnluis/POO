package Aula10;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args){
        TreeMap<String, HashSet<String>> mapa = new TreeMap<>(); //Supostamente não se pode utilizar o iterator ou o for each se escrevermos TreeMap ou HashMap do lado esquerdo
        String op="0";

        Scanner sc = new Scanner(System.in);

        
        do{
            menu();
			op = sc.next();
            sc.nextLine();
            switch (op){
                case "1": 
                    System.out.println(" <<< Adicionar chave >>> ");
                    System.out.println("Introduza a nova chave ");
                    String chave_nova = sc.nextLine();
                    if (!mapa.containsKey(chave_nova)){
                        mapa.put(chave_nova, new HashSet<>());
                    } 
                    else System.out.println("Essa chave já existe!");
                break;
                case "2": 
                    System.out.println(" <<< Adicionar definição >>> ");
                    System.out.println("Introduza o termo ao qual quer introduzir a nova definição ");
                    String chave = sc.nextLine();
                    if (mapa.containsKey(chave)){
                        System.out.println(" Introduza a definição nova ");
                        String valor_novo = sc.nextLine();
                        mapa.get(chave).add(valor_novo); // Vai-se buscar a chave pretendida e acrescenta-se o valor que o Utilizador definiu
                    } 
                    else System.out.println("Essa chave não está no mapa!");
                break;
                case "3":
                    System.out.println(" <<< Ver definição >>> ");
                    System.out.println("Introduza o termo, do qual quer ver a definição ");
                    String termo = sc.nextLine();
                    if (mapa.containsKey(termo)){
                        System.out.println(getRandom(mapa.get(termo))); // alínea 10.2
                    } 
                    else System.out.println("Essa chave não está no mapa!");
                break;
                case "4":
                    System.out.println(" <<< Ver chave e definição >>> ");
                    System.out.println(mapa);
                break;
                case "5": break;
                default: System.out.println("Insira uma opção válida!");
            }
        }
        while(!op.equals("5"));         
        sc.close();
    }

    public static String getRandom(HashSet<String> set) {
		int item = new Random().nextInt(set.size());
		int i = 0;
		for(String str : set){
		    if (i == item)
		        return str;
		    i++;
		}
		return "Sem defenições disponiveis";
	}
    
    public static void menu(){
        System.out.println("--- TreeMap ---\n"
                + "1 - Adicionar chave\n"
                + "2 - Adicionar definição\n"
                + "3 - Ver definição\n"
                + "4 - Ver chave e definição\n"
                + "5 - Fechar\n");
            }
}
