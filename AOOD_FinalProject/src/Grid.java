import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

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
}
