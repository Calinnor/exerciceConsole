package com.company;

public class ComptesBanquaires {

        int solde;
        int numeroDeCompte;

        public ComptesBanquaires(){
            int numeroDeCompte=0;
            int solde = 0;
        }
        public ComptesBanquaires(int paramNumeroDeCompte,int paramSoldeDuCompte){
            numeroDeCompte=paramNumeroDeCompte;
            solde=paramSoldeDuCompte;
        }

        void deposer(int montant) {
            solde = solde + montant;
        }

        void retirer(int montant) {
            solde = solde - montant;
        }

        void virerVers(int montant, ComptesBanquaires destination) {
            this.retirer(montant);
            destination.deposer(montant);
        }
        void afficher(){
            System.out.println("solde: "+ solde);
        }

}
