import java.util.Scanner;
import java.util.*;
import java.io.*;

class examen{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        //*Variables
        char letra;
        int opcion, charmander, squartle, bulbasaor; 
    //* char es el tipo de dato y letra el nombre de la variable 

do{
    System.out.println("Esta pokedex esta elaborada por:");
    System.out.println("3IV8 SILVA JUAREZ ALEJANDRO");
    System.out.println(" ");
    System.out.println("Elija al pokemon que desee ver sus estadisticas:");
    System.out.println("1. Charmander.");
    System.out.println("2. Bulbasaour.");
    System.out.println("3. Squartle.");
    System.out.println("4. Iniciar batalla pokemon");
    opcion = entrada.nextInt();
    switch(opcion) {

    case 1: 
    System.out.println("Nombre del pokemon: charmander");
    System.out.println("HP: 100");
    System.out.println("Ataque: 20");
    System.out.println("Defensa: 16");
    System.out.println("Numero de pokedex: 001");
    System.out.println("Pokemon tipo: Agua");
    break;

    case 2: 
    System.out.println("Nombre del pokemon: bulbasaor");
    System.out.println("HP: 100");
    System.out.println("Ataque: 25");
    System.out.println("Defensa: 14");
    System.out.println("Numero de pokedex: 002");
    System.out.println("Pokemon tipo: Fuego");
    break;

    case 3: 
    System.out.println("Nombre del pokemon: squartle");
    System.out.println("HP: 100");
    System.out.println("Ataque: 30");
    System.out.println("Defensa: 10");
    System.out.println("Numero de pokedex: 003");
    System.out.println("Pokemon tipo: Hierba");
    break; 
        case 4:
        do{
            System.out.println("1. Elige que batalla quieres:");
            System.out.println("2. charmander vs bulbasaor:");
            System.out.println("3. squartle vs charmander:");
            System.out.println("4. squartle vs bulbasaor:");
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                System.out.println("Charmander ataca primero");
                    System.out.println("Charmander ataca!!!!");
                    if (charmander = 0 )
                    {
                        bulbasaor = 100+20/14-14*2;
                        System.out.println("GOLPE CRITICO. La vida de bulbasaor ahora es de:"+ bulbasaor);
                                        
                }
                Sytem.out.println("TURNO DE BULBASAOR:");
                Sytem.out.println("Bulbasaor ataca!!!!:");
               if (bulbasaor = 0)
               { System.out.println("La batalla se ah acabado, el vencedor fue bulbasour");
            }
             if else
              {   
                 charmander = 100+16/25-25*2;
                System.out.println("GOLPE NO EFECTIVO. La vida de bulbasaor ahora es de:"+ charmander);
               }
               Sytem.out.println("TURNO DE CHARMANDER:");
               Sytem.out.println("Charmander ataca!!!!:");
               if (charmander = 0 ){
                   System.out.println("La batalla se ah acabado, el vencedor fue bulbasour");
            }
             if else
             {
             bulbasaor = 100+20/14-14*2-20/14-14*2;
                System.out.println("GOLPE CRITICO. La vida de bulbasaor ahora es de:"+ bulbasaor);
            }
            if (bulbasaor = 0){
                System.out.println("La batalla se ah acabado, el vencedor fue charmander");
            }
            if else{ 
                charmander = 100+16/25-25*2-16/25-25*2;
                System.out.println("GOLPE NO EFECTIVO. La vida de bulbasaor ahora es de:"+ charmander);
               }
            break;

        }
    }
        case 2:
        System.out.println("Squartle ataca primero");
        System.out.println("Charmander ataca!!!!");
        if (charmander = 0 )
        {
            squartle = 100+20/14-14*2;
            System.out.println("GOLPE CRITICO. La vida de squartle ahora es de:"+ bulbasaor);
                            
    }
    Sytem.out.println("TURNO DE CHARMANDER:");
    Sytem.out.println("Charmander ataca!!!!:");
   if (bulbasaor = 0)
   { System.out.println("La batalla se ah acabado, el vencedor fue bulbasour");
}
 if else
  {   
     charmander = 100+16/25-25*2;
    System.out.println("GOLPE NO EFECTIVO. La vida de bulbasaor ahora es de:"+ charmander);
   }
   Sytem.out.println("TURNO DE CHARMANDER:");
   Sytem.out.println("Charmander ataca!!!!:");
   if (charmander = 0 ){
       System.out.println("La batalla se ah acabado, el vencedor fue bulbasour");
}
 if else
 {
 bulbasaor = 100+20/14-14*2-20/14-14*2;
    System.out.println("GOLPE CRITICO. La vida de bulbasaor ahora es de:"+ bulbasaor);
}
if (bulbasaor = 0){
    System.out.println("La batalla se ah acabado, el vencedor fue charmander");
}
if else{ 
    charmander = 100+16/25-25*2-16/25-25*2;
    System.out.println("GOLPE NO EFECTIVO. La vida de bulbasaor ahora es de:"+ charmander);
   }
break;
    }
    System.out.println(" ");
    System.out.println("Digite m nuevamente para ir al men\u00fa.");
    System.out.println("Digite x para cerrar el programa.");
    System.out.println(" ");
    System.out.println("Esta pokedex esta hecha por:");
    System.out.println("3IV8 SILVA JUAREZ ALEJANDRO ");
    letra = entrada.next().charAt(0);

}while(letra == 'm');       
}
}