package Aula07;

public class Circulo extends Forma {
    private double raio;
    //Construtores
    public Circulo(double raio) {
		this.raio = raio;
	}

    //Getters e setters

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//Override

	@Override
	public String toString(){
		return "Circulo [raio=" + raio + ", Area=" + Area() + ", Perimetro=" + Perimetro()+ " ]";
    }
    //Área do cícrulo
    public double Area(){
        return Math.PI* Math.pow(this.raio,2);
    }

    //Perimetro do cícrulo
    public double Perimetro(){
        return 2* Math.PI * this.raio;
    }

}

