package awele;

public class Jeu {
    protected Plateau plateau;
    protected JoueurEnJeu joueur1;
    protected JoueurEnJeu joueur2;
    protected EtatJeu etatJeu;
    protected JoueurEnJeu gagnant;

    
    
    public static void demarerJeu() {
    	System.out.println("initialize plateau");
    	initPlateau();
    	
    
    }
    public static Plateau initPlateau() {
    	Plateau p = new Plateau();
    	System.out.println();
    	p.ShowMap(p);
    	return p;
    }
    public static void initjoueur() {
    	
    	System.out.println("initialise j1 et j2");
    	
    
    }

}
