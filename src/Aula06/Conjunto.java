package Aula06;

public class Conjunto {
    private int vetor[];
    public Conjunto(){
        this.vetor = new int[0];
    }

    public int[] getVetor(){
        return vetor;
    }

    public void insert(int n){
        if(this.contains(n)){ //contain definido mais abaixo
            return;}
        int newl = vetor.length + 1;
        int[] newVetor = new int[newl];
        
        for(int i=0; i<vetor.length; i++){
            newVetor[i] = vetor[i];
        }
        newVetor[newl-1] = n;
        vetor = newVetor;
    }

    public boolean contains(int n){
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] == n){
                return true;
            }
        }
        return false;
    }

    public void remove(int n){
        if(!this.contains(n)){return;}
        int newl = vetor.length - 1;
        int[] newVetor = new int[newl];

        boolean remove = false;
        for(int i=0; i<vetor.length; i++) {
			if(vetor[i] == n) {
				remove = true;
				continue;
			}
			if(!remove) {
				newVetor[i] = vetor[i];
			} else {
				newVetor[i-1] = vetor[i];
			}
		}
		vetor = newVetor;
        }
        public void empty(){
            vetor = new int[0];
        }

        public String toString(){
            String s = "{";
            for(int i=0; i<vetor.length; i++){
                s += vetor[i];
                if(i != vetor.length-1){
                    s += ", ";
                }
            }
            s += "}";
            return s;
        }

        public int size(){
            return vetor.length;
        }

        public Conjunto unir(Conjunto add){
            Conjunto c2 = new Conjunto();
            for(int i=0; i<vetor.length; i++){
                c2.insert(vetor[i]);
            }
            for(int i=0; i<add.getVetor().length; i++){
                c2.insert(add.getVetor()[i]);
            }
            return c2;
        }

        public Conjunto subtrair(Conjunto dif){
            Conjunto c2 = new Conjunto();
            for(int i=0; i<vetor.length; i++){
                if(!dif.contains(vetor[i])) {
                    c2.insert(vetor[i]);
                }
            }
            return c2;
        }

        public Conjunto interset(Conjunto inter){
            Conjunto c2 = new Conjunto();
            for(int i=0; i<vetor.length; i++){
                if(inter.contains(vetor[i])){
                    c2.insert(vetor[i]);
                }
            }
            return c2;
        }
}
