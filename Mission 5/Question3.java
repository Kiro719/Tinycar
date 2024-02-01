import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Demande à l'utilisateur la taille du panier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Initialisation des tableaux des noms, des prix HT et des prix TTC
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHTAccessoires = new double[taillePanier];
        double[] prixTTCAccessoires = new double[taillePanier];

        // Demande à l'utilisateur le nom et le prix HT de chaque accessoire
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Entrez le nom de la Console " + (i + 1) + ": ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Entrez le prix HT de la console  " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();

            // Utiliser la nouvelle fonction pour calculer le prix TTC
            prixTTCAccessoires[i] = calculerPrixTTC(prixHTAccessoires[i]);
        }

        // Affichage du noms, des prix HT et des prix TTC des accessoires
        System.out.println("Liste des consoles avec leurs prix HT et TTC dans le panier :");
        for (int i = 0; i < taillePanier; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            double prixTTC = prixTTCAccessoires[i];
            System.out.println("Console: " + nom + ", Prix HT: " + prixHT + " €, Prix TTC: " + prixTTC + " €");
        }

         afficherElements(nomsAccessoires, prixHTAccessoires, prixTTCAccessoires, taillePanier);

        scanner.close();
    }

    // Nouvelle fonction pour calculer le prix TTC d'un accessoire
    private static double calculerPrixTTC(double prixHT) {
        // La TVA est de 20%
        double tauxTVA = 0.20;
        return prixHT * (1 + tauxTVA);
    }
     // Nouvelle procédure pour afficher les éléments des tableaux
    private static void afficherElements(String[] noms, double[] prixHT, double[] prixTTC, int taille) {
        System.out.println("Affichage des éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            String nom = noms[i];
            double prixHTValue = prixHT[i];
            double prixTTCValue = prixTTC[i];
            System.out.println("Console: " + nom + ", Prix HT: " + prixHTValue + " €, Prix TTC: " + prixTTCValue + " €");}
}
}
