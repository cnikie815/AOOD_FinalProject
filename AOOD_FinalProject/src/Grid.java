import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid{
	JPanel p = new JPanel();
	JLabel[][] images;
	GridLayout layout = new GridLayout();
	public Grid(){
		images = new JLabel[8][8];
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
				} else {
					
				}
			}
		}
	}
	public JPanel getPanel(){
		return p;
	}
}
