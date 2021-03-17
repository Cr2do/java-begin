/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcompte;

/**
 *
 * @author USER
 */
public class Client {
    private String nom;
    private Compte[] comptes;
    private int nbComptes;
    
    public Client(String nom_du_Client){
        this.nom=nom_du_Client;
    }
    public Compte[] getCompte(){
        return this.comptes;
    }
    public String getNom(){
        return this.nom;
    }
    public int getNbComptes(){
        return this.nbComptes;
    }
    public void ajouterCompte(){
        int nb=this.nbComptes;
        comptes[nb]=new Compte();
    }
    public float getSolde(){
        //return this.compteCli.getSolde();
        float Montant=0;
        for(int i=0;i<this.comptes.length;i++){
            Montant+=this.comptes[i].getSolde();
        }
        return Montant;
    }
    
    public void afficherSolde(){
        System.out.println("Solde de :"+this.getSolde());
    }
}
