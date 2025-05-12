public class Main {
    public static void main(String[] args) {

        // Crear objetos Usuario correctamente
        Usuario usuario1 = new Usuario("Ashly Garcìa", "Garcìa C", 16, 2008);
        Usuario usuario2 = new Usuario("Rubì Soto", "Soto N", 15, 2009);

        //Mètodo del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        System.out.println(usuario1.getEdad());

        if (usuario1.getEdad()>= 18){
            System.out.println("Mayor de edad");
        }
    }
}
