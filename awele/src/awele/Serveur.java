package awele;

public class Serveur {
	private int nbrJoueurCo;
	public int getNbrJoueurco() {
	return nbrJoueurCo;
	}
	public void setNbrJoueurCo(int nbrJoueur) {
		this.nbrJoueurCo = nbrJoueur;
	}
	
	protected Etat etatServeur;
	public Etat getEtatServeur() {
		return etatServeur;
	}
	public void setEtatServeur(Etat etatServeur) {
		this.etatServeur = etatServeur;
	}
	//protected JoueurEnJeu joueurUn;
	//protected JoueurEnJeu joueurDeux;
	
	
	// -------------Constructeurs------------------
	
	  public Serveur() {
		  this.nbrJoueurCo = 0;
		  this.etatServeur = Etat.En_Attente;
	  }
	
	
	
	
	// -------------méthodes------------------
	  
	public int accepteConexion(Serveur S) {
		
		if (nbrJoueurCo == 0 ) {
			System.out.println("premier joueur accepter , joueur 2 en attente");
			
			S.etatServeur = Etat.Un_Joueur_connecté;
			return nbrJoueurCo = 1 ;
						
		}
		
		else
			System.out.println("deuxieme joueur accepter ");
			
			S.etatServeur = Etat.Deux_Joueur_connecté;
			return nbrJoueurCo = 2;
			//int sonId = 1 ;
			//return sonId;		
			
		
	}

	public static int initPartie(Serveur s) {
		if ( s.etatServeur == Etat.Deux_Joueur_connecté) {
			s.etatServeur = Etat.Une_partie_lancé;
			int sonId = 0 ;
			return sonId;
		}
		System.out.println("il faut 2 joueurs connecté");
		return 100 ;
		
	}
	public static int initJeu(Serveur s) {
		if (s.etatServeur == Etat.Une_partie_lancé) {
			s.etatServeur = Etat.Jeu;
			int sonId = 1 ;
			Jeu.demarerJeu();
			return sonId;
		}
		System.out.println("il faut d'abord lancer une partie");
		return 150 ;
		
	}	
}
