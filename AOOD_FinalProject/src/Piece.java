import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Piece {
	int t;
	boolean k;
	ImageIcon image;
	public Piece(int team, boolean king){
		//team 0 = red, 1 = black
		//king true = king, false = pawn
		t = team;
		k = king;
	}
	
	public void canMoveBackward(Piece p){
		if (p.isKing() == true){
			
		} else {
			
		}
	}
	
	public boolean isKing(){
		if (k == true){
			return true;
		}
		return false;
	}
	//checks if its on edge(so it doesn't skip a row)
	public boolean onEdge() {
			return false;
	}
	
	
}
