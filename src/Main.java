public class Main {
    public static void main(String[] args) {
        Persona hombre = new Persona();
        Persona mujer = new Persona();
        hombre.setEdad(44);
        mujer.setEdad(42);
        hombre.setNombre("Rodolfo");
        mujer.setNombre("Cecilia");
        hombre.setTelefono("11-4987-2579");
        mujer.setTelefono("11-4357-7103");
        System.out.println("El hombre se llama: " + hombre.getNombre());
        System.out.println("Tiene: " + hombre.getEdad() + " años");
        System.out.println("Su numero de telefono es: " + hombre.getTelefono());
        System.out.println("La mujer se llama: " + mujer.getNombre());
        System.out.println("Tiene: " + mujer.getEdad() + " años");
        System.out.println("Su numero de telefono es: " + mujer.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}