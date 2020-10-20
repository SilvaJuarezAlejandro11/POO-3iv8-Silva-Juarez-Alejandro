import java.util.Scanner;

class SumaDeNumeros{

public static void main(String[] args){
    

    Scanner Entrada = new Scanner(System.in);
    int num1, num2, resultado;

    System.out.println("Ingresa el primer numero: ");
    num1 = Entrada.nextInt();
    while(num1<0){
        System.out.println("Introduzca un valor positivo ");
        num1 = Entrada.nextInt();
    
    System.out.println("Ingresa el segundo numero: ");
    num2 = Entrada.nextInt() ;
    while(num2<0){
        System.out.println("Introduzca un valor positivo ");
        num2 = Entrada.nextInt();
    
    resultado = num1 + num2; 
    System.out.println("La suma es de : "+resultado);
}
    } 
}
}