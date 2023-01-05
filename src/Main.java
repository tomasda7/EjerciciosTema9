public class Main {
    public static void main(String[] args) {

        //instancia de la clase cliente
        Cliente cliente = new Cliente();

        cliente.setEdad(35);
        cliente.setNombre("Lio Messi");
        cliente.setTelefono("765634367");
        cliente.setCredito(true);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.isCredito());

        //instacia de la clase trabajador
        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Luis Enrique");
        trabajador.setEdad(45);
        trabajador.setTelefono("444678901");
        trabajador.setSalario(2000);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: $" + trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

}

class Cliente extends Persona {
    private boolean credito;

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public boolean isCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}