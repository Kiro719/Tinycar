 import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i= 10;
        while (i<=10) {
        System.out.println(i);
        i++;

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

        if (code.equals("Dracolosse")) // Mot de passe à trouver 
        {
            System.out.println("Accès autorisé. Vous pouvez utiliser l'application."); //si le mot de passe est correct
        } else {
            System.out.println("Accès refusé. Au revoir!"); // si le mot de passe est incorrect
            sc.close();
            return;
        }
        System.out.println("Veuillez choisir une option:");
        System.out.println("1- Sans carte");//Le client ne bénéficie pas de réduction
        System.out.println("2- Avec carte gold"); // Le client béneficie de 15% de réduction 
        System.out.println("3- Avec carte platinium");// Le client béneficie de 20 % de réduction et 30% de réduction si le véhicule est électrique
        int choice = sc.nextInt();
        double discount = 0;

        if (choice == 3) {
            System.out.println("La voiture est électrique? (Oui/Non)");//Le client choisi si son véhicule est éléctrique pour béneficier de la réduction
            String isElectric = sc.next();
            if (isElectric.equalsIgnoreCase("oui")) {
                discount = 0.3;
            } else {
                discount = 0.2;
            }
        } else if (choice == 2) {
            discount = 0.15;
        }
        System.out.println("La réduction applicable est de " + (discount * 100) + "%.");
       
         double num,den;
         System.out.println("entrez le numerateur");
          num=sc.nextDouble ();
          do{
            System.out.println("entrez le denominateur");
            den=sc.nextDouble();
        }while(den==0);
        System.out.println(num+"/"+ den+" = "+num/den);
    }

    }
}
    
    
    



