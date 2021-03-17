/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Commerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExemplaireDepasseException {
        // TODO code application logic here
        /*String[] tableau = new String[]{"Paul","Marc"};
    ArrayList tab;
    tab= new ArrayList(Arrays.asList(tableau));
    tab.add("Jonhy");
    tab.remove(0);
    for(int i=0;i<tab.size();i++){
        System.out.println(tab.get(i));        
    }*/
        String[] tr=new String[]{"cd1","cd2"};
        Produit first=new Produit("Tomate",300,500);
        first.setNbr(10);
        Produit firste=new Produit("Macaroni",500,800);
        firste.setNbr(20);
        Cd firstes=new Cd("Thon",600,650,"John","Kockou",tr);
        firstes.setNbr(15);
        Produit firsts=new Produit("Vinnaigre",700,1500);
        firsts.setNbr(5);
        
        Produit[] tableau=new Produit[]{
            first,
            firste,
            firstes,
            firsts
        };
        ArrayList table= new ArrayList(Arrays.asList(tableau));
            Magasin Mag=new Magasin(table); 
            Mag.vendreProduit(2, 9);
           // Mag.Bilan();
            Mag.Interaction();
    }
    
}
