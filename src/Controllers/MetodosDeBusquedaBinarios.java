package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosDeBusquedaBinarios {
    
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosDeBusquedaBinarios(Persona[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binario");
    }

    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length -1; 
        while(alto >= bajo ){
            int central = (alto + bajo) /2;

            if (people[central].getCode() == code){
                return central;                         // no va else luego porque el return ya sale del metodo
            }
            if (people[central].getCode() > code){
                alto = central -1;
            }else{
                bajo = central + 1; //derecha
            }            
        }
        return -1; 
    }

    public void showPersonByCode() {
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1 ){
            pantalla.showMessage("Persona con codigo "+codeToFind+ " no encontrada");
        }else {
            pantalla.showMessage("Persona con codigo" + codeToFind+" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }
    public static void ordenarBurbuja(Persona[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    // Intercambiar elementos
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        }
    public int findPersonByName ( String name){
        int bajo = 0;
        int alto = people.length -1; 
        while(alto >= bajo ){
            int central2 = (alto + bajo) /2;

            if (people[central2].getName().equalsIgnoreCase(name)){
                return central2;                         // no va else luego porque el return ya sale del metodo
            }
            if (people[central2].getName().compareToIgnoreCase(name) > 0 ){
                alto = central2 -1;
            }else{
                bajo = central2 + 1; //derecha
            }            
        }
        return -1;

    }

    public void showPersonByName (){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson == -1 ){
            pantalla.showMessage("Persona con nombre "+nameToFind+ " no encontrada");
        }else {
            pantalla.showMessage("Persona con nombre" + nameToFind+" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }
    
}
