import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Piece {
	int t;
	boolean k;
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

	

}
