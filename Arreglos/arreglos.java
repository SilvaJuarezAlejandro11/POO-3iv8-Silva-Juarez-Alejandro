import java.util.*;
    
public class arreglos{
        
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;
        arreglos Programaa= new arreglos();
        arreglos Programab = new arreglos();
        arreglos Programac = new arreglos();
        arreglos Programad = new arreglos();

        System.out.println("El programa fue trabajado por SILVA JUAREZ ALEJANDRO");

        do{
        System.out.println("Elija el programa que desea utilizar:");
        System.out.println("Programa 1: Promedio de numeros positivos y negativos.");
        System.out.println("Programa 2: Promedio de numeros en posiciones pares");
        System.out.println("Programa 3: Calificaciones");
        System.out.println("Programa 4: Matrices (suma)");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                do{
                Programaa.Programa1();
                System.out.println("Si desea repetir el programa, ingrese a, para ir al menu ingrese m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');
            break;

            case 2:
                do{
                    Programab.Programa2();
                System.out.println("Si desea repetir el programa, ingrese a, para ir al menu ingrese m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');
            break;

            case 3:
                do{
                    Programac.Programa3();
                System.out.println("Si desea repetir el programa, ingrese a, para ir al menu ingrese m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');
            break;

            case 4:
                do{
                    Programad.Programa4();
                System.out.println("Si desea repetir el programa, ingrese a, para ir al menu ingrese m");
                letra = entrada.next().charAt(0);
                }while(letra ==  'a');
            break;
        }

        System.out.println("Si desea volver al menu, ingrese m si desea salir del programa ingrese x");
        letra = entrada.next().charAt(0);
        }while(letra == 'm');
    }

    public void Programa1(){
 
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int [10];
        int pos = 0, neg = 0, cero = 0;
        int i;
        double propos = 0, proneg = 0, sumapos = 0, sumaneg = 0;
        
        //Lectura de datos y llenado del arreglo.
        System.out.println("Ingrese 10 numeros enteros");
        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
  
        //Asignar categoría a los números según sus cualidades.
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                pos++;
                sumapos = sumapos + numeros[i];
            }
            else if (numeros[i] < 0){
                neg++;
                sumaneg = sumaneg + numeros[i];
            }
            else {
                cero++;
            }
        }

        System.out.println("Positivos: " + pos + ".");
        System.out.println("Negativos: " + neg + ".");
        System.out.println("Ceros: " + cero + ".");

        propos = sumapos/pos;
        proneg = sumaneg/neg;
        if(propos <= 0){
            System.out.println("No hay numeros positivos.");
        }
        else{
            System.out.println("El promedio de positivos es de: " + propos + ".");
        }

        if(proneg >= 0){
            System.out.println("No hay numeros negativos.");
        }
        else{
            System.out.println("El promedio de negativos es de: " + proneg + ".");
        }
    }

    public void Programa2(){

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int [10];
        int i;
        double propar = 0;
        System.out.println("Ingrese diez numeros enteros.");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        } 
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                propar = propar + numeros[i];
            }
        }    
        System.out.println("Promedio de los valores que estan en posiciones pares: " + propar/5 + ".");              
    }
    public void Programa3(){
 
        Scanner entrada = new Scanner(System.in);        
        int numeros[] = new int[10];
        int resultados[] = new int [10];
        int rep = 0, ap = 0;
        int i, pro, min, max, suma = 0;
        max=min=numeros[0];

        System.out.println("Ingrese diez calificaciones.");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            if (numeros[i] <= 5) {
                rep++;
            }
            else if (numeros[i] >= 6){
                ap++;
            }
            if(min>numeros[i])
			{
				min=numeros[i];
			}
			if(max<numeros[i])
			{
				max=numeros[i];
            }
        }

        //Asignar valores para «resultados».
        for (i = 0; i < numeros.length; i++){
            resultados [i] = numeros[i] * 1;
        }
        
        System.out.println("Estas son las Calificaciones:");
        for (i = 0; i < numeros.length; i++){
            System.out.print(resultados[i] + " ");
            System.out.println("");
        }

        pro = suma/numeros.length;
        System.out.println("Promedio del grupo: " + pro + ".");

        System.out.println("Calificacion mas alta: " + max + ".");
        System.out.println("Calificacion masbaja: " + min + ".");

        System.out.println("\nListado de calificaciones superiores al promedio: ");
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > pro) {
                System.out.println("Calificaci\u00f3n n\u00fam. " + (i + 1)+ ".");
            }
        }
       
        System.out.println("Calificaciones aprobatorias: " + ap + ".");
        System.out.println("Calificaciones reprobatorias: " + rep + ".");
    }

    public void Programa4(){

        Scanner entrada = new Scanner (System.in);
        
        int matriz1[][] = new int [3][3];
        int matriz2[][] = new int [3][3];
        int matrizr[][] = new int [3][3];
        int i, j;
        

        System.out.println("Matriz A");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                matriz1 [i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz B.");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
            
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                 matrizr [i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        

        System.out.println("Matriz resultante de la suma:");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizr[i][j] + " ");
            }
            
        }
    }
}