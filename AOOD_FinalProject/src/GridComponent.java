import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GridComponent extends JPanel {
	public GridComponent(){
		setLayout(null);
	}
	@Override
	public void paintComponent(Graphics g) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == j % 2) {
					g.setColor(new Color(19, 95, 142));
					g.fillRect(i * 95, j * 95, 95, 95);
				} else {
					g.setColor(new Color(34, 153, 13));
					g.fillRect(i * 95, j * 95, 95, 95);
				}
			}
		}
	}
}
