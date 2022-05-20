package Aula09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator; 
import java.util.TreeSet;
import Aula06.*;
import Aula07.*;

public class AlDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
        c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
        System.out.println("Elemento: " + c1.get(i));
        System.out.println(c1.indexOf(20));
        System.out.println(c1.lastIndexOf(50));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        System.out.println("SubList "+c2.subList(1, 2)); // O ultimo elemento é exclusivo, ou seja, não aparece
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2.set(0, "Bacalhau")); // muda um elemento da lista dando-se o indice e o novo que queremos pôr
        //      if (c2.contains("Chuva")){ // verifica se um dado elemento está contido no array
            //System.out.println("O Array contém o elemento 'Chuva' ");
       // }
       // else 
         //   System.out.println("O elemento não se encontra no Array");

        //System.out.println(c2);
        //}

        Set<Pessoa> c3 = new HashSet<>();         

        Pessoa p1 = new Pessoa("diana", 285362,new Aula05.Date(25,6,1969));
        Pessoa p2 = new Pessoa("ze", 120356,new Aula05.Date(25,2,1975));
        Pessoa p3 = new Pessoa("marta", 456523,new Aula05.Date(10, 7, 2005));
        Pessoa p4 = new Pessoa("diogo", 123789,new Aula05.Date(4, 6, 2009));
        Pessoa p5 = new Pessoa("sara", 455156,new Aula05.Date(23, 12, 2004));
    
        
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
    
        Iterator <Pessoa> i = c3.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Set<DateND> c4 = new TreeSet<>(); 
                 
        c4.add(new DateND(3,4,2020));
        c4.add(new DateND(5,7,2002));
        c4.add(new DateND(6,1,1780));
        c4.add(new DateND(31,5,2000));
        c4.add(new DateND(3,3,1922)); 

        for(DateND d: c4)
        System.out.println(d);

    }
}
