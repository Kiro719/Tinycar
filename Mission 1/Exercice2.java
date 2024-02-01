public class Exercice2 {

    public static void main(String[] args) {

        double prixHT = 100;
        double tva = 0.2;

        double prixTTC = prixHT + (prixHT * tva);

        System.out.println("Prix TTC : " + prixTTC);
    }
}
