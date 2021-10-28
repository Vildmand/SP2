public class Main {


    public static void main(String[] args) {
        Garage g1 = new Garage();

        Bil BMWZ3 = new Benzinbil(1111,"BMW", "Z3", 1996, 2, 95, 11);
        Bil VolvoV90 = new Dieselbil(2222, "Volvo", "V90", 2018, 4, true, 22);
        Bil HondaE = new Elbil(2222, "Honda", "E", 2020, 2, 28, 170, 168);

        g1.tilføjBilTilGarage(BMWZ3);
        g1.tilføjBilTilGarage(VolvoV90);
        g1.tilføjBilTilGarage(HondaE);
        System.out.println("Bilerne i garagen: \r\n" + g1);
        g1.udregnGrønAfgift();

    }

}
