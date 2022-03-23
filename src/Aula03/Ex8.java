package Aula03;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex8 {
    public static void main(String[] args){
        double CP;
        double CT;
        double N;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> NCP = new ArrayList<>();
        ArrayList<Double> NCT = new ArrayList<>();
        ArrayList<Double> NF = new ArrayList<>();


        for(int i=1; i<=16; i++){

            System.out.println("Notas Aluno "+ i + " -");
            System.out.println("Insira a nota da componente prática: ");
            CP = sc.nextDouble();
            if(CP < 0 || CP>20){
                System.out.println("Insira uma nota válida!!");
                System.out.print("Insira a nota da componente prática: ");
                CP = sc.nextDouble();
            }
            System.out.println("Insira a nota da componente teórica: ");
            CT = sc.nextDouble();
            if(CP < 0 || CP>20){
                System.out.println("Insira uma nota válida!!");
                System.out.print("Insira a nota da componente teórica:");
                CP = sc.nextDouble();
            }

            N = (0.4*CT) + (0.6*CP);
            if(CP < 7.0 || CT < 7.0 ){
                N = 66;
            }
            NCP.add(CP);
            NCT.add(CT);
            NF.add(N);
        }
        System.out.printf("%-7s  %-7s %-7s %n","NotaT","NotaP","Pauta");
        for(int i=0; i<16; i++){
            System.out.format("%-7.1f  %-7.1f %-7.0f %n", NCP.get(i), NCT.get(i), NF.get(i));
        }
        sc.close();
    }
}

