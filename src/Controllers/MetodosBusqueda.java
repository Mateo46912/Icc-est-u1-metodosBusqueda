package Controllers;

import Models.Persona;
import Views.ShowConsole;


public class MetodosBusqueda{

    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }
    
    // public int BusquedaLineal(int arreglo[], int datoBuscado){   // Se usa este metodo si el arreglo no esta ordenado
    //    int n= arreglo.length;
    //     for (int i=0 ; i< n ; i++){
    //         if (arreglo[i] == datoBuscado ){
    //             return i;
    //         } 
    //     }
    //     return -1;
        
    // }

    public int findPersonByCode(int code){
        for (int i=0 ; i< people.length ; i++){
            if (people[i].getCode() == code ){
                return i;
            }    
       }
       return -1;
    }

    public void showPerson (){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con codigo "+ codeToFind+" Encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
    // public int findPersonByName(String name){
    //     return -1;
    // }
    // public void showPersonByName(){
    //     String nameTofinde = showConsole.inputName();
    //     int indexPerson = findPersonByName(nameTofinde);

    // }


    
    public void printArray (int arreglo[]){
        for (int n : arreglo){
            System.out.print(n + ", ");
        }

    }
}
