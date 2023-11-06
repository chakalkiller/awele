package awele;

import java.util.Arrays;


public class Plateau {
   
	public int[][] tabTrou;
    public int[][] getTab() {
       return tabTrou;
    }   
    private int nbrGraines;
	public int getNbrGraines() {
		return nbrGraines;
	}
	public void setNbrGraines(int nbrGraines) {
		this.nbrGraines = nbrGraines;
	}
   
    public Plateau() {
    	tabTrou = new int[2][6];
    	setNbrGraines(48);
        rempliPlateau();
    }

    //cree plateau
	/*
	 * public Plateau(int[][] Plateau) { this(); for (int i = 0; i < tabTrou.length;
	 * i++) { for (int j = 0; j < tabTrou[0].length; j++) { tabTrou[i][j] =
	 * Plateau[i][j]; } } }
	 */

    // Remplir le plateau de 4 graines par trou
    private void rempliPlateau() {
        Arrays.fill(tabTrou[0], 4);
        Arrays.fill(tabTrou[1], 4);
    }
    
    // selectionne la ligne 0 ou 1 du tab  
    public int[] getLigne(Ligne ligne) {
        if (ligne.equals(Ligne.Ligne0))
            return tabTrou[0];
        return tabTrou[1];
    }
    // donne le nbr de graines sur une ligne donnée
    public int getNbrGrainesParLigne( Ligne ligne){
    	int[] coter = getLigne(ligne);
    	int nbr = 0; 
    	for (int j : coter) {
    		if (j != 0) {
    			nbr += j; 
    			}
    		} return nbr; }

	/*
	 * public boolean estJouable(int trou, Ligne ligne) { if (getLigne(ligne)[trou]
	 * == 0)//le trou choisi est vide return false; if
	 * (GrainesAdversaire(coteAdverse(ligne)) == 0) { // Cas Affamé : return
	 * (getLigne(ligne)[trou] >= (tabTrou[0].length - trou)); } return true; }
	 * 
	 * public Ligne coteAdverse(Ligne ligne) { return ligne.equals(Ligne.Ligne0) ?
	 * Ligne.Ligne1 : Ligne.Ligne0; }
	 * 
	 * //Indique si un côté (/joueur) peut être joué. public boolean peuJouer(Ligne
	 * ligne) { for (int i = 0; i < tabTrou[0].length; i++) { if (estJouable(i,
	 * ligne)) return true; } return false; }
	 * 
	 * //vider le trou public int viderTrou(Ligne ligne, int trou) { int stock =
	 * getLigne(ligne)[trou]; nbrGraines -= stock; getLigne(ligne)[trou] = 0; return
	 * stock; }
	 * 
	 * //Ajoute une graine dans un trou. public void ajouterGraines(Ligne ligne, int
	 * trou) { getLigne(ligne)[trou]++; }
	 * 
	 * //Ramasser les graines dans un trou public int saisirTrou(Ligne ligne, int
	 * trou) { if (getLigne(ligne)[trou] == 2 || getLigne(ligne)[trou] == 3) { if
	 * (trou == 0) { return viderTrou(ligne, trou); } else { return viderTrou(ligne,
	 * trou) + saisirTrou(ligne, trou - 1); } } else { return 0; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * //nombre de graines dans une ligne public int getNbrGrainesParLigne(Ligne
	 * ligne) { int[] coter = getLigne(ligne); int nbr = 0; for (int j : coter) { if
	 * (j != 0) { nbr += j; } } return nbr; }
	 * 
	 * //retire des graines du plateau. public void retireGrainesPlateu(int nbr) {
	 * this.nbrGraines -= nbr; }
	 */
   
   
   
    public void ShowMap(Plateau p)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(p.tabTrou[i][j]+ " || ");
                
            }
            System.out.println();
        }
    }
   
   
   
   
}










