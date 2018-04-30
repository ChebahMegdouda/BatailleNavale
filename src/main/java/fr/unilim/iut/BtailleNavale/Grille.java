
public class Grille {
	private Case[][] cases;
	
	public Grille(){
		this.cases = new Case[10][10];
		for(int i = 0; i<10; i++) {
			for(int j = 0; j < 10; j++) {
				this.cases[i][j].setCoordonnee(i*10+j); 
			}
		}
	}
	
	
}
