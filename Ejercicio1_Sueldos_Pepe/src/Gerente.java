public class Gerente extends Empleado{
private double bonoPorPresentismo;
private double bonoPorDesempeño;
private double sueldoNeto;

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    private double sueldo;

    public Gerente(String nombre, int diasAusente, String desempeñoBuenoMedioMalo) {
        super(nombre, diasAusente, desempeñoBuenoMedioMalo);
        this.sueldoNeto=1000;

    }

    public void fijarBonoPorPresentismo (int bonoPorPresentismo){
    if (getDiasAusente()==0){
    bonoPorPresentismo = 100;
    } else if (getDiasAusente()==1) {bonoPorPresentismo = 50;
    }else{
    bonoPorPresentismo = 0;
    }
    this.bonoPorPresentismo=bonoPorPresentismo;
    System.out.println(this.getNombre()+" falto "+this.getDiasAusente()+" al trabajo y obtuvo "+this.bonoPorPresentismo+"$ de bono por presentismo");
    }
    public void fijarBonoPorDesempeño (double bonoPorDesempeño){

        if (getDesempeñoBuenoMedioMalo().equalsIgnoreCase("bueno")){
            bonoPorDesempeño = getSueldoNeto()*0.1;
        } else if (getDesempeñoBuenoMedioMalo().equalsIgnoreCase("medio")) {
            bonoPorDesempeño = 80;
        }else{
            bonoPorDesempeño = 0;
        }
        this.bonoPorDesempeño=bonoPorDesempeño;
        System.out.println(this.getNombre()+" tuvo un desempeño "+this.getDesempeñoBuenoMedioMalo()+" y sumo "+this.bonoPorDesempeño+"$ de bono por desempeño");
    }

    public double getBonoPorPresentismo() {
        return bonoPorPresentismo;
    }

    public void setBonoPorPresentismo(double bonoPorPresentismo) {
        this.bonoPorPresentismo = bonoPorPresentismo;
    }

    public double getBonoPorDesempeño() {
        return bonoPorDesempeño;
    }

    public void setBonoPorDesempeño(double bonoPorDesempeño) {
        this.bonoPorDesempeño = bonoPorDesempeño;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void fijarSueldo(double sueldoNeto){
       sueldo = this.getSueldoNeto() + this.getBonoPorPresentismo() + this.getBonoPorDesempeño();
        this.sueldo=sueldo;
        System.out.println(this.getNombre()+" cobrara este mes "+this.getSueldo());
    }
}
