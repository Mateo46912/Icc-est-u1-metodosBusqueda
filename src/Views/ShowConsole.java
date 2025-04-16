package Views;
import java.util.Scanner;

public class ShowConsole {

    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
        
    }

    
    public void showBanner(){
        System.out.println("--Metodos de Busqueda--");
        System.out.println();
    }

    public int inputCode (){
        System.out.print("Ingrese un codigo: ");
        int code = scanner.nextInt();
        return code;
    }

    public String inputName(){
        System.out.print("Ingrese el nombre a buscar: ");
        String name = scanner.next();
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    
}
