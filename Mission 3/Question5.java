import java.util.InputMismatchException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Veuillez saisir la marque du véhicule :");
            String marque = sc.nextLine();

            System.out.println("Veuillez saisir le modèle du véhicule :");
            String modele = sc.nextLine();

            double prixHT = 0;

            // Saisie du prix hors taxes avec validation
            boolean saisieValide = false;
            while (!saisieValide) {
                try {
                    System.out.println("Veuillez saisir le prix hors taxes du véhicule :");
                    prixHT = sc.nextDouble();
                    saisieValide = true;
                } catch (InputMismatchException e) {
                    System.out.println("Saisie invalide. Veuillez entrer un montant numérique.");
                    sc.nextLine(); // Pour consommer la nouvelle ligne restante après la saisie incorrecte.
                }
            }

            double tva = 0.2;
            double prixTTC = prixHT * (1 + tva);

            System.out.printf("Le prix TTC du véhicule est : %.2f €%n", prixTTC);

            // Vérifiez si le prix est supérieur à 20 000 et appliquez une réduction
            if (prixHT > 20000) {
                double remise = prixHT * 0.1;
                prixHT -= remise;
                System.out.printf("Prix avec remise : %.2f €%n", prixHT);
            }

            while (true) {
                // Saisie du prix du produit avec validation
                double prixProduit = 0;
                saisieValide = false;
                while (!saisieValide) {
                    try {
                        System.out.print("Saisissez le prix du produit : ");
                        prixProduit = sc.nextDouble();
                        saisieValide = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Saisie invalide. Veuillez entrer un montant numérique.");
                        sc.nextLine(); // Pour consommer la nouvelle ligne restante après la saisie incorrecte.
                    }
                }

                // Demander à l'utilisateur de spécifier si le produit est électrique
                System.out.print("Le produit est-il électrique ? (Oui/Non) : ");
                String estElectrique = sc.next().toLowerCase();

                double tauxTVA;
                if (estElectrique.equals("oui")) {
                    tauxTVA = 0.05; // TVA à 5% pour les produits électriques
                } else if (estElectrique.equals("non")) {
                    tauxTVA = 0.20; // TVA à 20% pour les autres produits
                } else {
                    System.out.println("Réponse invalide. Veuillez saisir 'Oui' ou 'Non'.");
                    continue; // Revenir au début de la boucle
                }

                // Calculer la TVA
                double tvaProduit = prixProduit * tauxTVA;

                // Calculer le prix total
                double prixTotal = prixProduit + tvaProduit;

                // Afficher les résultats
                System.out.printf("Prix du produit : %.2f €%n", prixProduit);
                System.out.printf("TVA (%.0f%%) : %.2f €%n", tauxTVA * 100, tvaProduit);
                System.out.printf("Prix total : %.2f €%n", prixTotal);

                // Demander à l'utilisateur s'il souhaite calculer un autre produit
                System.out.print("Voulez-vous calculer un autre produit ? (1 pour continuer, 0 pour quitter) : ");
                int choixUtilisateur = sc.nextInt();

                if (choixUtilisateur == 0) {
                    System.out.println("Merci d'avoir utilisé notre programme. Au revoir !");
                    break;
                } else if (choixUtilisateur != 1) {
                    System.out.println("Choix invalide. Le programme continuera.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Saisie invalide. Veuillez vérifier vos entrées.");
        } finally {
            sc.close();
        }
    }
}


    


         
         
         
         
         
         
        
        



        


        


        
        