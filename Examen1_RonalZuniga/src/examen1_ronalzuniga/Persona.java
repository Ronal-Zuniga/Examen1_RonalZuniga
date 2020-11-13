package examen1_ronalzuniga;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private Arma arma;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Arma arma) {
        this.nombre = nombre;
        this.edad = edad;
        setSexo(sexo);
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if ("Masculino".equals(sexo) || "Femenino".equals(sexo)) {
            this.sexo = sexo;
        }
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + sexo + ", " + arma;
    }

}
