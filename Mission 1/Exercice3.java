import java.util.Scanner;

public class Exercice3{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix hors taxes du véhicule  :");
        int prixHT = sc.nextInt();
        
        double tva= 0.2;

        double prixTTC = prixHT*(1+tva);

        System.out.println(prixTTC);
        
    }
}