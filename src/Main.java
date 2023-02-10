import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();


        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        System.out.println("Bonjour, quel est votre prénom ? ");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour," + prenom);*/
        //somme();
       // division();
        volume();
    }




    // Attention a bien recopier ‘public static void’
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextInt();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + division);

    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextInt();
        float resultat = longueur * largeur * hauteur;
        System.out.println("Le volume est  " + resultat);

    }


}

