/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Produit {
   private String nom;
   private float prixAchat;
   private float prixVente;
   private int nbExemplaire;
   private String description;
   
   public int NbreAchter;
    public int NbreVendu;
   public Produit(String nom, float PA, float PV){
       this.nom=nom;
       this.prixAchat=PA;
       this.prixVente=PV;
       this.description="Pas de description";
       this.nbExemplaire=0;
   }  
   
   public String getNom(){
       return this.nom;
   }
   public float getPA() {
       return this.prixAchat;
   }
   
   public float getPV(){
       return this.prixVente;
   }
   
   public String getDesc(){
       return this.description;
   }
   
   public int getNbr(){
       return this.nbExemplaire;
   }
   
   public void setNom(String n){
       this.nom=n;
   }
   public void setPA(float pa){
       this.prixAchat=pa;
   }
   
   public void setPV(float pv){
       this.prixVente=pv;
   }
   
   public void setDesc(String descript){
       this.description=descript;
   }
   
   public void setNbr(int nbr){
       this.nbExemplaire=nbr;
   }
   public void showDesc(){
           System.out.println(this.description);
       }
   public void ObtDesc(){
       Scanner scan= new Scanner(System.in);
       String descrip;
       System.out.println("Entrer la description");
       descrip=scan.nextLine();
       this.description=descrip;
   }
   
   public void AugEx(int valeur){
       this.nbExemplaire+=valeur;
   }
   
   public void DimEx(int valeur){
       this.nbExemplaire-=valeur;
   }
   
   public void Afficher(){
      // System.out.println("Le nom du produit est "+this.nom+" son prit Achat et son prix Vente sont "+this.prixAchat+","+this.prixVente+"Son Nbr d'exempaire dans le magasin est de "+this.nbExemplaire);
      
   }
}
