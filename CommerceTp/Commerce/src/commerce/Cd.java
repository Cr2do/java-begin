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
public class Cd extends Produit{
    private  String Auteur;
    private String Interprete;
    private String[] Titres=new String[]{};
    
    public Cd(String nom, float pa,float pv,String Auteur,String Interprete,String[] Titles){
        super(nom,pa,pv);
        this.Auteur=Auteur;
        this.Interprete=Interprete;
        this.Titres=Titles;
    }
    
    public void setAut(String Author){
        this.Auteur=Author;
    }
    public void setInterprete(String Interp){
        this.Interprete=Interp;
    }
    public void setTitres(String[] titres){
        this.Titres=titres;
    }
    public String getAut(){
        return this.Auteur;
    }
    public String getInterp(){
        return this.Interprete;
    }
    public String[] getT(){
        return this.Titres;
    }
    
    public void Afficher(){
       super.Afficher();
       System.out.println("De plus son auteur est "+this.Auteur+" et editeur se nomme:"+this.Interprete);
       for(int i=0;i<Titres.length;i++){
           System.out.print(Titres[i]+" ");
       }
    }
}
