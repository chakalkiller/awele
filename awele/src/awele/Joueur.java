package awele;

public class Joueur {
	private String nom;	
	private String pseudo;
	private Ligne ligne;
	private int id; 
	private int score; 
		
		
	public Joueur(String sonNom) {
		this.nom = sonNom;
		id = 10 ;
	}
	
	
	//---------------------get set	-----------------
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;		
	}
	public String getPseudo() {
		return this.pseudo;
	}
	public Ligne getLigne() {
		return ligne;
	}
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int monScore) {
		if(monScore>48) {
			System.out.println("invalid score");
			return;
		}
		else {
		this.score = monScore;
		}
	}
	
	//----------------------methode--------------------------
	
	public void CreerPseudo(String sonPseudo) {
    	this.pseudo = sonPseudo; 
    }
	public void seConnecte(Serveur S ) {
    	System.out.println("un joueur tente une connection");
    	 	S.accepteConexion(S);
    }
	
    public void  creerPartie(Serveur S) {
    	System.out.println("le jouer cree partie");
    	this.id = Serveur.initPartie(S);
    }
	
    public void rejoindPartie(Serveur S) {
    	System.out.println(" le deuxième joueur rejoind la partie");
    	this.id = Serveur.initJeu(S);
    	//return Etat.Une_partie_rejoind;
    	
    }
    /*
   // public void creerJoueurX() {
		System.out.println("crée joueur 1 si nbrJ=0 ou joueur 2 si nbrJ=1");
		JoueurEnJeu j = new JoueurEnJeu(getPseudo()) ;
	}
 public void ajoutePtAuScore(int nbr) {
	        this.score += nbr;
	    }



    public void choisir() {
        do {
        } while (!aJouer);
        aJouer = false;
        
    }
    //Joue le coup d'un joueur.
   public boolean joue(int trouChoisi) {
       if (trouChoisi < 0 || trouChoisi > 5) {
           System.out.println("\tLe trou que vous avez choisi n'existe pas." +
                   "\n\tChoisissez-en un qui est entre 1 et 6.");
           return false;
       }

       Plateau plateau = jeu.getPlateau();

       if (!plateau.estJouable(trouChoisi, ligne)) {
           //System.out.println(colorize("\tVous ne pouvez pas jouer ce trou." +
           //        "\n\tChoisissez-en un autre.", Attribute.RED_TEXT()));
           return false;
       }

       // On met à jour le plateau
       int dernierTrou = updateBoard(trouChoisi, plateau);
       // Et on capture les graines
       saisirTrou(plateau, dernierTrou);

       return true;
   }
	 */
    
}
