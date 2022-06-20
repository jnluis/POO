package Aula07;

public abstract class Forma {
    public String cor;

    public abstract double Area();
    public abstract double Perimetro();
    
    public static void setcor(String cor) {
    }

    public String getCor() {
        return cor;
    }

    public static String print(String cor) {
        return String.format("Cor - %s", cor);
    }   


}
