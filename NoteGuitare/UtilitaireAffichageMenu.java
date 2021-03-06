

/**
 * Tous affichage et structure des menus se trouve ici.
 *
 * @author (Samuel Odabachian)
 * @version (2/7/2020)
 */


public class UtilitaireAffichageMenu{
    /***********
     * contantes     
     **********/
     
    public static final int NBR_CORDE = 6;
    public static final String EFFACE_ECRAN ="\f";
    public static final String MSG_SOL_CHOIX = "Entrez votre choix svp : ";
    public static final String QUITTER ="Quitter\n\n";
    
    
    
    
    //efacer la page
    public static void effaceEcran(){
        System.out.print(EFFACE_ECRAN);
    }
    
    
    //afficher les choix du menu Principal
    public static void menuPrincipal(){
       
        System.out.print(EFFACE_ECRAN);
        System.out.println("Menu principal :\n");
        System.out.println(" 1) Afficher une note\n 2) Afficher une gamme");
        System.out.println(" 3) " + QUITTER);
        
        
    }
       //afficher les choix du menu Note
    public static void menuNote(){
        
        System.out.print(EFFACE_ECRAN);
        System.out.println("Menu note :\n");
        System.out.println(" 1)Do\n 2)Do #\n 3)Re\n 4)Re #");
        System.out.println(" 5)Mi\n 6)Fa\n 7)Fa #\n 8)Sol");
        System.out.println (" 9)Sol #\n 10)La\n 11)La  #\n 12)Si");  
        System.out.println(" 13) " + QUITTER);
    }
    
  //afficher les choix du menu Gamme
    public static void menuGamme(){
        
        System.out.print(EFFACE_ECRAN);
        System.out.println("Menu Gamme:\n");
        System.out.println(" 1) Majeur\n 2) Mineur");
        System.out.println(" 3) " + QUITTER);
    }
    
    
    
    /* Afficher la manche complet
     * entre : Tableau des positions enregistrer
     * retour : affiche les positions
     */
    
    public static void affichageManche(boolean tab[][]){
    
        for (int i = 0; i < NBR_CORDE; i++){      
            affichageUneLigne(tab,i); 
        }
    }
    
    
    /* Afficher les position une corde a la fois
     * entre : Tableau des positions enregistrer, la corde  
     * retour : Affiche les positions de note sur une corde
     */
    public static void affichageUneLigne(boolean tab[][],int corde){
    
        if(tab[corde][0]){ //if true
            System.out.print("0");
        }
        else{
            System.out.print(" ");
        }
        System.out.print(corde+1 + "|");
       
      
        for (int i = 1; i <= 24; i++){
            if(tab[corde][i]){  //if true
                System.out.print(" " + (i) + "|");
            }
            else{
               System.out.print("_ _ |");
            }
        
        }
        System.out.println();
    
    
    }
    
    
    /* 
     * 
     */
   
    
    
    

    
}



