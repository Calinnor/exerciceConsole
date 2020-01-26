package com.company;

import java.util.Scanner;

public class ExerciceDePOO {
    /*1. Sachant qu’une personne est définie à partir de son nom, son prénom et son âge,
définissez les données de la classe Personne.*/

    public static class Personne {
        String nom;
        String prenom;
        int age;
    }

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

        String tableauDesAmisEntre[] = new String[nombreDAmisAEntrer];

        int nombreDAmisEntres = 0;
        int ami = 1;
        if (nombreDAmisAEntrer > 0) {
            for (; nombreDAmisAEntrer > nombreDAmisEntres; nombreDAmisEntres++, ami++) {

                Personne personne = new Personne();
                keyboard = new Scanner(System.in);

                System.out.println("Entrez votre nom de famille.");
                personne.nom = keyboard.nextLine().toUpperCase();

                System.out.println("Entrez votre prénom.");
                personne.prenom = keyboard.nextLine();

                System.out.println("Entrez votre age.");
                personne.age = keyboard.nextInt();

                String informationsSurLesAmis = (personne.nom + ", " + personne.prenom + ", " + personne.age);
                int entreeDuTableau = ami - 1;
                tableauDesAmisEntre[entreeDuTableau] = informationsSurLesAmis;
                //System.out.println("Ami " + ami + ": " + tableauDesAmisEntre[entreeDuTableau]);


            }
             for(int i = 0; i < tableauDesAmisEntre.length; i++)//fonction copiée..j'ai honte...
                 {
                     System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauDesAmisEntre[i]);
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

/*Exercice 2: Utilisation d’une classe
Voici le texte d’une classe représentant de façon sommaire un compte bancaire et les
opérations bancaires courantes.

class Compte {
int solde = 0;
void deposer(int montant){
solde = solde + montant;
}
void retirer(int montant){
solde = solde -montant;
}
void virerVers(int montant, Compte destination){

this.retirer(montant);
destination.deposer(montant);
}
void afficher(){
System.println("solde: "+ solde);
}
}

1. Comment fonctionne la méthode virement ? Combien de comptes fait-elle
intervenir ?
2. Créez deux comptes que vous affecterez à deux variables. Ecrivez le code
correspondant aux opérations suivantes :
➢ dépot de 500 euros sur le premier compte.
➢ dépot de 1000 euros sur le second compte.
➢ retrait de 10 euros sur le second compte.
➢ virement de 75 euros du premier compte vers le second.
➢ affichage des soldes des deux comptes.
Vous mettrez le code java correspondant à cette question dans la méthode main
d’une nouvelle classe appelée TesteCompte. Vous compilerez et testerez ce programme.
3. Créez un tableau de dix comptes. Pour cela, notez bien qu’il faut d’abord créer le
tableau puis créer successivement les dix comptes à mettre dans les dix cases de
ce tableau.
Dans chaque case, faites un dépot de 200 euros plus une somme égale à 100 fois
l’indice du compte dans le tableau.
Ensuite, vous ferez un virement de 20 euros de chaque compte vers chacun des
comptes qui le suivent dans le tableau (par exemple, du compte d’indice 5, il faut faire
des virements vers les comptes d’indice 6, 7, 8 et 9).
Enfin, vous afficherez les soldes de tous les comptes. Ici encore, vous testerez et
compilerez le code proposé.*/
    }

