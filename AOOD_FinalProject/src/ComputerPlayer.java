/* Notes:
 * The AI could one of two diffitcultlys  
 * One- it favours the players pieces 
 * rather than getting a king
 * Two- it favours the it pieces becoming a king
 * rather than the players pieces
 * Both AIs would take the changes to take a king over anything else
*/
import java.util.*;
public class ComputerPlayer extends Grid {
	int iIndex = -1;
	int jIndex = -1;
	ArrayList<PieceImage> playerpieces;
	ArrayList<PieceImage> compieces;
	ComputerPlayer() {
		
	}
	
	public void refresh() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(images[i][j] != null & images[i][j].getColor() == 0) {
					playerpieces.add(images[i][j]);
				}
			}
		}
	}
	
	
	public void move() {
		pI.setBounds(iIndex * 95, jIndex * 95, 95, 95);
		pI.setPieceX(iIndex);
		pI.setPieceY(jIndex);
	}
	
}