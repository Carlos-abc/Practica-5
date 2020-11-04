import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        char tecla;

        System.out.print("\t\t\n       Ingrese los datos iniciales ");
        System.out.println("\n");
        Cuenta usuario = Bancoo.CapturarDatos();

        int pin;

        int i=0;

        System.out.println("\n[ 1 ] Consultar estado de la cuenta existente");
        System.out.println("[ 2 ] Crear nueva cuenta");
        System.out.print("\nIngrese la opcion que desee: ");
    
                tecla = entrada.next().charAt(0);
                System.out.print("\n");

        switch(tecla){

            case '1':
            
                do{

                i++;
    
                if(i == 1){
    
                    System.out.print("Para consultar datos Ingrese el PIN: ");
                    pin = entrada.nextInt();
     
                } else{
    
                    System.out.print("PIN INCORRECTO.");
                    System.out.print("\n\nIngrese el PIN: ");
                    pin = entrada.nextInt();
                } 
    
            }while(Bancoo.VerificarPin(usuario,pin) == 0);
    
            if(pin == usuario.getPin()){
    
    
            do{
    
                System.out.print("\n");
                System.out.print("\t\tMenu");
                System.out.print("\n\n");
                System.out.println(" [ 1 ] Consultar Saldo");
                System.out.println(" [ 2 ] Retirar Fondos");
                System.out.println(" [ 3 ] Ingresar Fondos");
                System.out.println(" [ 4 ] Salir");
                System.out.print("\nIngrese la opcion que desee: ");
    
                tecla = entrada.next().charAt(0);
                System.out.print("\n");
    
            
                    switch(tecla){
                        
                        
                    
                        case '1': Bancoo.ConsultarSaldo(usuario); break;
    
                        case '2': System.out.print("Ingrese la cantidad que desea retirar: ");
                                  float cantidad = entrada.nextFloat();
                                  Bancoo.RetirarFondos(usuario,cantidad); break;
    
                        case '3': System.out.print("Ingrese la cantidad que desea ingresar: ");
                                  float cantidad1 = entrada.nextFloat();
                                  Bancoo.IngresarFondos(usuario,cantidad1); break;
    
                        case '4': System.exit(0); break;
    
                    
                    
                    
                    
                    
                    }
    
                    System.out.println("\nDesea hacer otra operacion? [S/N]");
                    tecla = entrada.next().charAt(0);
    
    
                }while(tecla == 's' || tecla == 'S');
    
    
            }else System.out.println("PIN INCORRECTO");

            break;
        
          

          case '2': System.out.println("\t  Ingrese los datos de la nueva cuenta");
                    usuario = Bancoo.CapturarDatos();
                    break;

        }
            
    }

        
}

