public class Empleado {
    private String nombre;
    private int diasAusente;
    private String desempeñoBuenoMedioMalo;


    public Empleado(String nombre, int diasAusente, String desempeñoBuenoMedioMalo) {
        this.nombre = nombre;
        this.diasAusente = diasAusente;
        this.desempeñoBuenoMedioMalo = desempeñoBuenoMedioMalo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasAusente() {
        return diasAusente;
    }

    public void setDiasAusente(int diasAusente) {
        this.diasAusente = diasAusente;
    }

    public String getDesempeñoBuenoMedioMalo() {
        return desempeñoBuenoMedioMalo;
    }

    public void setDesempeñoBuenoMedioMalo(String desempeñoBuenoMedioMalo) {
        this.desempeñoBuenoMedioMalo = desempeñoBuenoMedioMalo;
    }


}