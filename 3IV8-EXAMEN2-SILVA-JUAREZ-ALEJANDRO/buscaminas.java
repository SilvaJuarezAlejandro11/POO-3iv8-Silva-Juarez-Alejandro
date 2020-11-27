import java.util.Scanner;
public class buscaminas{
    Scanner scan=new Scanner(System.in);
    public static void main(String arg[]){

        //esta parte del codigo se encarga de crear los objetos necesarios para ejecutar el programa

        Scanner scan=new Scanner(System.in);
        int filas, columnas, nMinas, score, s=0;
        espacio[][] buscaminas;
        System.out.println("Buscaminas");
        while(true){
            try{
        System.out.print("Ingrese el numero de filas(5-20): ");
        filas=scan.nextInt();        
        if(filas<5||filas>20){
            filas=10;
            s=1;
        }
        System.out.print("Ingrese el numero de columnas(5-20): ");
        columnas=scan.nextInt();
        if(columnas<5||columnas>20){
            columnas=10;
            s++;
            if (s==2){
                System.out.println("Coordenadas fuera de rango tamaño predeterminado 10X10");
            }
        }
        break;
    }catch(Exception e){
        System.out.println("Seleccione un valor correcto y numerico");
        System.out.println("Error: " + e.getMessage());
        scan.next();
    }
}
        nMinas=filas+columnas;
        score=(filas*columnas)-(nMinas);
        System.out.println("El numero de minas es: "+nMinas);
        System.out.println("A jugar!!!");
        buscaminas=new espacio[columnas][filas];
        buscaminas=new buscaminas().llenarTablero(buscaminas,0,0,columnas,filas);
        buscaminas=new buscaminas().coMinas(buscaminas,nMinas,columnas,filas);
        buscaminas=new buscaminas().minascerca(buscaminas,0,0,columnas,filas);
        buscaminas=new buscaminas().juego(buscaminas,columnas,filas,score);
    }

    public espacio[][] llenarTablero(espacio[][] buscaminas,int i,int j,int c,int f){

        //esta parte del codigo se encarga de llenar el tablero de las minas con espacios vacios

        if(j<f){
            if(i<c){
                buscaminas[i][j]=new espacio();
                buscaminas=llenarTablero(buscaminas,++i,j,c,f);
            }
            else{
                i=0;
                buscaminas=llenarTablero(buscaminas,i,++j,c,f);
            }
        }
        return buscaminas;
    }
    public espacio[][] coMinas(espacio[][] buscaminas,int n,int c,int f){

        //se encarga de colocar las minas en el buscaminas

        int azar1=(int)(Math.random()*(c-1));
        int azar2=(int)(Math.random()*(f-1));
        if(n>0){
            if(buscaminas[azar1][azar2].verMina()==false){
                buscaminas[azar1][azar2].coMina();
                n--;
            }
            buscaminas=coMinas(buscaminas,n,c,f);
        }
        return buscaminas;
    }
    public espacio[][] minascerca(espacio[][] buscaminas,int i,int j,int c,int f){

        //se encarga de averiguar cuantas minas alrededor tiene un espacio en el buscaminas

        if(j<f){
            if(i<c){
                if(buscaminas[i][j].verMina()==true){
                    if(i>0){
                        buscaminas[i-1][j].aumentarMinas();
                        if(j>0){
                            buscaminas[i-1][j-1].aumentarMinas();
                        }
                        if(j<f-1){
                            buscaminas[i-1][j+1].aumentarMinas();
                        }
                    }
                    if(i<c-1){
                        buscaminas[i+1][j].aumentarMinas();
                        if(j>0){
                            buscaminas[i+1][j-1].aumentarMinas();
                        }
                        if(j<f-1){
                            buscaminas[i+1][j+1].aumentarMinas();
                        }
                    }
                    if(j>0){
                        buscaminas[i][j-1].aumentarMinas();
                    }
                    if(j<f-1){
                        buscaminas[i][j+1].aumentarMinas();
                    }
                }
                buscaminas=minascerca(buscaminas,++i,j,c,f);
            }
            else{
                i=0;
                buscaminas=minascerca(buscaminas,i,++j,c,f);
            }
        }
        return buscaminas;
    }
    public void imprimir(espacio[][] buscaminas,int i,int j,int c,int f){

        //imprime en pantalla el tablero del buscaminas

        if(j<f){
            if(i<c){
                System.out.print(buscaminas[i][j]+" ");
                imprimir(buscaminas,++i,j,c,f);
            }
            else{
                i=0;
                System.out.println("");
                imprimir(buscaminas,i,++j,c,f);
            }
        }
    }
    public espacio[][] juego(espacio[][] buscaminas,int columnas,int filas,int score){

        //esta parte se encarga de hacer que el usuario juegue con el buscaminas

        imprimir(buscaminas,0,0,columnas,filas);
        System.out.println("Ingrese el numero de fila y columna que desea explorar");
        while(true){
            try{
        System.out.print("Ingrese el numero de la fila: ");
        int f=scan.nextInt();
        System.out.print("Ingrese el numero de la columna: ");
        int c=scan.nextInt();
        if(f<=filas&&c<=columnas){
            if(buscaminas[c-1][f-1].verRevelado()==false){
                buscaminas[c-1][f-1].cambiarEstado();
                score--;
            }
            if(score==0){
                System.out.println("!Felicidades!, has ganado");
            }
            else{
                if(buscaminas[c-1][f-1].verMina()==true){
                    imprimir(buscaminas,0,0,columnas,filas);
                    System.out.println("!Pisaste una Mina!. Has perdido :(");
                }
                else{
                    juego(buscaminas,columnas,filas,score);
                }
            }
        }
        else{
            juego(buscaminas,columnas,filas,score);
        }
        break;
    }catch(Exception e){
        System.out.println("Seleccione un valor correcto y numerico");
        System.out.println("Error: " + e.getMessage());
        scan.next();
    }
}
   
        return buscaminas;
    }
}
