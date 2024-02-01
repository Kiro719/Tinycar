import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir la marque du véhicule :");
        String marque = sc.nextLine();

        System.out.println("Veuillez saisir le modèle du véhicule :");
        String modele = sc.nextLine();

        System.out.println("Veuillez saisir le prix hors taxes du véhicule :");
        double prixHT = sc.nextDouble();

        double tva = 0.2;
        double prixTTC = prixHT * (1 + tva);

        System.out.println("Le prix TTC du véhicule est : " + prixTTC);

        if (prixHT > 20000) {
            double remise = prixHT * 0.1;
            prixHT -= remise;
            System.out.println("Prix avec remise : " + prixHT);
        }

        System.out.print("Saisissez le prix du produit : ");
        double prixProduit = sc.nextDouble();
        
        sc.nextLine(); // Pour consommer la nouvelle ligne restante

        System.out.print("Le produit est-il électrique ? (Oui/Non) : ");
        String estElectrique = sc.nextLine();

        double tauxTVA;
        if (estElectrique.equalsIgnoreCase("Oui")) {
            tauxTVA = 0.05;
        } else if (estElectrique.equalsIgnoreCase("Non")) {
            tauxTVA = 0.20;
        } else {
            System.out.println("Réponse invalide. Veuillez saisir 'Oui' ou 'Non'.");
            sc.close();
            return;
        }

        double tvaProduit = prixProduit * tauxTVA;
        double prixTotal = prixProduit + tvaProduit;

        System.out.println("Prix du produit : " + prixProduit + " €");
        System.out.println("TVA (" + (tauxTVA * 100) + "%) : " + tvaProduit + " €");
        System.out.println("Prix total : " + prixTotal + " €");

        System.out.println("Entrez le code secret:");
        String code = sc.nextLine();

        if (code.equals("Dracolosse")) {
            System.out.println("Accès autorisé. Vous pouvez utiliser l'application.");
        } else {
            System.out.println("Accès refusé. Au revoir!");
            sc.close();
            return;
        }

        String codeAcces = "0000";
        int tentativesRestantes = 3;

        while (tentativesRestantes > 0) {
            System.out.print("Veuillez saisir le code d'accès : ");
            String saisieUtilisateur = sc.nextLine();

            if (saisieUtilisateur.equals(codeAcces)) {
                System.out.println("Accès autorisé ! Bienvenue dans l'application.");
                break;
            } else {
                tentativesRestantes--;
                if (tentativesRestantes > 0) {
                    System.out.println("Code incorrect. Il vous reste " + tentativesRestantes + " tentative(s).");
                } else {
                    System.out.println("Nombre maximum de tentatives atteint. Accès refusé.");
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
    }
}
 

    

