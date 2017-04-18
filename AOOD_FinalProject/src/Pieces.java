
public class Pieces {
	int t;
	boolean k;
	public Pieces(int team, boolean king){
		//team 0 = red, 1 = black
		//king true = king, false = pawn
		t = team;
		k = king;
	}
	
	public void canMoveBackward(Pieces p){
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
