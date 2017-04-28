import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen {
	private static Grid g;
	private static JLabel[][] images;
	public static void main(String[] args){
		play("Checkers");
	}
	
	public static void play(String s){
		g = new Grid();
		JFrame f = new JFrame("Checkers");
		f.setSize(775, 798);
		f.setVisible(true);
		f.add(g.getPanel());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
