package examen1_ronalzuniga;

public class ElMachetes extends Persona{
    private int desaparecidos;

    public ElMachetes() {
        super();
    }

    public ElMachetes(int desaparecidos, String nombre, int edad, String sexo, Arma arma) {
        super(nombre, edad, sexo, arma);
        this.desaparecidos = desaparecidos;
    }

    public int getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(int desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    @Override
    public String toString() {
        return "ElMachetes{" + "desaparecidos=" + desaparecidos + '}';
    }
    
    
}
