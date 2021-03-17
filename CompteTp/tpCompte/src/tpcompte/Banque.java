/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcompte;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Banque {
    private Client[] MesClients;
    private int nbClients;
    
    public void ajouterClient(String nomDuClient){
        int val=this.nbClients;
        MesClients[val]=new Client(nomDuClient);
    }
    
    public void bilanClient(int numeroDuClient){
        for(int i=0;i<MesClients[numeroDuClient].getNbComptes();i++){
            int numero=i;
            System.out.println("Compte"+numero+"  Montant:"+MesClients[numeroDuClient].getCompte()[i].getSolde());
        }
    }
    
    public void afficherBilan(){
        for(int i=0;i<MesClients.length;i++){
            bilanClient(i);
        }
    }
    
    public void Interaction(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Quelle operation effectuer ?");
            System.out.println("1) Ajouter un client");
            System.out.println("2) Effectuer une operation sur le client");
            System.out.println("3) Afficher un bilan general");
            int cas = 0;
            switch(cas){
                
                case 1:
                    String nom;
                    System.out.println("Entrer son nom ");
                    nom=sc.nextLine();
                    this.ajouterClient(nom);
                    System.out.println("Le Client "+nom+" a été crée");
                    break;
                case 2: 
                    System.out.println("1) Afficher le Bilan");
                    System.out.println("2) Faire un retrait");
                    System.out.println("3) Faire un depot"); 
                    System.out.println("4) Faire un virement");
                    int souscas=0;
                    switch(souscas){
                        case 1:
                            int num;
                            System.out.println("Entrer le numero du client");
                            num=sc.nextInt();
                            this.bilanClient(num);
                            break;
                        case 2:
                            int nume;
                            System.out.println("Quel est le numero du client ?");
                            nume=sc.nextInt();
                            Compte[] C=this.MesClients[nume].getCompte();
                            System.out.println("Quelle compte effectuer le retrait");
                            int numer=sc.nextInt();
                            System.out.println("Quel est le montant de retrait");
                            float Mont=sc.nextFloat();
                            C[numer].retrait(Mont);
                            break;
                        case 3:
                            int Nume;
                            System.out.println("Quel est le numero du client ?");
                            Nume=sc.nextInt();
                            Compte[] Cpt=this.MesClients[Nume].getCompte();
                            System.out.println("Quelle compte effectuer le retrait");
                            int Numer=sc.nextInt();
                            System.out.println("Quel est le montant de retrait");
                            float MOnt=sc.nextFloat();
                            Cpt[Numer].retrait(MOnt);
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                  break;
                case 3:
                    this.afficherBilan();
                    break;
                default:
                    System.out.println("Bye bye");
                    break;
            }
    }
}
