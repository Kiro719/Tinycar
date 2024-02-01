import java.util.Scanner;

public class Question3 {
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

        // Vérifiez si le prix est supérieur à 20 000 et appliquez une réduction
        if (prixHT > 20000) {
            double remise = prixHT * 0.1;
            prixHT -= remise;
            System.out.println("Prix avec remise : " + prixHT);
        }

        // Demander à l'utilisateur de saisir le prix du produit
        System.out.print("Saisissez le prix du produit : ");
        double prixProduit = sc.nextDouble();

        // Demander à l'utilisateur de spécifier si le produit est électrique
        System.out.print("Le produit est-il électrique ? (Oui/Non) : ");
        sc.nextLine(); // Pour consommer la nouvelle ligne restante après la saisie du prix.
        String estElectrique = sc.nextLine();

        double tauxTVA;
        if (estElectrique.equalsIgnoreCase("Oui")) {
            tauxTVA = 0.05; // TVA à 5% pour les produits électriques
        } else if (estElectrique.equalsIgnoreCase("Non")) {
            tauxTVA = 0.20; // TVA à 20% pour les autres produits
        } else {
            System.out.println("Réponse invalide. Veuillez saisir 'Oui' ou 'Non'.");
            sc.close();
            return;
        }

        // Calculer la TVA
        double tvaProduit = prixProduit * tauxTVA;

        // Calculer le prix total
        double prixTotal = prixProduit + tvaProduit;

        // Afficher les résultats
        System.out.println("Prix du produit : " + prixProduit + " €");
        System.out.println("TVA (" + (tauxTVA * 100) + "%) : " + tvaProduit + " €");
        System.out.println("Prix total : " + prixTotal + " €");

        System.out.println("Entrez le code secret:");
        String code = sc.nextLine(); 

        if (code.equals("Dracolosse")) //Mot de passe à trouver pour avoir l'accés
         {
            System.out.println("Accès autorisé. Vous pouvez utiliser l'application.");//Si le mot de passe est trouver
        } else {
            System.out.println("Accès refusé. Au revoir!");//Si le mot de passe est faux
            System.exit(0);
        }

        sc.close();
    }
}