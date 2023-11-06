package awele;

public class test {

	public static void main(String[] args) {
		

		
		
		  Joueur j1 = new Joueur("toto"); 
		  Joueur j2 = new Joueur("marc");
		  //System.out.println(j1.getNom() + "  " + j2.getNom());
		  j1.CreerPseudo("totor");
		  j2.CreerPseudo("marco");
		  //System.out.println(j1.getPseudo() + "  " + j2.getPseudo());	
		  Serveur S1 = new Serveur(); 
		  //System.out.println(j1.getId());
		  //System.out.println("état du serveur : " + S1.getNbrJoueurco() + " joueurs connectés ,serveur : " + S1.etatServeur); 
		  
		  j1.seConnecte(S1);
		  System.out.println("nbr de joueur : " + S1.getNbrJoueurco() + " etat du serveur : " + S1.etatServeur + " id du joueur : " + j1.getId());
		  j2.seConnecte(S1); 
		  //System.out.println("nbr de joueur : " + S1.getNbrJoueurco() + " etat du serveur : " + S1.etatServeur + " id du joueur : " + j2.getId()); j1.creerPartie(S1);
		  
		  System.out.println("nbr de joueur : " + S1.getNbrJoueurco() + " etat du serveur : " + S1.etatServeur + " id du joueur : " + j1.getId());
		  j1.creerPartie(S1);
		  j2.rejoindPartie(S1);
		  
		  System.out.println("nbr de joueur : " + S1.getNbrJoueurco() +
		  " etat du serveur : " + S1.etatServeur + " id du joueur : "+ j2.getPseudo() +
		  j2.getId());
		 

		  

		  


	} 

}
