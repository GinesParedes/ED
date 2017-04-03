package Proyecto1;

public class Persona {
    protected String numeroTlf;
    
    
    public Persona(String tlf){
        this.numeroTlf = tlf;
    }
    
    public String getNumeroDeTelefono(){
        return numeroTlf;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroTlf = numeroDeTelefono;
    }
    
    
}
