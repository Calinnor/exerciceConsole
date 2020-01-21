package com.company;

import java.util.Scanner;

public class MethodesExercices {


    public static void selectAnExercice() {
        int limitNumberMenu;

        System.out.println("Menu des exercices.");
        System.out.println();
        System.out.println("Si vous ne souhaitez pas faire d'exercice, tappez 0.");
        for (limitNumberMenu = 1; limitNumberMenu < 11; limitNumberMenu++) {
            System.out.println(limitNumberMenu + ") Choisissez-vous l'exercice " + limitNumberMenu +
                    " ? Tappez " + limitNumberMenu);
        }
    }

    public static void makeAChoice() {
        selectAnExercice();
        Scanner keyboard = new Scanner(System.in);
        int whichSelectedExercice = keyboard.nextInt();
        System.out.println(whichSelectedExercice);
        switch (whichSelectedExercice) {
            case 1:
                exerciceUnViaMethode();
                break;
            case 2:
                exerciceDeuxViaMethode();
                break;
            case 3:
                exerciceTroisViaMethode();
                break;
            case 4:
                exerciceFourViaMethodWithFor();
                break;
            case 5:
                exerciceCinqViaMethode();
                break;
            case 6:
                exerciceSixViaMethode();
                break;
            case 7:
                exerciceSevenViaMethod();
                break;
            case 8:
                exerciceEightViaMethod();
                break;
            case 9:
                exerciceHeightSecondViaMethod();
                break;
            case 10:
                exerciceNineViaMethode();
                break;
            case 0:
                System.out.println("Vous n'avez pas choisi de faire les exercices.");
                break;
            default:System.out.println("Le numéro que vous avez demandé n'existe pas...;)");

        }
        System.out.println("Souhaitez-vous retourner au menu des exercices ? oui/non ");
        keyboard =new Scanner(System.in);
        String newExercice = keyboard.nextLine();
        switch (newExercice){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                makeAChoice();
        }
        System.out.println("Au revoir.");
    }


    public static void exerciceUnViaMethode() {
        System.out.println("Exercice 1 : entrez un chiffre compris entre 1 et 5 jusqu'a ce qu'il convienne.");

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Entrez un chiffre entre un et cinq.");
        int nombreCherche = keyboard.nextInt();

        while (nombreCherche > 5 || nombreCherche < 1) {
            System.out.println("Recommencez !");

            Scanner keybord = new Scanner(System.in);
            System.out.println("Ecriture via methode: Entrez un chiffre entre 1 et 5.");
            nombreCherche = keybord.nextInt();
        }
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceUnViaMethode();
        }
        System.out.println("Au revoir exercice 1.");

    }

    public static void exerciceDeuxViaMethode() {
        System.out.println("Exercice 2: écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne. En cas de réponse supérieure à 20," +
                " on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un chiffre entre dix et vingt.");
        int nombreCherche = keyboard.nextInt();

        while (nombreCherche < 10 || nombreCherche > 20) {
            if (nombreCherche < 10) {
                System.out.println("Trop petit :).");

                Scanner keybord = new Scanner(System.in);
                System.out.println("Entrez un chiffre entre dix et vingt.");
                nombreCherche = keybord.nextInt();
            } else {
                System.out.println("Trop grand :).");

                Scanner keybord = new Scanner(System.in);
                System.out.println("Entrez un chiffre entre dix et vingt.");
                nombreCherche = keybord.nextInt();
            }
        }
        System.out.println("Bravo.J'y suis arrivé");
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceDeuxViaMethode();
        }

        System.out.println("Au revoir exercice 2.");
    }

    public static void exerciceTroisViaMethode() {
        System.out.println("Exercice 3: écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants." +
                " Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.");

        System.out.println("Donnez une valeur de départ.");
        int nombreDeDepart;
        Scanner keyboard=new Scanner(System.in);
        nombreDeDepart=keyboard.nextInt();

        nombreDeDepart++;

        int nombreDeFin = nombreDeDepart + 10;

        while (nombreDeDepart < nombreDeFin) {
            System.out.println(nombreDeDepart);
            nombreDeDepart++;
        }
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceTroisViaMethode();
        }
        System.out.println("Au revoir exercice 3.");
    }

    public static void exerciceFourViaMethodWithFor() {
        System.out.println("Exercice 4: Réécrire l'algorithme précédent, en utilisant cette fois l'instruction Pour");

        System.out.println("Donnez une valeur de départ.");
        Scanner keyboard = new Scanner(System.in);
        int startValue = keyboard.nextInt();

        startValue++;
        int endValue = startValue + 10;

        for (; startValue < endValue; startValue++) {
            System.out.println(startValue);
        }
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceFourViaMethodWithFor();
        }
        System.out.println("Au revoir exercice 4.");
    }


    public static void exerciceCinqViaMethode() {
        System.out.println("Exercice 5\n" +
                "Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de ce nombre, présentée comme suit (cas où\n" +
                "l'utilisateur entre le nombre 7) : Table de 7 : 7x1= 7 ,7 x 2 = 14, 7 x 3 = 21,...7 x 10 = 70");

        System.out.println("Entrez un nombre de départ.");
        Scanner keyboard = new Scanner(System.in);
        int startNumber = keyboard.nextInt();

        int multiple = 1;
        int resultOfTable = 0;  //creation de cette variable apres le deboire de la ligne de commande startNumber=startNumber*multiple

        while (resultOfTable < startNumber * 10) {
            resultOfTable = startNumber * multiple;
            System.out.println(resultOfTable);
            multiple++;
        }
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceCinqViaMethode();
        }

        System.out.println("Au revoir exercice 5.");

    }

    public static void exerciceSixViaMethode() {
        System.out.println("Exercice 6: Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce nombre." +
                " Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15");

        Scanner keyboard = new Scanner(System.in);
        int unitaireValue = 0;
        int incrementation = 0;
        System.out.println("Quelle est le nombre de départ ?");

        int departNumber = keyboard.nextInt();

        while (unitaireValue < departNumber) {
            unitaireValue++;
            incrementation = incrementation + unitaireValue;
        }
        System.out.println(incrementation);
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceSixViaMethode();
        }

        System.out.println("Au revoir exercice 6.");
    }
    public static void exerciceSevenViaMethod(){//exercice le plus difficile jusqu'a présent. La logique mathematique ne m'est pas apparue rapidement
        System.out.println("Exercice7: ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle." +
                "nb: la factorielle de 8, notée 8 !, vaut 1x2x3x4x5x6x7x8");
        System.out.println("Entrez un chiffre de départ.");
        Scanner keyboard=new Scanner(System.in);
        int factorielle=keyboard.nextInt();
        long x =1;
        long multiplicateur = 1;
        long somme;

        while(multiplicateur<=factorielle){
            somme = x*multiplicateur;
            multiplicateur++;
            x=somme;
        }
        System.out.println(x);

        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceSevenViaMethod();
        }
        System.out.println("Au revoir exercice 7.");
    }
    public static void exerciceEightViaMethod(){
        System.out.println("Exercice 8:ecrire un algorithme qui demande successivement 20 nombres à l 'utilisateur," +
                " et qui lui dise quel était le plus grand parmi ces 20 nombres. Entrez le nombre numéro 1 :..." +
                "Entrez le nombre numéro 2:... Le plus grand nombre est...");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un nombre:");
        int userNumber = keyboard.nextInt();
        System.out.println("Le premier nombre est "+userNumber+". Entrez un nouveau nombre.");

        int highterNumber = userNumber;
        int numberOfNumber;

        for(numberOfNumber=2;numberOfNumber<21;numberOfNumber++) {
            keyboard = new Scanner(System.in);
            userNumber = keyboard.nextInt();
            System.out.println("Le nombre numéro " + numberOfNumber + " est " + userNumber);
            if (userNumber > highterNumber) {
                highterNumber = userNumber;
            }
            if(numberOfNumber<20){
                System.out.println("Entrez un nouveau nombre.");
            }
        }
        System.out.println("Le plus grand nombre entré est le: " + highterNumber);


        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart){
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceEightViaMethod();
        }
        System.out.println("Au revoir exercice 8.");

    }
    public static void exerciceHeightSecondViaMethod() {
        System.out.println("Modifiez ensuite l'algorithme pour que de surcroit le programme affiche à quelle position a ete saisie le nombre." +
                " C'etait la saisie numéro..");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un nombre:");
        int userNumber = keyboard.nextInt();
        System.out.println("Le premier nombre est " + userNumber + ". Entrez un nouveau nombre.");

        int highterNumber = userNumber;
        int numberOfNumber;
        int numberOfEntries=2;
        int entryWithMaxNumber=0;

        for (numberOfNumber = 2; numberOfNumber < 21; numberOfNumber++, numberOfEntries++) {
            keyboard = new Scanner(System.in);
            userNumber = keyboard.nextInt();
            System.out.println("Le nombre numéro " + numberOfNumber + " est " + userNumber);
            if (userNumber > highterNumber) {
                highterNumber = userNumber;
                entryWithMaxNumber=numberOfEntries;
            }
            if (numberOfNumber < 20) {
                System.out.println("Entrez un nouveau nombre.");
            }

            if (numberOfNumber == 20) {
                System.out.println("Le plus grand nombre entré est le: " + highterNumber+". Il a été entré lors de la saisie numéro "+entryWithMaxNumber);
            }
        }
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart) {
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceHeightSecondViaMethod();
        }
        System.out.println("Au revoir exercice 8'.");
    }
    public static void exerciceNineViaMethode(){
        System.out.println(" Réécrire l'algorithme précédant, mais cette fois-ci on ne connait pas d'avance combien l'utilisateur souhaite saisir " +
                "de nombres. La saisie des nombres s'arrete lorsque l'utilisateur saisi un zéro.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un nombre:");
        int userNumber = keyboard.nextInt();
        System.out.println("Le premier nombre est " + userNumber + ". Entrez un nouveau nombre.");

        int highterNumber = userNumber;
        int numberOfNumber;
        int numberOfEntries=2;
        int entryWithMaxNumber=0;

        for (numberOfNumber = 1; ; numberOfNumber++, numberOfEntries++) {
            keyboard = new Scanner(System.in);
            userNumber = keyboard.nextInt();
            if(userNumber==0){
                break;
            }
            System.out.println("Le nombre numéro " + numberOfNumber + " est " + userNumber);
            if (userNumber > highterNumber) {
                highterNumber = userNumber;
                entryWithMaxNumber=numberOfEntries;
            }
            System.out.println("Entrez un nouveau nombre. Entrez 0 pour arreter");
        }
        System.out.println("Le plus grand nombre entré est le: " + highterNumber+"." +
                " Il a été entré lors de la saisie numéro "+entryWithMaxNumber);
        System.out.println("Bravo ! Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart) {
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceNineViaMethode();
        }
        System.out.println("Au revoir exercice 9.");
    }











    /*Exercice 5.10
    Lire la suite des prix en euros entiers terminés par 0 des achats d'un client. Calculer la somme qu'il doit,
    lire la somme qu'il paye et simuler la remise de la monnaie en affichant les textes 10 euros, 5 euros,
     et 1 euro autant de fois qu'il y a de coupures de chaque sorte à rendre.
     */

    /*5.11
    Ecrire un algo permettant de connaitre ses chances de connaitre de gagner au tiercé, quinté et autrees impots volontaires;
    On demande a l'utilisateur le nombre de chevaux partants et le nombre de chevaux joués...(voir mail)
     */
}

