public class Cuenta extends Bancoo {

    private String nombre;
    private float saldo;
    private int pin;


    public Cuenta(String nombre, float saldo, int pin){

        this.nombre = nombre;
        this.saldo = saldo;
        this.pin = pin;

    }
    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){

        return nombre;
    }
    public void setSaldo(float saldo){

        this.saldo = saldo;
    }
    public float getSaldo(){

        return saldo;
    }
    public void setPin(int pin){

        this.pin = pin;
    }
    public int getPin(){

        return pin;
    }
    
}
