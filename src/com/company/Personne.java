package com.company;

//JE DOIS ENCORE TRAVAILLER CE POINT...

public class Personne {
    //creation des variables d'instances: definition des carc des objets(nom,prenom,age)
    // et mise de cote de la memoire allouée (String, String et int)
    private String nomPersonne;
    private String prenomPersonne;
    private int agePersonne;

    //creation du constructeur par defaut: aucune valeur en parametres
    //attention le nom des champs doit etre celui des variables d'instances ;!
    public Personne(){
        nomPersonne="";
        prenomPersonne="";
        agePersonne=0;
    }

    //constructeur avec parametres.Celui qui permet d'avoir des objets
    //il a paramNom/Prenom/Age en parametres
    public Personne(String paramNomDeLaPersonne,String paramPrenomDeLaPersonne,int paramAgeDeLaPersonne){
        //on indique la valeur que prendront les champs de Personne: param...
        nomPersonne = paramNomDeLaPersonne;
        prenomPersonne = paramPrenomDeLaPersonne;
        agePersonne = paramAgeDeLaPersonne;
    }
    //comme les variables d'instance sont en private il est necessaire de permettre leur acces via les accesseurs.
    //si on veut lire les fichiers il faut get* pour chaque variable D'INSTANCE
    //il s'agit de methodes public qui retournent une valeur: on utilise return qui est liée a la variable d'instance associée

    public String getNomDeLaPersonne(){
        return nomPersonne;
    }
    public String getPrenomDeLaPersonne(){
        return prenomPersonne;
    }
    public int getAgeDeLaPersonne(){
        return agePersonne;
    }

    //comme les variables d'instance sont private on ne peux pas modifier leurs valeurs
    //il faut utiliser une methode qui le permet avec set.
    public void setNomDeLaPersonne(String paramNomDeLaPersonne){  //Comme on ecrit une valeur pas de retrun. C'est un void
        //le parametre donne est le meme que celui donne en parametre a l'objet personne
        nomPersonne = paramNomDeLaPersonne; //on "rappelle" que le parametre de l'objet personne est lié a la classe Personne
    }
    public void setPrenomDeLaPersonne(String paramPrenomDeLaPersonne){
        prenomPersonne = paramPrenomDeLaPersonne;
    }
    public void setAgeDeLaPersonne(int paramAgeDeLaPersonne){
        agePersonne = paramAgeDeLaPersonne;
    }

}


