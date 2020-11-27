public class espacio{

    //esta clase se encarga de hacer de cuadradito en el buscaminas
    private int minascerca;
    private boolean espM, revelado;
    public espacio(){

        //Se le agrega valores a las variables(private int y private boolean)

        minascerca=0;
        espM=false;
    }
    public void coMina(){

        //se encarga de decir a un espacio si es mina o no
        espM=true;
    }
    public void aumentarMinas(){

        //se encarga de aumentar el numero de minas del espacio

        if(espM==false){
            minascerca++;
        }
    }
    public boolean verMina(){

        //te dice si el espacio es una mina o no

        return espM;
    }
    public boolean verRevelado(){

        //te dice si ya visitaste este espacio mientras estas jugando

        return revelado;
    }
    public void cambiarEstado(){

        //una vez que visites un espacio este cambia su estado a revelado

        revelado=true;
    }
    public String toString(){

        //toString imprime en pantalla cuando pones System.out.println

        String res="*";
        if(revelado==true){
            res=""+minascerca;
        }
        if(espM==true&&revelado==true)
        res="X";
        return res;
    }
}