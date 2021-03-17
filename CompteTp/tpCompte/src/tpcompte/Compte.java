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
public class Compte {
    private int numero;
    private float solde;
    
    
    public boolean depot(float valeur){
        if(valeur<0){
            return false;
        }
        else
         this.solde+=valeur;
        return true;
    }
    
    public boolean retrait(float valeur){
        if(valeur>this.solde){
            return false;
        }else
            this.solde-=valeur;
        return true;
    }
    
    public float getSolde(){
        return this.solde;
    }
    
    public void afficherSolde(){
        System.out.println("le solde de ce compte est de: "+this.solde);
    }
    
    public boolean virer(float valeur, Compte destinataire){
        if(valeur>this.solde){
            return false;
        }
        else{
            this.solde-=valeur;
            destinataire.depot(valeur);
        } 
        return true;
    }
}
