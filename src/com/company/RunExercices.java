package com.company;

import java.util.Scanner;

public class RunExercices {
    public void ReDoExercice(){}
    public static void RunMenu() {
        int exerciceChoice;
        System.out.println("Souhaitez vous faire les exercices d'algorythmes ? Tappez 1.");
        System.out.println("Souhaitez vous faire l'exercice de POO Présentez-vous ? Tappez 2.");
        System.out.println("Souhaitez vous faire l'exercice sur les comptes banquaires ? Tappez 3");
        System.out.println("Souhaitez vous faire l'exercice des comptes banquaires avec le tableau ? Tappez 4");
        Scanner keyboard = new Scanner(System.in);
        exerciceChoice = keyboard.nextInt();
        switch (exerciceChoice) {
            //switch pour le cas ou d'autres exercices viendraient a se greffer ici
            case 1:
                MethodesExercices methodesExercices = new MethodesExercices();
                methodesExercices.makeAChoice();
                break;
            case 2:
                ExerciceDePOO exerciceDePresentation = new ExerciceDePOO();
                exerciceDePresentation.presentezVous();
                break;
            case 3:
                ExerciceDePOO exerciceDeBanque = new ExerciceDePOO();
                exerciceDeBanque.exerciceComptesBanquaires();
                break;
            default:
                ExerciceDePOO exerciceDePOO=new ExerciceDePOO();
                exerciceDePOO.exerciceTableauPooComptesBancaires();
                break;
        }
    }
        public void ReturnBaseMenu(){
            System.out.println("Souhaitez-vous retourner au menu des exercices ? oui/non ");
            Scanner keyboard = new Scanner(System.in);
            String newExercice = keyboard.nextLine();
            switch (newExercice) {
                case "O":
                case "o":
                case "oui":
                case "Oui":
                case "OUI":
                    this.RunMenu();
            }
        }

}
