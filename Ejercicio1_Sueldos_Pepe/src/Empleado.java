public class Empleado {
    private String nombre;
    private int diasAusente;
    private Boolean tieneBonoResultado;
    private int sueldoNeto;

    public Empleado(String nombre, int diasAusente, Boolean tieneBonoResultado, int sueldoNeto) {
        this.nombre = nombre;
        this.diasAusente = diasAusente;
        this.tieneBonoResultado = tieneBonoResultado;
        this.sueldoNeto = sueldoNeto;
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

    public Boolean getTieneBonoResultado() {
        return tieneBonoResultado;
    }

    public void setTieneBonoResultado(Boolean tieneBonoResultado) {
        this.tieneBonoResultado = tieneBonoResultado;
    }

    public int getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(int sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
}