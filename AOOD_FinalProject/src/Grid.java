import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

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
		p.setBackground(Color.BLACK);
	}
	
	public void createGrid(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if (i % 2 == j % 2){
					images[i][j] = new JLabel();
					images[i][j].setBackground(new Color(209, 49, 43));
					images[i][j].setOpaque(true);
					images[i][j].setBounds(i * 95, j * 95, 95, 95);
					p.add(images[i][j]);
					if (j < 3){
						//images[i][j];
						black[i][j] = new Piece(1, false);
					} else if (j > 4){
						//images[i][j];
						red[i][j] = new Piece(0, false);
					}
				} else {
					
				}
			}
		}
	}
	public JPanel getPanel(){
		return p;
	}
}
