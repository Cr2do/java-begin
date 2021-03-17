/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Magasin {
    private float solde;
    private Produit[] tableau=new Produit[]{};
    private ArrayList tab= new ArrayList(Arrays.asList(tableau));
    
    public Magasin(ArrayList tabl){
        this.tab=tabl;
        this.solde=0;
    }
    
    public void ajouterProduit(String nom,float prixA, float prixV){
        Produit premier=new Produit(nom,prixA,prixV);
        tab.add(premier);        
    }
    public void ajouterLivre(String nLivre,float pALivre,float pVLivre,String Author, String Editor){
        Livre fLivre=new Livre(nLivre,pALivre,pVLivre,Author,Editor);
        tab.add(fLivre);
    }
    public void ajouterCd(String nLivre,float pALivre,float pVLivre,String Author, String Interp, String[] MTitres){
        Cd fCd=new Cd(nLivre,pALivre,pVLivre,Author,Interp,MTitres);
        tab.add(fCd);
    }
    
    public void acheterProduit(int refPro,int nbrExemp){
        Produit prod= (Produit) tab.get(refPro);
        int valeur=prod.getNbr();       
        valeur+=nbrExemp;        
        prod.setNbr(valeur);                
        prod.NbreAchter=nbrExemp;
    }
    
    public void vendreProduit(int refPro,int nbrExemp) throws ExemplaireDepasseException{
        Produit prod= (Produit) tab.get(refPro);
        int valeur=prod.getNbr();
         if(nbrExemp<=prod.getNbr()){
            throw new ExemplaireDepasseException();
        }
        valeur-=nbrExemp;
        prod.setNbr(valeur);     
        prod.NbreVendu=nbrExemp;
    }
    
    public void Bilan(){
        float LeSolde=0;
    System.out.println("  Produit   |   Prix d'Achat   |   Prix deVente   |   NbreDisponible   |   NbreVendu   |   NbreAcheté   |   PrixVendus   |   PrixAchetés  |  NbreDispoRestant");
    for(int k=0;k<tab.size();k++){
        Produit prod= (Produit) tab.get(k);
        System.out.println(" "+prod.getNom()+" | "+prod.getPA()+"  |  "+prod.getPV()+"  |  "+prod.getNbr()+"  |  "+prod.NbreVendu+"  |  "+prod.NbreAchter+"  |  "+prod.NbreVendu*prod.getPV()+"  |  "+prod.NbreAchter*prod.getPA()+"  |  "+(prod.getNbr()-prod.NbreVendu));
        prod.Afficher();
        LeSolde+=(prod.NbreVendu*prod.getPV());
    }
    System.out.println("----------------------------------------------Sole: "+LeSolde);
    }
    
    public float getSolde(){
        return this.solde;
    }
    public void setSolde(float val){
        this.solde=val;
    }
    
    public void Interaction(){
        Produit[] tableau=new Produit[]{};
        /*ArrayList table= new ArrayList(Arrays.asList(tableau));
        Magasin Maga=new Magasin(table);*/
        String name,nom,author,editor,interprete,titre;
        String[] Morceaux=new String[]{};
        int nombre,cas,Ntitre;
        float PA,PV;
        Scanner scan=new Scanner(System.in);
        System.out.println("Nous allons vous creer votre magasin");        
        System.out.println("Combien de produit voulez vous qu'il ait d'abord ?");
        nombre=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<nombre;i++){
            int val=i+1;
            System.out.println("Enter le nom du "+val+" produit");
            nom=scan.nextLine();
            //scan.next();
            System.out.println("Enter son prix d'achat");
            PA=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son prix de vente");
            PV=scan.nextFloat();
            scan.nextLine();
            this.ajouterProduit(nom,PA,PV);
        }
        System.out.println("Que voulez vous faire maiintenant ?"); 
        System.out.println("1- Ajouter un livre"); 
        System.out.println("2- Ajouter un Cd"); 
        System.out.println("3- Ajouter un produit standard");
        System.out.println("4- Acheter un produit"); 
        System.out.println("5- Bilan du magasin"); 
        cas=scan.nextInt();
        scan.nextLine();
        switch(cas){
            case 1:
            System.out.println("Enter le nom du livre");
            nom=scan.nextLine();
            //scan.nextLine();
            System.out.println("Enter son prix d'achat");
            PA=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son prix de vente");
            PV=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son auteur:");
            author=scan.nextLine();
            scan.nextLine();
            System.out.println("Enter son editeur");
            editor=scan.nextLine();
            scan.nextLine();
            this.ajouterLivre(nom, PA, PV, author, editor);
            System.out.println("Le Livre a ete ajouté au  magasin");
            break;
            
            case 2:
            System.out.println("Enter le nom du Cd");
            nom=scan.nextLine();
            //scan.nextLine();
            System.out.println("Enter son prix d'achat");
            PA=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son prix de vente");
            PV=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son auteur:");
            author=scan.nextLine();
            scan.nextLine();
            System.out.println("Enter son interprete");
            interprete=scan.nextLine();
            scan.nextLine();
            System.out.println("Ccombien  de titres a ce Cd");//Les tittres du Cd
            Ntitre=scan.nextInt();
            for(int i=0;i<Ntitre;i++){
                System.out.println("Enter titre:");
                titre=scan.nextLine();
                Morceaux[i]=titre;
                scan.next();
            }
            this.ajouterCd(nom, PA, PV, author, interprete, Morceaux);
            System.out.println("Le cd a ete ajouté au  magasin");
            break;
            
            case 3:
            System.out.println("Enter le nom du livre");
            nom=scan.nextLine();
            //scan.nextLine();
            System.out.println("Enter son prix d'achat");
            PA=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter son prix de vente");
            PV=scan.nextFloat();
            scan.nextLine();
            this.ajouterProduit(nom, PA, PV);
            System.out.println("Le prooduit standard a ete ajouté au  magasin");
            break;
            
            case 4:
                //pour acheter produit
                System.out.println("Enter le nom du produit");
                nom=scan.nextLine();
                //scan.next();
                System.out.println("Enter son prix d'achat");
                PA=scan.nextFloat();
                scan.nextLine();
                System.out.println("Enter son prix de vente");
                PV=scan.nextFloat();
                scan.nextLine();
                this.ajouterProduit(nom,PA,PV);
            break;
            
            case 5:
                this.Bilan();
            break;
            
            default:
                System.out.print("Bye bye");
                break;
        }
    }
    
    public Produit rechercherProduit(String nom){
        Produit prod;
        int val=0;
        for(int k=0;k<this.tab.size();k++){
            prod= (Produit) tab.get(k);
            if(prod.getNom().equals(nom)){
                val=k;
            }                        
        }
        prod=(Produit) tab.get(val);
        
        return prod;
    }
}

