package Aula05;

public class Retangulo {
    private double comprimento;
	private double altura;

    //Construtores
    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    //Getters e setters

	public double getcomprimento() {
		return comprimento;
	}

	public double getaltura() {
		return altura;
	}

    public void setMedidas(double comprimento, double altura) {
        this.comprimento = comprimento;
		this.altura = altura;
    }

    @Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + ", Area=" + Area() + ", Perimetro=" + Perimetro() + "]";
	}

    // Area do Retangulo
    public double Area(){
        return comprimento * altura;
    }
    
    //Perimetro do retangulo 
    public double Perimetro(){
        return 2*(comprimento+altura);
    }

}
