package fr.nathan;

import java.util.Scanner;

public class textetrous {

    public static void main(String[] args){

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre premiere valeurs :");
        int nom1 = clavier.nextInt();

        System.out.println("Entrez votre deuxième valeurs :");
        int nom2 = clavier.nextInt();

        System.out.println("Entrez votre nombre:");
        int nombre = clavier.nextInt();

        System.out.println("Entrez votre adjectif :");
        int adjectif = clavier.nextInt();

        System.out.println("Il était une fois un" + nom1 );
        System.out.println("qui vait" + nombre );
        System.out.println( nom2 );
        System.out.println("Cela le rendait très" + adjectif);


    }
}
