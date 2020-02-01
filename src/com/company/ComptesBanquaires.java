package com.company;

public class ComptesBanquaires {

        private int variableInstanceSoldeCompte;
        private int variableInstanceNumeroDeCompte;

        public ComptesBanquaires(){
            int variableConstructeurDefautNumeroDeCompte;
            int variableConstructeurDefautSoldeCompte;
        }

        public ComptesBanquaires(int variableConstructeurNumeroDeCompte,int variableConstructeurSoldeDuCompte){
            this.variableInstanceNumeroDeCompte=variableConstructeurNumeroDeCompte;
            this.variableInstanceSoldeCompte=variableConstructeurSoldeDuCompte;
        }

         public void setNumero(int nouveauNumeroDeCompteSetNumero){
            this.variableInstanceNumeroDeCompte=nouveauNumeroDeCompteSetNumero;
        }

         public void setSolde(int nouveauSoldeDuCompteSetSolde){
            this.variableInstanceSoldeCompte=nouveauSoldeDuCompteSetSolde;
        }

         public int getNumeroDeCompte(){
            return this.variableInstanceNumeroDeCompte;
        }

         public int getSolde(){
            return this.variableInstanceSoldeCompte;
        }



        void deposer(int montant) {
            this.variableInstanceSoldeCompte = this.variableInstanceSoldeCompte + montant;
        }

        void retirer(int montant) {
            this.variableInstanceSoldeCompte = this.variableInstanceSoldeCompte - montant;
        }

        void virerVers(int montant, ComptesBanquaires destination) {
            this.retirer(montant);
            destination.deposer(montant);
        }
        void afficher(){
            System.out.println("solde: "+ variableInstanceSoldeCompte);
        }

        public String toString(){
            return "Compte numéro "+ this.variableInstanceNumeroDeCompte + " solde du compte "+this.variableInstanceSoldeCompte;
        }

}
