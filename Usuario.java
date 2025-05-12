
public class Usuario {
    
    //Propiedades del objeto
    private String nombre;
    private String apellidos;
    private int edad;
    private int fechaNacimiento;

    //Mètodo Constructor 
    public Usuario(String nombre , String apellido , int edad , int fechaNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;


    }
    //Mètodo gets
    public int getEdad(){
        return this.edad;

    }

    public String getApellidos() {
        return apellidos;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Mètodo sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
}