import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Veuillez saisir la marque du véhicule :");
        String Marque = sc.nextLine();

        System.out.println("Veuillez saisir le modèle du véhicule :");
        String modèle = sc.nextLine();

        System.out.println("Veuillez saisir le prix hors taxes du véhicule :");
        double prixHT = sc.nextDouble();

        double tva = 0.2;
        double prixTTC = prixHT * (1 + tva);

        System.out.println("Le prix TTC du véhicule est : " + prixTTC);

        // Vérifiez si le prix est supérieur à 20 000 et appliquez une réduction
        if (prixHT > 20000) {
            double remise = prixHT * 0.1;
            prixHT -= remise;
            System.out.println("Prix avec remise : " + prixHT);
        }

    

    }
}


