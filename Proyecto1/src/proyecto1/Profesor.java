package Proyecto1;

import java.util.List;

public class Profesor extends Persona {
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;
    
    public Profesor (String numeroDeTelefono, String nombre, int edad){
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
    }
        
    public void printTodaLaInformacion(){
        printInformacionPersonal();  
    } 
    
    public void printInformacionPersonal() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + this.numeroTlf);
    } 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the prestamos
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
}
