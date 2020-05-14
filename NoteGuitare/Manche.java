
/**
 * Cette classe gere le placement des notes individuelles sur 
 * la manche de guitare.
 * 
 *
 * @author (Samuel Odabachian)
 * @version (2/7/2020)
 */


public class Manche{
    
    
    /*************
     * CONSTENTES
     ************/
    
     public static final int PREMIERE_OCTAVE =12;
     public static final int NBR_FRETTE = 24;
    
    
    /* Trouver la position sens calcule d'une note
     * entre : Tableau repertoire des notes en memoire, numero de la corde,
     * numero de la note actuelle
     * 
     * retour : le numero de la frette sur lequelle le note se trouvera
     */
    public static int trouveurPositionNote(int repertoirePosition[][],
    int corde, int choixNote){
    
        //retourn position note sur une corde
        return repertoirePosition[choixNote-1][corde]; 
        
    
    }
    
    
    /* Mettre les valeur de la tableau boolean de position de note sur la manche
     * a 'true' dependent de la numero de position note recu
     * 
     * entre : Le tableau boolean des positions notes sur manche, numero de 
     * la corde, numero de le frette ou le note se trouvera
     * 
     * retour : Modification du tableau boolean position manche
     */
    
    public static void placerNoteSurManche(boolean tab[][],int corde,
    int positionNote){
    

        
        for( int i = 0; i <= NBR_FRETTE; i++){
            if (i == positionNote ){
                //-1 pour decaler la position car "0" n'est pas un fret
                tab[corde][i] = true;  
                tab[corde][i + PREMIERE_OCTAVE] = true;
               
            } 
            else if (i == positionNote + NBR_FRETTE){
                tab[corde][i] = true;
                    
            }
            
        
        
        } 
        
        
    }
    
    
}
