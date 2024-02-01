import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        // Demande à l'utilisateur la taille du panier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Initialisation du tableaux du noms et des prix
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHTAccessoires = new double[taillePanier];

        // Demande à l'utilisateur le nom et le prix HT de chaque accessoire
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Entrez le nom de la Console " + (i + 1) + ": ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Entrez le prix HT de la console  " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();
        }

        // Affichage du noms et des prix HT des accessoires en utilisant une boucle for
        System.out.println("Liste des consoles avec leurs prix HT dans le panier :");
        double sommeTotale = 0;
        double prixMin = prixHTAccessoires[0];  // initialisation avec le premier prix
        double prixMax = prixHTAccessoires[0];  // initialisation avec le premier prix

        for (int i = 0; i < taillePanier; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Console: " + nom + ", Prix HT: " + prixHT + " €");

            // Mettre à jour la somme totale
            sommeTotale += prixHT;

            //  Prix minimum
            if (prixHT < prixMin) {
                prixMin = prixHT;
            }

            // Prix maximum
            if (prixHT > prixMax) {
                prixMax = prixHT;
            }
        }

        // Somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        // Accessoire le moins cher
        System.out.println("Console la moins cher : " + getNomParPrix(prixHTAccessoires, prixMin) + ", Prix : " + prixMin + " €");

        // Accessoire le plus cher
        System.out.println("Console la plus cher : " + getNomParPrix(prixHTAccessoires, prixMax) + ", Prix : " + prixMax + " €");

        // Calcule et affichage  du  prix moyen
        double prixMoyen = sommeTotale / taillePanier;
        System.out.println("Prix moyen : " + prixMoyen + " €");

        
        scanner.close();
    }

    // Fonction permettant d'obtenir le nom de l'accessoire correspondant à un certain prix
    private static String getNomParPrix(double[] prix, double targetPrix) {
        for (int i = 0; i < prix.length; i++) {
            if (prix[i] == targetPrix) {
                return "Console" + (i + 1);
            }
        }
        return "Non trouvé";
    }
}
