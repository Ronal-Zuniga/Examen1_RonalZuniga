package examen1_ronalzuniga;

public class Campistas extends Persona{
    private String tipo;
    private String estado;

    public Campistas() {
        super();
    }

    public Campistas(String tipo, String estado, String nombre, int edad, String sexo, Arma arma) {
        super(nombre, edad, sexo, arma);
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ("Supervisor".equals(tipo) || "Campista".equals(tipo)) {
            this.tipo = tipo;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if ("Vivo".equals(tipo) || "Desaparecido".equals(tipo)) {
            this.estado = estado;
        }
    }

    @Override
    public String toString() {
        return super.getNombre() + ", "+super.getEdad();
    }
    
    
}
