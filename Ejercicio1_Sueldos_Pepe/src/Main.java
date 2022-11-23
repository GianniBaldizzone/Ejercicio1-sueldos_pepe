public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Gerente pepe = new Gerente("Pepe",
            0,
            "medio");

        Cadete pepito = new Cadete("Pepito",
                1,
                "malo");
    pepe.fijarBonoPorPresentismo(pepe.getDiasAusente());
    pepe.fijarBonoPorDesempeño(pepe.getSueldoNeto());
    pepe.fijarSueldo(pepe.getSueldoNeto());

    pepito.fijarBonoPorPresentismo(pepito.getDiasAusente());
    pepito.fijarBonoPorDesempeño(pepito.getSueldoNeto());
    pepito.fijarSueldo(pepito.getSueldoNeto());


    }




}