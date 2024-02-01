import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // Initialisation du tableau des noms des accessoires avec des valeurs inventées
        String[] nomsAccessoires = {"PS5", "Xbox séries x", "PS4", "Xbox séries s","Nintendo Switch"};

        // Création d'un tableau pour les prix HT des accessoires
        double[] prixHTAccessoires = new double[nomsAccessoires.length];

        // On demande à l'utilisateur le prix HT de chaque accessoire
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomsAccessoires.length; i++) {
            System.out.print("Entrez le prix HT de la Console " + nomsAccessoires[i] + ": ");
            prixHTAccessoires[i] = scanner.nextDouble();
        }

        // Noms et  prix HT des accessoires en utilisant une boucle for
        System.out.println("Liste des console avec leurs prix HT :");
        for (int i = 0; i < nomsAccessoires.length; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Console: " + nom + ", Prix HT: " + prixHT + " €");
        }

        
        scanner.close();
    }
}
