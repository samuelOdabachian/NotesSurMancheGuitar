
/**
 * Class qui gere les placements des notes d'une gamme 
 * sur la manche.
 *
 * @author (Samuel Odabachian)
 * @version (2/7/2020)
 */
public class Gamme{
   
    
    /************
     * CONSANTES
     ***********/
     
    public static final int TON = 2 ;
    public static final int DEMI_TON = 1;
    public static final int NBR_CORDE = 6;
    public static final int NBR_TON = 7;
    public static final int OCTAVE = 12;
    
    
    // Tableau ([2][NBR_TON] )  du cycle de ton et demi-ton par rapport au gamme
    
    public static int majeurOuMineur[][]= {    
        {TON,TON,DEMI_TON,TON,TON,TON,DEMI_TON}, //majeur
        {TON,DEMI_TON,TON,TON,DEMI_TON,TON,TON} // mineur
    };
    
    
    
    /* Enregistrer les position de chaque note d'une gamme dans le tableau
     * de manche boulean de position note.
     * 
     * entre : tableau position de manche, 
     * choix gamme, choix note, repertoire des position de notes
     * 
     * retour : modification du tableau boolean de position de mache  
     */
    
    
    
    public static void placerGammeSurManche(
    boolean positionManche[][],int gamme,int note, int repertoireNotes[][]){
          
        int positionSurManche = 0;

        
        for(int i = 1; i <= NBR_TON; i++){
            for(int corde = 0; corde < NBR_CORDE; corde++){      
                
                positionSurManche = Manche.trouveurPositionNote(repertoireNotes,
                corde,note);
               
                //mise a jour dans le tableau de manche
                Manche.placerNoteSurManche(positionManche,corde,
                positionSurManche); 
            }
            note +=  Gamme.majeurOuMineur[gamme-1][i-1];
            if( note > OCTAVE ){
            note = note % OCTAVE;
            }
            
        }
        
    }
    

}
