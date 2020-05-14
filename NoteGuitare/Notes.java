
/**
 * Class qui sert a trouver sans calcules la position qu'une note
 * en question se trouvera sur la manche
 *
 * @author (Samuel Odabachian)
 * @version (2/7/2020)
 */
public class Notes{
  
     
   /***********************
    *  CONSTENTES DES NOTES
    ***********************/
   
    public static final int DO = 1;
    public static final int DO_DIESE = 2;
    public static final int RE = 3;
    public static final int RE_DIESE = 4;
    public static final int MI =5 ;
    public static final int FA = 6;
    public static final int FA_DIESE = 7;
    public static final int SOL = 8;
    public static final int SOL_DIESE = 9;
    public static final int LA = 10;
    public static final int LA_DIESE= 11;
    public static final int SI= 12;
    
 
    
    
    // Position des note sur manche en memoire tableau [12][6]

    
    public static int repertoirePosition[][]= {      
        {8,  1,  5,  10,  3,  8}, // DO
        {9,  2,  6, 11,  4,  9},//DO_DIESE
        {10,  3,  7,  0,  5, 10},//RE
        {11,  4,  8,  1,  6, 11},//RE_DIESE
        {0,  5,  9,  2,  7,  0},//MI
        {1,  6, 10,  3,  8,  1},//FA
        {2,  7, 11,  4,  9,  2},//FA_DIESE
        {3,  8,  0,  5, 10,  3},//SOL
        {4,  9,  1,  6, 11,  4},//SOL_DIESE
        {5, 10,  2,  7,  0,  5},//LA
        {6, 11,  3,  8,  1,  6},//LA_DIESE
        {7,  0,  4,  9,  2,  7},//SI

    };
    
    
    
    
}
