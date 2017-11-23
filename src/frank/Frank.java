package frank;

public class Frank {
    
    
    //recebe um vetor(int) e retorna a quantidade de negativos

    public static int contarsInteiros(int[] elementos) {
//        percorer o vetor
        int contador = 0;

        for (int x = 0; x < elementos.length; x++) {
            if (elementos[x] < 0) {
                contador++;
            } 

        }

        return contador;
    }

    
        // teste vetor
    public static void main(String[] args) {
        
        int[] vt = {10,-50,5,-3};
        int quantidade = contarsInteiros(vt);
        System.out.println(quantidade);
                

    }

}
