import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        //se crea una constante que en este caso es AGE_LIMIT
        final int AGE_LIMIT = 18;
 //se crea un Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);
        //el usuario ingresa la edad 
        System.out.print("Enter you age");

        int age = scanner.nextInt();

        //validar si la edad ingresada es mayor o igual a la edad limite
        
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
        //se cierra el scanner
        scanner.close();
        
    }
}
