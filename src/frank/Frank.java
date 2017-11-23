package Funcoes;

import java.util.Scanner;

public class Aula01 {
    // Não usamos VOID porque a função vai ter um
    // retorno do tipo DOUBLE
    public static double pedirNumero(){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = e.nextDouble();
        // Depois vamos retornar o valor digitado pelo
        // usuário para nosso programa
        return num;
    }

    public static void criarMenu() {

        //Colocar o que vai aconteer ao executar
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Calcular número²");
        System.out.println("3. Raiz quadrada");
        System.out.println("4. Calcular dobro");
        System.out.println("5. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");

        //Nomes de função seguem a mesma regra de nomes de variavel
    }//Finaliza conteúdo da função

    public static void exemploTipo1() {
        int valor = 10;
        valor = valor * 5;

        System.out.println("A variavel valor vale: " + valor);
    }

    // Remover o Scanner, o print e o next
    // Trocar tudo isso pelo "pedirNumero()"
    // Armazenando em uma variável nesta função
    public static void calcularDobro() {
        double n, dobro;
        n = pedirNumero();
        dobro = n * 2;
        System.out.println("Dobro de " + n + " = " + dobro);
    }

    public static void somar2Numeros() {
        Scanner e = new Scanner(System.in);
        int n, o, soma;
        System.out.print("Digite um número: ");
        n = e.nextInt();
        System.out.print("Digite outro número: ");
        o = e.nextInt();
        soma = o + n;
        System.out.println("A soma de " + n + " + " + o + " = " + soma);
    }

    public static void raizQuadrada() {
        Scanner e = new Scanner(System.in);
        double n, resultado;
        System.out.print("Digite um número: ");
        n = e.nextInt();
        resultado = Math.sqrt(n);
        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcQuadrado() {
        Scanner e = new Scanner(System.in);
        double n, resultado;
        System.out.print("Digite um número: ");
        n = e.nextInt();
        resultado = Math.pow(n, 2);
        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcTab(int x) {
        for (int i = 1; i <= 10; i++) {
            print(x + " * " + i + " = " + (x * i));
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Início do programa!");
        criarMenu();
        System.out.print("\nDigite a opção desejada: ");
        while (opcao != 0) {
            opcao = e.nextInt();
            if (opcao == 1) {
                somar2Numeros();
            } else if (opcao == 2) {
                calcQuadrado();
            } else if (opcao == 3) {
                raizQuadrada();
            } else if (opcao == 5) {
                System.out.println("Digite um número");
                int y = e.nextInt();
                calcTab(y);
            } else if (opcao == 4) {
                calcularDobro();
//                System.out.println("Digite outra opção: ");
//                opcao = e.nextInt();
            } else {
                System.out.println("Digite um valor válido!");

            }
            System.out.println("Digite a opção desejada: ");
        }
        if (opcao == 0) {
            System.out.println("Fim.");
        }

    }

}




package algoritmos;

public class Algoritmos {

    public static void quadrado(double n) {
        double r = n * n;
        System.out.println("Quadrado: " + r);
    }

    public static double metade(double v) {
        double r = v / 2;
        return r;
    }

    public static void main(String[] args) {

        System.out.println("Raiz: " + Math.sqrt(15));

        //System.out.println("Quadrado: "+ quadrado(15));
        quadrado(15);

        System.out.println("Metade: " + metade(15));
        
        double raiz;
        
        raiz = Math.sqrt(15);
    }

}

Random r = new Random();

 public static int fat(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fat(a - 1);
        }
}

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
