package Aula03;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Double CP, CT,N;
        Scanner sc = new Scanner(System.in);
        Double[][] turma = new Double[16] [3];

        for (int i = 0; i < 16; i++){
            CP = Math.floor(Math.random()*21);
            CT = Math.floor(Math.random()*21);

            N = (0.4*CT) + (0.6*CP);
            if (CT <7.0 || CP < 7.0){
                N = 66.0;
            }
            turma[i][0] = (double) Math.round(CP);
            turma[i][1] = (double) Math.round(CT);
            turma[i][2] = (double) Math.round(N);
        }
        System.out.printf("%-7s  %-7s %-7s %n","NotaT","NotaP","Pauta");
        for(int i=0; i<16; i++){
            System.out.format("%-7.1f  %-7.1f %-7.0f %n", turma[i][1], turma[i][0], turma[i][2]);
        }
        sc.close();
    }
}
