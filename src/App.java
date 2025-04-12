import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {
       //INSTANCIAS 
            MetodosBusqueda lineal = new MetodosBusqueda();
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

       //DATOS
            int arr[] = new int[100];
            for (int i=0; i< arr.length; i++){     //Genera 100 numeros aleatorios entre 1 y 100 pero se pueden repetir
                arr[i]=(int)
                (Math.random()* 100)+1;
            }
            System.out.println("");
            System.out.print("Ingrese el valor que desea encontrar en un arreglo de 100 numeros aleatorios: ");
            int datoBuscado = scanner.nextInt();     

        //Proceso y respuesta
            int resultado = lineal.BusquedaLineal(arr, datoBuscado);
            if (resultado !=-1){
            System.out.println("El valor buscado: " +datoBuscado );
            System.out.println("Esta en la posicion: "+"["+resultado+"]" +" --> (Recordar que la primera posicion del arreglo es cero)");
            System.out.println("");
            System.out.print("Del arrelo: ");
            lineal.printArray(arr);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("El valor buscado: ´" +datoBuscado+ "´"); 
            System.out.println("");
            System.out.print("No se encuentra en el arreglo: ");
            lineal.printArray(arr);
            System.out.println("");
        } 

    }

}
