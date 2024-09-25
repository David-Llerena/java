package clearminds.cuentas;

public class Cuenta {
    private String id;
    private String tipo;
    private double saldo;

    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A";
    }
    
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void imprimir() {
    	System.out.println("********************");
    	System.out.println("CUENTA");
    	System.out.println("********************");
    	System.out.println("Numero de cuenta: "+id);
    	System.out.println("Tipo: "+tipo);
    	System.out.println("Saldo: USD "+saldo);
    }
    public void imprimirConMiEstilo() {
        String separador = "==========================";
        String moneda = "USD ";
        
        System.out.println(separador);
        System.out.println("     DETALLE DE CUENTA     ");
        System.out.println(separador);
        System.out.printf("Número de cuenta: %s%n", id);
        System.out.printf("Tipo de cuenta  : %s%n", tipo);
        System.out.printf("Saldo actual    : %s%.2f%n", moneda, saldo);
        System.out.println(separador);
    }
    
    
}