import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PieceImage extends JPanel {
	private JLabel image;
	private Piece myPiece;
	private int pieceX, pieceY;
	public PieceImage(int x, int y) {
		image = new JLabel();
		this.setLayout(null);
		this.add(image);
		image.setBounds(0, 0, 95, 95);
		pieceX = x;
		pieceY = y;
	}

	public void setIcon(ImageIcon icon) {
		image.setIcon(icon);
	}

	public String toString() {
		return "PieceImage at " + pieceX + ", " + pieceY;
	}

	public boolean canMoveToSpace(int x, int y, int myX, int myY, PieceImage images[][]) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == j % 2) {
				} else {
					if (images[i][j] != null && (int)(images[i][j].getPieceX()) == x && (int)(images[i][j].getPieceY()) == y) {
						return false;
					} 
				}
			}
		}
		if(myPiece.isKing()){
			if(Math.abs(x-myX) != 1 ||  Math.abs(y-myY) != 1){
				return false;
			}
		}
		else{
			if(myPiece.getColor() == 1){
				if(Math.abs(x-myX) != 1 ||  y-myY != 1){

					return false;
				}
			}
			else{
				if(Math.abs(x-myX) != 1 ||  y-myY != -1){

					return false;
				}
			}
		}
		
		
		return true;
	}
	


	public void setPiece(Piece p) {
		myPiece = p;
	}

	public int getPieceX() {
		return pieceX;
	}

	public void setPieceX(int pieceX) {
		this.pieceX = pieceX;
	}

	public int getPieceY() {
		return pieceY;
	}

	public void setPieceY(int pieceY) {
		this.pieceY = pieceY;
	}
}
