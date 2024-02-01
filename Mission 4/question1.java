public class question1 {
    public static void main(String[] args) {
        // Créer un tableau pour les noms des accessoires
        String[] nomsAccessoires = {"PS5", "Xbox", "PS4", "Nintendo Switch"};

        // Créer un tableau pour les prix HT des accessoires
        double[] prixHTAccessoires = {500, 500, 250, 300};

        // Afficher les noms et les prix HT des accessoires en utilisant une boucle for
        for (int i = 0; i < nomsAccessoires.length; i++) {
            String nom = nomsAccessoires[i];
            double prixHT = prixHTAccessoires[i];
            System.out.println("Nom de la console: " + nom + ", Prix HT: " + prixHT + " €");
        }
    }
}
