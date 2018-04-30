
public class Case {
	private int coordonnee;
	private boolean touche;
	private boolean bateau;
	
	public Case() {
		this.touche = false;
		this.bateau = false;
	}

	public int getCoordonnee() {
		return coordonnee;
	}

	public void setCoordonnee(int coordonnee) {
		this.coordonnee = coordonnee;
	}

	public boolean isTouche() {
		return touche;
	}

	public void setTouche(boolean touche) {
		this.touche = touche;
	}

	public boolean isBateau() {
		return bateau;
	}

	public void setBateau(boolean bateau) {
		this.bateau = bateau;
	}
}
