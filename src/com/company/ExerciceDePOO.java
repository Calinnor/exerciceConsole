package com.company;

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

    public void presentezVous() {
        System.out.println("Combien d'amis vont être inscrit ?");
        Scanner keyboard = new Scanner(System.in);
        int nombreDAmisAEntrer = keyboard.nextInt();

        String[] tableauDesAmisEntres = new String[nombreDAmisAEntrer];
        //au debut la declaration du tableau a ete realisee dans la boucle for a la fin, ce qui a provoqué une erreur de dependance...
        // deplacement de la declaration avant la condition if afin que la lecture des données du tableau soient accessibles apres la boucle for.

        int nombreDAmisEntres = 0;
        int ami = 1;
        if (nombreDAmisAEntrer > 0) {
            for (; nombreDAmisAEntrer > nombreDAmisEntres; nombreDAmisEntres++, ami++) {

                Personne personne = new Personne();
                keyboard = new Scanner(System.in);

                System.out.println("Entrez votre nom de famille.");
                personne.setNomDeLaPersonne(keyboard.nextLine().toUpperCase());
                //methode setNom... de la classe personne pour ecrire le nom avec en parametres (valeur a ecrire) l'entree clavier

                System.out.println("Entrez votre prénom.");
                personne.setPrenomDeLaPersonne(keyboard.nextLine());

                System.out.println("Entrez votre age.");
                personne.setAgeDeLaPersonne(keyboard.nextInt());

                String informationsSurLesAmis = ("Nom de Famille: " + personne.getNomDeLaPersonne() + ", Prénom: " + personne.getPrenomDeLaPersonne() + ", Age: " + personne.getAgeDeLaPersonne());
                //je dois arriver a faire en sorte que personne devienne une variable avec un nom propre contenant les donness personne...afin de differencier les differentes entrees.
                //mais je ne trouve pas comment faire :(

                int entreesDuTableau = ami - 1;
                tableauDesAmisEntres[entreesDuTableau] = informationsSurLesAmis;
            }
            /*boucle for utilisée en tout premier pour la lecture du tableau. Remplacée par une boucle foreach
             for(int i = 0; i < tableauDesAmisEntres.length; i++)
                 //j'utilise length car a l'origine la taille du tableau n'est pas fixe.
                 // Il n'est donc pas possible de mettre une valeur numerique deriere le i<.
                 {
                     int numeroDAmi=i+1;
                     System.out.println("Ami " + numeroDAmi +" = " + tableauDesAmisEntres[i]);//je dois encore modifier le i pour qu'il affiche le bon numero...fait: ajout d'une variable numeroDAmi
                 }*/

            System.out.println("Execution de la lexture des données du tableau via for each tentative");//yes j'ai compris :)
            for (String valeurDuTableau : tableauDesAmisEntres)
            //creation de la variable valeurdutableau qui va recevoir chacune des valeur du tableau tableaudesamis jusq'a la fin puis les afficher.
            {
                System.out.println(valeurDuTableau);
            }

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

        System.out.println("Etat actuel des comptes: Compte " + compte1.getNumeroDeCompte()+ " solde: " + compte1.getSolde() + " Euros. Compte " + compte2.getNumeroDeCompte() + " solde: " + compte2.getSolde());

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
}






