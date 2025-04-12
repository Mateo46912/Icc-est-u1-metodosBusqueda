
public class MetodosBusqueda{


    public int BusquedaLineal(int arreglo[], int datoBuscado){   //Compara la posicion i con el valor buscado
       int n= arreglo.length;
        for (int i=0 ; i< n ; i++){
            if (arreglo[i] == datoBuscado ){
                return i;
            } 
        }
        return -1;
        
    }
    public void printArray (int arreglo[]){
        for (int n : arreglo){
            System.out.print(n + ", ");
        }

    }
}