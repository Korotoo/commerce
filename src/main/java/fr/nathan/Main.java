package fr.nathan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int prime = 250;
        int salaire = 400;
        int out;
        int aot = 10;
    
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le nombre de vente :");
        int salairehoraire = clavier.nextInt();
        clavier.close();

       if (salairehoraire < 10){
        aot = aot - salairehoraire;
        System.out.println("Il manque " + aot );
        System.out.println ("Votre salaire sera de : " + salaire );
       }
       if (salairehoraire >= 10){
        out = prime + salaire;
        System.out.println("Bravo vous avez réussi a vendre : "+ salairehoraire);
        System.out.println ("Votre salaire sera de : " + out);
       }

    }
}