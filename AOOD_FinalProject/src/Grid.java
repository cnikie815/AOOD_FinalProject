import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid{
	JPanel p = new JPanel();
	JLabel[][] images;
	Piece[][] pieces;
	GridLayout layout = new GridLayout();
	Piece[][] red;
	Piece[][] black;
	private JLabel currentDrag;
	public Grid(){
		images = new JLabel[8][8];
		red = new Piece[8][8];
		black = new Piece[8][8];
		this.createGrid();
		p.setLayout(null);
		p.setBackground(new Color(19, 95, 142));
	}
	
	public void createGrid(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if (i % 2 == j % 2){
					
				} else {
					images[i][j] = new JLabel();
					images[i][j].setBackground(new Color(34, 153, 13));
					images[i][j].setOpaque(true);
					images[i][j].setBounds(i * 95, j * 95, 95, 95);
					p.add(images[i][j]);
					if (j < 3){
						black[i][j] = new Piece(1, false);
						images[i][j].setIcon(new ImageIcon(this.getClass().getResource("BlackPiece.PNG")));
					} else if (j > 4){
						red[i][j] = new Piece(0, false);
						images[i][j].setIcon(new ImageIcon(this.getClass().getResource("RedPiece.PNG")));
					}
				}
			}
		}
	}
	public JPanel getPanel(){
		return p;
	}
	public void dropPiece(JLabel p){
		
	}
	private class PieceClick extends MouseAdapter {
		private JLabel p;
		public void pieceClick(JLabel p){
			this.p = p;
		}
		@Override
		public void mousePressed(MouseEvent e){
			currentDrag = this.p;
		}
		@Override
		public void mouseReleased(MouseEvent e){
			dropPiece(currentDrag);
			currentDrag = null;
		}
	}
	private class PieceDrag extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e){
			if(currentDrag != null){
				int mouseX = currentDrag.getX() + e.getX();
				int mouseY = currentDrag.getY() + e.getY();
				currentDrag.setBounds(mouseX - currentDrag.getWidth() / 2, mouseY - currentDrag.getHeight() / 2, currentDrag.getWidth(), currentDrag.getHeight());
			}
		}
	}
}

