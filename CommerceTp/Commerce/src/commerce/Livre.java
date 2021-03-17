/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;

/**
 *
 * @author USER
 */
public class Livre extends Produit{
    private String Auteur;
    private String Editeur;
    
    public Livre(String nom_Livre,float pA_Livre,float pV_Livre,String Author, String Editor){
        super(nom_Livre,pA_Livre,pV_Livre);
        this.Auteur=Author;
        this.Editeur=Editor;
    }
    public void setAuteur(String Auteur){
        this.Auteur=Auteur;
    }
    public void setEditeur(String Editeur){
        this.Editeur=Editeur;
    }
    public String getAuteur(){
        return this.Auteur;
    }
    public String getEditeur(){
        return this.Editeur;
    }
    
    public void Afficher(){
       super.Afficher();
       System.out.println("De plus son auteur est "+this.Auteur+" et editeur se nomme:"+this.Editeur);
    }
}
