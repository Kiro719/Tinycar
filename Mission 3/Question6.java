import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saisie de la marque du véhicule
        System.out.println("Veuillez saisir la marque du véhicule :");
        String marque = sc.nextLine();

        // Saisie du modèle du véhicule
        System.out.println("Veuillez saisir le modèle du véhicule :");
        String modele = sc.nextLine();

        // Saisie du prix hors taxes du véhicule
        System.out.println("Veuillez saisir le prix hors taxes du véhicule :");
        double prixHT = sc.nextDouble();

        double tva = 0.2;
        double prixTTC = prixHT * (1 + tva);

        System.out.println("Le prix TTC du véhicule est : " + prixTTC);

        // Vérification si le prix est supérieur à 20 000 et application d'une réduction
        if (prixHT > 20000) {
            double remise = prixHT * 0.1;
            prixHT -= remise;
            System.out.println("Prix avec remise : " + prixHT);
        }

        // Saisie du nombre de produits à traiter
        System.out.println("Veuillez saisir le nombre de produits à traiter :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Saisie du prix du produit
            System.out.println("Saisissez le prix du produit " + i + " : ");
            double prixProduit = sc.nextDouble();

            sc.nextLine(); // Pour consommer la nouvelle ligne restante après la saisie du prix.

            // Saisie de l'information sur l'électricité du produit
            System.out.print("Le produit est-il électrique ? (Oui/Non) : ");
            String estElectrique = sc.nextLine();

            double tauxTVA;
            if (estElectrique.equalsIgnoreCase("Oui")) {
                tauxTVA = 0.05;
            } else if (estElectrique.equalsIgnoreCase("Non")) {
                tauxTVA = 0.20;
            } else {
                System.out.println("Réponse invalide. Veuillez saisir 'Oui' ou 'Non'.");
                continue;
            }

            double tvaProduit = prixProduit * tauxTVA;
            double prixTotal = prixProduit + tvaProduit;

            System.out.println("Prix du produit " + i + " : " + prixProduit + " €");
            System.out.println("TVA (" + (tauxTVA * 100) + "%) : " + tvaProduit + " €");
            System.out.println("Prix total : " + prixTotal + " €");
        }

        System.out.println("Merci d'avoir utilisé notre programme. Au revoir !");
        sc.close();
    }
}
