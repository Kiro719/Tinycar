import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir la marque du véhicule :");
        String marque = sc.nextLine();

        System.out.println("Veuillez saisir le modèle du véhicule :");
        String modèle = sc.nextLine();

        System.out.println("Veuillez saisir le prix hors taxes du véhicule :");
        double prixHT = sc.nextDouble();

        double tva = 0.2;
        double prixTTC = prixHT * (1 + tva);

        System.out.println("Le prix TTC du véhicule est : " + prixTTC);

        // Check if the price is greater than 20000 and apply a discount
        if (prixHT > 20000) {
            double remise = prixHT * 0.1;
            prixHT -= remise;
            System.out.println("Prix avec remise : " + prixHT);
        }
    }
}
