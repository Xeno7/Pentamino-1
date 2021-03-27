import java.util.ArrayList;
import java.util.List;

public class U extends Piece{
	
	ArrayList liste;
	String lettre;
	
	public U(int x, int y, String l) {
		super(x, y);
		
	}
	
	private ArrayList<Carre> creerForme(String l) {
		ArrayList<Carre> res = new ArrayList<Carre>();
		Carre base = new Carre(x, y);
		res.add(base);
		
		return res;
	}
}
