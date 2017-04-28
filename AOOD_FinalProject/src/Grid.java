import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Grid {
	GridComponent p = new GridComponent();
	JLabel[][] images;
	Piece[][] pieces;
	GridLayout layout = new GridLayout();
	Piece[][] red;
	Piece[][] black;
	private JLabel currentDrag;

	public Grid() {
		images = new JLabel[8][8];
		red = new Piece[8][8];
		black = new Piece[8][8];
		this.createGrid();

	}

	public void createGrid() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == j % 2) {

				} else {
					images[i][j] = new JLabel();
					images[i][j].addMouseListener(new PieceClick(images[i][j]));
					images[i][j].addMouseMotionListener(new PieceDrag());
					images[i][j].setOpaque(false);
					images[i][j].setBounds(i * 95, j * 95, 95, 95);
					p.add(images[i][j]);

					if (j < 3) {
						black[i][j] = new Piece(1, false);
						images[i][j].setIcon(new ImageIcon(this.getClass().getResource("BlackPiece.PNG")));
					} else if (j > 4) {
						red[i][j] = new Piece(0, false);
						images[i][j].setIcon(new ImageIcon(this.getClass().getResource("RedPiece.PNG")));
					}
				}
			}
		}
	}

	public JPanel getPanel() {
		return p;
	}
	
	public void reorderComponents(Component compo){
		Component[] components = p.getComponents();
		int i = 0;
		int index = -1;
		for(Component c :components){
			if (c == compo){
				index = i;
			}
			i++;
		}
		if (index != -1){
			p.removeAll();
			Component temp = components[index];
			Component[] newComp = new Component[components.length];
			newComp[0] = temp;
			int tempI = 1;
			for(Component c : components){
				if(c!=temp){
					newComp[tempI] = c;
					tempI++;
				}
			}
			for (Component comp : newComp){
				p.add(comp);
			}
		}
	}
	
	public void dropPiece(JLabel p) {
		int iIndex = -1;
		int jIndex = -1;
		double maxTouch = 0;
		for (int i = 0; i < 0; i++) {
			for (int j = 0; j < 0; j++) {
				if (i % 2 == j % 2) {

				} else {
					Rectangle computedIntersection = SwingUtilities.computeIntersection(i * 95, j * 95, 95, 95,
							p.getBounds());
					double area = computedIntersection.getWidth() * computedIntersection.getHeight();
					if (area > maxTouch) {
						iIndex = i;
						jIndex = j;
						maxTouch = area;
					}
				}
			}
		}
		p.setBounds(iIndex * 95, jIndex * 95, 95, 95);
	}

	private class PieceClick extends MouseAdapter {
		private JLabel p;

		public PieceClick(JLabel p) {
			this.p = p;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			currentDrag = this.p;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			dropPiece(currentDrag);
			currentDrag = null; 
		}
	}

	private class PieceDrag extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (currentDrag != null) {
				int mouseX = currentDrag.getX() + e.getX();
				int mouseY = currentDrag.getY() + e.getY();
				currentDrag.setBounds(mouseX - currentDrag.getWidth() / 2, mouseY - currentDrag.getHeight() / 2,
						currentDrag.getWidth(), currentDrag.getHeight());
			}
		}
	}
}
