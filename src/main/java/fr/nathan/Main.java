package fr.nathan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le nombre d'année travaillez :");
        int année = clavier.nextInt();

        System.out.println("Entrez le nombre d'argent par ans :");
        int argent = clavier.nextInt();
        clavier.close();

       if (année >= 2 && argent >= 30000){
        System.out.println("Vous êtes contratable à un prêt");
       }else{
        System.out.println("Vous n'avez pas les conditions pour contractez un prêt");
       }


    }
}