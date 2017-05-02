import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PieceImage extends JPanel {
	private JLabel image;
	private Piece myPiece;

	public PieceImage() {
		image = new JLabel();
		this.setLayout(null);
		this.add(image);
		image.setBounds(0, 0, 95, 95);
	}

	public void setIcon(ImageIcon icon) {
		image.setIcon(icon);
	}

	public String toString() {
		return "PieceImage at " + this.getX() / 95 + ", " + this.getY() / 95;
	}

	public boolean canMoveToSpace(int x, int y, int myX, int myY, PieceImage images[][]) {

			
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == j % 2) {
				} else {
					if (images[i][j] != null && (int)(images[i][j].getX()/95) == x && (int)(images[i][j].getY()/95) == y) {
						return false;
					} 
				}
			}
		}
		return true;
	}

	public void setPiece(Piece p) {
		myPiece = p;
	}
}
