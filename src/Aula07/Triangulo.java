package Aula07;

public class Triangulo extends Forma {
    private double l1;
	private double l2;
	private double l3;
	
	//Construtores
    public Triangulo(double l1, double l2, double l3) {
		this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
	}

    //Getters e setters

	public double getL1() {
		return l1;
	}

	public double getL2() {
		return l2;
	}

	public double getL3() {
		return l3;
	}

	public void setlados(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

    //Override
	@Override
	public String toString() {
		return "Triangulo [lado1=" + l1 + ", lado2=" + l2 + ", lado3=" + l3 + ", Perimetro=" + Perimetro() + ", Area="
				+ Area() + "]";
	}

    //Área do triângulo pelo método de Heron
    // Método de Heron-  Area= √p(p−a)(p−b)(p−c) sendo a,b,c os lados do triangulo e p metade do perimetro
    public double Area(){
        double p = this.Perimetro()/2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }
    
    //Perimetro do Triangulo 
    public double Perimetro(){
        return (l1 + l2 + l3);
    }

}