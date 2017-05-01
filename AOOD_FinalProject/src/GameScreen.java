import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen {
	Grid g = new Grid();
	public static void main(String[] args){
		play("Checkers");
	}
	
	public static void play(String s){
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setSize(800, 800);
		p.setVisible(true);
		f.setVisible(true);
		f.add(p);
		
	}
}
