import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos{

    Scanner entrada = new Scanner(System.in);

    //Se crea el menú
    public void menu(){

        char eleccion, letra;
        
        JOptionPane.showMessageDialog(null, "Este programa fue elaborado por Silva Juarez Alejandro");
        
        do{
        eleccion = JOptionPane.showInputDialog("Silva Juarez Alejandro . \nSeleccione el programa que desea Utilizar \n A.Calculador de edad. \n B.Area y perimetro \n C.llamadas").charAt(0);

     
        switch(eleccion){
            case 'A':
              
                do{
                ejercicioa();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break;

            case 'B':
            
                do{
                ejerciciob();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break; 

            case 'C':
              
                do{
                ejercicioc();
                letra = JOptionPane.showInputDialog("Si desea ir al menu, ingrese m, si desea repetir el programa, ingrese s").charAt(0);
                }while(letra == 's');
            break;
        }
       
        letra = JOptionPane.showInputDialog("Si desea ir al menu principal, ingrese m, si desea cerrar el programa, ingrese x").charAt(0);
        }while(letra == 'm');
    }

    

    int cel, credito = 10;
    int numeros[] = new int [10];
    int i;
    int pos = 0, neg = 0, cero = 0;
    double todo, sumapos = 0, sumaneg = 0, sumacero = 0;
    double edad, anio, base, altura, perimetro, area, radio, ladoa, ladob;


    public void ejercicioa(){
		anio = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu anio de nacimiento"));


        if(anio > 2020 || anio <= 1897){
		anio = Double.parseDouble(JOptionPane.showInputDialog("Gracias por poner a prueba el programa pero ingrese su anio de nacimiento correcto"));
        }
        else{
        edad = 2020 - anio;

        EdadR();
        }
    }

   
    public void EdadR(){
		JOptionPane.showMessageDialog(null, "Su edad es de " +edad+ " anios.");
    }

  
    public void Cir(){

        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo"));

        perimetro = 2*3.14*radio;
        area = 3.14*radio*radio;

        CirR();
    }

   
    public void CirR(){
		JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");
    }

    
    public void Rec(){
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));

        area = base*altura;
        perimetro = 2*(base+altura);

        RecR();
    }

    
    public void RecR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");
    }

  
    public void Cuad(){
		JOptionPane.showMessageDialog(null, "Ingresa el valor de uno de los lados del cuadrado");
        base = entrada.nextInt();

        perimetro = base*4;
        area = base*base;

        CuadR();
    }

    public void CuadR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades. \nEl area es de " +area+ " unidades.");

    }

    
    public void Tri(){

        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura del triangulo"));

        ladoa = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de uno de los 2 lados faltantes del triangulo"));
        ladob = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de el otro lado faltante del triangulo"));

        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        TriR();
    }

    
    public void TriR(){
        JOptionPane.showMessageDialog(null, "El perimetro es de " +perimetro+ " unidades.\nEl area es de " +area+ " unidades.");

    }

    
    public void ejerciciob(){
        char el;

        el = JOptionPane.showInputDialog("Seleccione la figura a la que desea calcular area y perimetro\n 1. Circulo. \n 2. Rectangulo \n 3.Cuadrado \n 4.Triangulo.").charAt(0);
        
        switch(el){
            case '1':
                Cir();
            break;

            case '2':
                Rec();
            break;
            
            case '3':
                Cuad();
            break;

            case '4':
                Tri();
            break;
        }
    }

    
    public void ejercicioc(){
        System.out.println("\nEl cr\u00e9dito incial es de diez pesos . Seleccione una opci\u00f3n.");
        System.out.println("1- Llamada nacional (0.5 $).\n2- Llamada internacional (0.6 $).\n3- Celular (0.2 $).");
        System.out.println("\nIngrese el n\u00famero de acuerdo  a la nomenclatura anterior.");
        for (i = 0; i < numeros.length; i++){
            System.out.print("NUM " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
                
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] == 1){
                pos++;
                sumapos = pos*0.5;
            }
            else if (numeros[i] == 2){
                    neg++;
                    sumaneg = (neg/2)*(0.6);
            }
            else if (numeros[i] == 3){
                    cero++;
                    sumacero = (cero/3)*0.2;
            }
        }
                
        todo = sumapos + sumaneg + sumacero;
    
        System.out.println("\nHa gastado un total de " + todo + " $.");
        TelR();
    }
    
        
    public void TelR(){
        System.out.println("\nSi desea conocer su saldo, ingrese 1; si no, ingrese 2.");
        cel = entrada.nextInt();
        if(cel == 1){
            System.out.println("Su saldo original era de " + credito + " $.\nAhora es de " + (credito - todo) + " $.");
        }
    }
}