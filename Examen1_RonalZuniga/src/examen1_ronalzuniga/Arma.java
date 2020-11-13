package examen1_ronalzuniga;

public class Arma {

    private String tipo;
    private double daño;

    public Arma() {
    }

    public Arma(String tipo, double daño) {
        setTipo(tipo);
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ("Pala".equals(tipo) || "Hacha".equals(tipo) || "Pistola".equals(tipo)
                || "Bate".equals(tipo) || "Sierra Eléctrica".equals(tipo) || "Puños".equals(tipo)) {
            this.tipo = tipo;
        }
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "tipo = " + tipo + ", damage = " + daño;
    }

}
