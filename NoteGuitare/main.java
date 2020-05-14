
/**
 * Ce programme sert a donner a l'utilisateur les position d'un note ou gamme
 * (mineur ou majeur) de choix sur un manche a guitar de 24 frette. On affiche
 * les choix de menue et les resultats des operations ici.
 * 
 *
 * @author (Samuel odabachian)
 * @version (2/7/2020)
 */

public class main{
    
    
    /************
     * CONSTANTES
     ***********/
     public static final int NBR_CORDE = 6;
     public static final int NBR_FRETTE_ET_CORDE_VIDE = 25;
     public static final int OPTION_PREMIERE_MENU_COURANT = 1;
     public static final int OPTION_DEUXIEME_MENU_COURANT = 2;

     public static final int OPTION_QUITTEZ = 3 ;
     public static final int OPTION_QUITTEZ_MENU_2 = 13;
     
     public static final String SAUT_LIGNE = "\n\n";
     public static final String MSG_FIN = "Merci et à la prochaine";
     public static final String MSG_SOL_CHOIX = "Entrez votre choix svp : ";

  
     
     
    public static void main (String[] args){
        
        // initialisation des choix a null
        int choixMenuPricipal = 0; //
        int choixNote = 0;
        int choixGamme = 0 ;
        int choixTonique = 0;
        
        int retourPosition = 0; // utiliser pour enregistrer la valeur 
                                // retourner par un fonction
       
        
        do{
            /* Creation et initialisation des position de notes
            * sur la manche de guitar a false, se tableau s'efface en 
            * debut de chaque boucle
            */
            boolean positionManche[][]= 
            new boolean[NBR_CORDE][NBR_FRETTE_ET_CORDE_VIDE];
            
            //Affiche le menue principale
            UtilitaireAffichageMenu.menuPrincipal();          
            choixMenuPricipal = UtilitaireValidation.lireInt(MSG_SOL_CHOIX,
                                OPTION_PREMIERE_MENU_COURANT,OPTION_QUITTEZ);
        
          
            // Si utilisateur choisi une note                 
            if(choixMenuPricipal == OPTION_PREMIERE_MENU_COURANT){  
                
                UtilitaireAffichageMenu.menuNote();
                choixNote = UtilitaireValidation.lireInt(MSG_SOL_CHOIX,
                     OPTION_PREMIERE_MENU_COURANT,OPTION_QUITTEZ_MENU_2); 
                
                
                //si l'utilisateur ne veut pas quitter
                if (choixNote < OPTION_QUITTEZ_MENU_2){ 
                    for(int i = 0;i<NBR_CORDE; i++){
                        
                        //done la position du fret
                        retourPosition = Manche.trouveurPositionNote(
                        Notes.repertoirePosition,i,choixNote); 
                        
                        //enregistrer le tab boolean avec la position du note
                        Manche.placerNoteSurManche(positionManche,
                                                 i,retourPosition); 
                    }
                        // affiche la manche et la note  
                        UtilitaireAffichageMenu.affichageManche(positionManche); 
                    
                    UtilitaireValidation.pause();
                }
            
                
            // Si utilisateur veut voir une Gamme
            }
            else if (choixMenuPricipal == OPTION_DEUXIEME_MENU_COURANT){ 
                
                UtilitaireAffichageMenu.menuGamme();
                choixGamme = UtilitaireValidation.lireInt(MSG_SOL_CHOIX,
                            OPTION_PREMIERE_MENU_COURANT,OPTION_QUITTEZ);
                
                // Choix majeur ou mineur            
                if(choixGamme < OPTION_QUITTEZ){
                    UtilitaireAffichageMenu.menuNote();
                    choixTonique = UtilitaireValidation.lireInt(MSG_SOL_CHOIX,
                    OPTION_PREMIERE_MENU_COURANT,OPTION_QUITTEZ_MENU_2);
                }
                
                // Choix tonique de la gamme
                if(choixTonique > 0 && choixTonique < OPTION_QUITTEZ_MENU_2){
                    Gamme.placerGammeSurManche(positionManche,choixGamme,
                    choixTonique,Notes.repertoirePosition);
         
                    UtilitaireAffichageMenu.affichageManche(
                    positionManche);
                    UtilitaireValidation.pause();
                }
            }   
        
        }while(choixMenuPricipal != OPTION_QUITTEZ);
            
        // Utilisateur veut quittez
        System.out.println(SAUT_LIGNE + MSG_FIN);
    
        
    
    
   }
}




