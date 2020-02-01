package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciceDePOO {
    /*1. Sachant qu’une personne est définie à partir de son nom, son prénom et son âge,
définissez les données de la classe Personne.*/

/*2. Écrivez une application MesAmis qui utilise un objet untel de type Personne et
qui demande la saisie au clavier de ses nom, prénom et âge.

3. Dans la classe Personne, décrivez la méthode presentezVous(), qui affiche les
caractéristiques de la personne concernée.

4. Modifiez l’application de façon à afficher les caractéristiques de l’objet Untel.

3. Dans la classe Personne, décrivez la méthode presentezVous(), qui affiche les
caractéristiques de la personne concernée.

4. Modifiez l’application de façon à afficher les caractéristiques de l’objet Untel.

5. Dans la classe Personne, décrivez la méthode quelEstVotreNom(), qui permet de
connaître le nom de la personne concernée.
6. Dans la classe Personne, décrivez la méthode quelEstVotreAge(), qui permet de
connaître l’âge de la personne concernée.
7. Modifiez l’application de façon à afficher le nom puis l’âge d’Untel.*/

    public static void presentezVous() {
        System.out.println("Combien d'amis vont être inscrit ?");
        Scanner keyboard = new Scanner(System.in);
        int nombreDAmisAEntrer = keyboard.nextInt();

        String[] tableauDesAmisEntres = new String[nombreDAmisAEntrer];

        int nombreDAmisEntres = 0;
        int ami = 1;
        if (nombreDAmisAEntrer > 0) {
            for (; nombreDAmisAEntrer > nombreDAmisEntres; nombreDAmisEntres++, ami++) {

                Personne personne = new Personne();
                keyboard = new Scanner(System.in);

                System.out.println("Entrez votre nom de famille.");
                personne.setNomDeLaPersonne(keyboard.nextLine().toUpperCase());

                System.out.println("Entrez votre prénom.");
                personne.setPrenomDeLaPersonne(keyboard.nextLine());

                System.out.println("Entrez votre age.");
                personne.setAgeDeLaPersonne(keyboard.nextInt());

                String informationsSurLesAmis = ("Nom de Famille: " + personne.getNomDeLaPersonne() + ", Prénom: " + personne.getPrenomDeLaPersonne() + ", Age: " + personne.getAgeDeLaPersonne());

                int entreesDuTableau = ami - 1;
                tableauDesAmisEntres[entreesDuTableau] = informationsSurLesAmis;
            }

            System.out.println("Execution de la lecture des données du tableau ");
            System.out.println(Arrays.toString(tableauDesAmisEntres));

            System.out.println("Souhaitez vous recommencer l'exercice ? O/N");
            keyboard = new Scanner(System.in);
            String restart = keyboard.nextLine();
            switch (restart) {
                case "O":
                case "o":
                case "oui":
                case "Oui":
                case "OUI":
                    presentezVous();
            }

        } else {
            System.out.println("Vous n'avez pas d'ami a inscrire en ce moment.");
        }
    }

    public void exerciceComptesBanquaires() {
        System.out.println("Entrez un numero pour le compte 1");
        Scanner keyboard = new Scanner(System.in);
        int numeroDeCompte = keyboard.nextInt();
        System.out.println("Entrez le solde du compte.");
        int soldeDuCompte = keyboard.nextInt();
        ComptesBanquaires compte1 = new ComptesBanquaires(numeroDeCompte, soldeDuCompte);

        System.out.println("Entrez un numero pour le compte ");
        keyboard = new Scanner(System.in);
        numeroDeCompte = keyboard.nextInt();
        System.out.println("Entrez le solde du compte.");
        soldeDuCompte = keyboard.nextInt();
        ComptesBanquaires compte2 = new ComptesBanquaires(numeroDeCompte, soldeDuCompte);

        System.out.println("Etat actuel des comptes: Compte " + compte1.getNumeroDeCompte() + " solde: " + compte1.getSolde() + " Euros. Compte " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());

        System.out.println("Entrez un montant a ajouter sur le premier compte");
        keyboard = new Scanner(System.in);
        int montant = keyboard.nextInt();
        //System.out.println("Depot de 500 Euros sur le compte 1");
        compte1.deposer(montant);
        System.out.println("Compte " + compte1.getNumeroDeCompte() + " solde: " + compte1.getSolde());

        System.out.println("Entrez un montant à déposer sur le second compte");
        montant = keyboard.nextInt();
        compte2.deposer(montant);
        System.out.println("Compte " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());
        System.out.println();

        System.out.println("Retrait automatique de  10 Euros sur le second compte");
        compte2.retirer(10);
        System.out.println("Compte " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());
        System.out.println();

        System.out.println("Effectuez un retrait sur le second compte");
        montant = keyboard.nextInt();
        compte2.retirer(montant);
        System.out.println("Compte " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());

        System.out.println("Virement automatique de 75 Euros du premier compte vers le second");
        System.out.println();
        compte1.virerVers(75, compte2);

        System.out.println("Compte 1: numero de compte: " + compte1.getNumeroDeCompte() + " solde: " + compte1.getSolde());
        System.out.println("Compte 2: numero de compte: " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());
        System.out.println();

        System.out.println("Souhaitez vous recommencer l'exercice ? O/N");
        keyboard = new Scanner(System.in);
        String restart = keyboard.nextLine();
        switch (restart) {
            case "O":
            case "o":
            case "oui":
            case "Oui":
            case "OUI":
                exerciceComptesBanquaires();
        }
    }


    public void exerciceTableauPooComptesBancaires() {
        Scanner keyboard = new Scanner(System.in);

        ComptesBanquaires[] tableauExerciceBanquaire;
        int i;
        int numero;
        int solde;
        System.out.println("Entrez le nmobre de comptes à répertorier");
        int nombreDeComptes=keyboard.nextInt();
        tableauExerciceBanquaire = new ComptesBanquaires[nombreDeComptes];

        for (i = 0; i < tableauExerciceBanquaire.length; i++) {

            System.out.println("Entrez le numero du compte "+(i+1));
            numero = keyboard.nextInt();

            System.out.println("Entrez le solde du compte auquel y sera ajouté 200 + l'indexe du tableaux100"+(i+1));
            solde = (keyboard.nextInt()+(i*100+200));

            tableauExerciceBanquaire[i] = new ComptesBanquaires(numero, solde);
        }
        for(i=0;i<tableauExerciceBanquaire.length;i++){
            System.out.println(tableauExerciceBanquaire[i]);
        }

        }
    }




















            //dans chaque case il doit y avoir un compte banquaire.
            //Faire une boucle for qui donne a chaque case un compte de 1 a 10
            // et qui verse 200 dans chacun.
            //y ajouter, lors de la boucle 100x l'indice en valeur: indice 0 : 200+0*100...indice 9:200+9*100
            //faire ensuite une autre boucle for pour virement de 20 sur chacun des comptes +1.
            //afficher les valeurs du tableau

            //En gros l'idee c'est ca:
            //for(i=0,i<10,i++ca c'est le remplissage du tableau indice 0 a 9){compte banquaire numero i+1, solde 200+indice i*100}

            //plus compliqué cette boucle qui vient...pour compte dans case a partir de 0 [x] -20 et case [x+1] +20 jusqu'a indice 9












