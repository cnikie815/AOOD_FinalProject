import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PieceImage extends JPanel {
	private JLabel image;
	public PieceImage(){
		image = new JLabel();
		this.setLayout(null);
		this.add(image);
		image.setBounds(0, 0, 95, 95);

	}
	public void setIcon(ImageIcon icon){
		image.setIcon(icon);
	}
	public String toString(){
		return "PieceImage at " + this.getX()/95 + ", " + this.getY()/95;
	}
}
