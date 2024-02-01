import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        // On demande à l'utilisateur la taille du panier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Initialisation du tableaux des noms et des prix
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHTAccessoires = new double[taillePanier];

        // On demande à l'utilisateur le nom et le prix HT de chaque accessoire
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Entrez le nom de la console " + (i + 1) + ": ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Entrez le prix HT de la console " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();
        }

        // Noms et prix HT des accessoires en utilisant une boucle for
        System.out.println("Liste des consoles avec leurs prix HT dans le panier :");
        double sommeTotale = 0;
        for (int i = 0; i < taillePanier; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Console: " + nom + ", Prix HT: " + prixHT + " €");
            sommeTotale += prixHT;
        }

        // Somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        scanner.close();
    }
}
