package Aula08;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Veiculos viaturas[] = new Veiculos[5];
        String[] veiculoMaxDist = new String[3];
        
        Scanner sc = new Scanner(System.in);
        int i, km =0;
        String op;

        viaturas[0] = new Motociclo("80-CB-10","Kawasaki","KTM", 1230, "Desportivo") ;
        viaturas[1] = new Auto_ligeiro("80-AA-02","Lexus","L40", 300, 332554, 500);
        viaturas[2] = new Pesado_passageiros("40-AM-22", "Volvo", "L40",450, 300321,2500,32);
        viaturas[3] = new Eletrico_Auto_ligeiro("88-MM-88","Tesla","Model X",770,211598,500);
        viaturas[4] = new Eletrico_Pesado_passageiros("85-AA-20","Mercedes","EQ BUS",800,211598,2500,50) ;

        Empresa empresa = new Empresa("Import Export","3800-200", "empresa@gmail.com",viaturas);

        boolean exit = false;
        while (!exit) {
            menu();
            op = sc.next();
            switch (op){
                case "0":
                    exit = true; break;
                case "1":
                    menu2();
                    int x = sc.nextInt();
                    switch(x){
                        case 1,2,3,4,5,6,7:
                            i=1;
                            System.out.println("Insira 0 para parar.");
                            do{
                                System.out.println("Quilómetros percorridos na " + i++ + " viagem: ");
                                km = sc.nextInt();
                                if(km != 0){
                                    viaturas[x-1].trajeto(km);
                                }
                            }while(km!=0);
                        break;
                    }

                break;
                case "2": 
                    System.out.println("1 - Automóvel Ligeiro Elétrico ");
                    System.out.println("2 - Pesado de Passageiros Elétrico");
                    int n = sc.nextInt();
                    switch(n){
                        case 1:  
                            System.out.println("Até que percentagem deseja carregar? ");
                            int carrega = sc.nextInt();
                            ((Eletrico_Auto_ligeiro)viaturas[3]).carregar(carrega);
                        break;
                        case 2:  
                            System.out.println("Até que percentagem deseja carregar? ");
                            carrega = sc.nextInt();
                            ((Eletrico_Pesado_passageiros)viaturas[4]).carregar(carrega);
                        break;
                    }
                break;
                case "3":
                    System.out.println(empresa.toString());
                break;
                default: System.out.println("Insira uma opção válida!"); 
            }
            System.out.println();
        }
        veiculoMaxDist = empresa.compararDistancia();
        System.out.println("A viatura com mais quilómetros percorridos é de matrícula " + veiculoMaxDist[0] + " que percorreu " + veiculoMaxDist[2] + "km.");
        sc.close();
    }

    public static void menu(){
        System.out.println("--- MENU ---\n"
				+ "1 - Adicionar um trajeto\n"
				+ "2 - Carregar um Automovel\n"
                + "3 - Ver veículos\n"
                + "0 - Sair\n");
            }

    public static void menu2(){
        System.out.println("--- Interface operations ---\n"
				+ "1 - Motociclo\n"
				+ "2 - Automóvel Ligeiro\n"
				+ "3 - Pesado passageiros\n"
				+ "4 - Pesado Mercadorias\n"
                + "5 - Taxi\n"
                + "6 - Automovel Ligeiro Eletrico\n"
				+ "7 - Pesado de Passageiro Eletrico\n");
        }
    
}
