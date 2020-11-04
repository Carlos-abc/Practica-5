import java.util.Scanner;

public class Bancoo{
    
    public static Cuenta CapturarDatos(){

        String nombre;
        float saldo;
        int pin;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        saldo = entrada.nextFloat();
        System.out.print("Ingrese el pin: ");
        pin = entrada.nextInt();

        Cuenta usuario = new Cuenta(nombre,saldo,pin);

        return usuario;
    }

    public static void ConsultarSaldo(Cuenta usuario){

        System.out.println("El saldo de su cuenta es: "+usuario.getSaldo());
     }

     public static void RetirarFondos(Cuenta usuario,float cantidad){

        if(cantidad > usuario.getSaldo()){

            System.out.println("Fondos Insuficientes");
        } 
        else{
            
            usuario.setSaldo(usuario.getSaldo()-cantidad);
            System.out.println("Nuevo Saldo: "+usuario.getSaldo());
        }
    
    }

    public static void IngresarFondos(Cuenta usuario, float cantidad){

        usuario.setSaldo(usuario.getSaldo()+cantidad);
        System.out.println("Nuevo Saldo: "+usuario.getSaldo());
    }

    public static int VerificarPin(Cuenta usuario, int pin){

        if(pin == usuario.getPin()){

            return 1;
        
        } else return 0;

    }

}
