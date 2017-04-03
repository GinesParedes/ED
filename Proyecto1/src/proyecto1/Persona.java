package Proyecto1;

public class Persona {
    protected String tlf;
    
    
    public Persona(String tlf){
        this.tlf = tlf;
    }
    
    public String getNumeroDeTelefono(){
        return tlf;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.tlf = numeroDeTelefono;
    }
    
    
}
