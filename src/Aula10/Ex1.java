package Aula10;
//import java.util.Set;
//import java.util.Map;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args){
        HashMap<String, String> mapa = new HashMap<>(); //Parecido com os dicionários do Python, mas neste, não há ordem

        mapa.put("Branco ", " Que tem a cor da neve");
        mapa.put("Preto ", " Que tem a cor da escuridão");
        mapa.put("Vermelho ", " Que é a cor do sangue");
        mapa.put("Verde ", " Que é a cor da esperança");
        mapa.put("Azul ", " Que é a cor do céu");
        mapa.put("Amarelo ", " Que é a cor do melhor clube do Mundo e arredores");
        mapa.put("Gelo","Não é cor!");

        System.out.println("Mapa com os valores todos >> "+ mapa);
        System.out.println("--------------------------------");
        System.out.println(mapa.entrySet()); // Perguntar ao sor porque usar esta funcão do Set, em vez do da linha 16
        System.out.println("--------------------------------");

        mapa.replace("Gelo", "Claaarro que é cor!"); // podemos ou não especificar qual o valor antigo
        System.out.println("Um valor alterado: "+ mapa);

        mapa.remove("Gelo");
        System.out.println("Mapa sem gelo -- " +mapa);

        System.out.println(mapa.keySet()); // devolve as keys
        System.out.println(mapa.values()); // devolve os valores

        }
        
        public static String toString(HashMap<String, String> mapa) {
            StringBuilder sb = new StringBuilder();
            for (Object key : mapa.keySet()) {
                sb.append(String.format("%s     :    %s\n",key, mapa.get(key)));
        }
        return  sb.toString();
        }
        
    }
