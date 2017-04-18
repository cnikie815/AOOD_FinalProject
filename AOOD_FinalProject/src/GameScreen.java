import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen {
	public static void main(String[] args){
		play("Checkers");
	}
	
	public static void play(String s){
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setSize(100, 100);
		p.setVisible(true);
		f.setVisible(true);
		f.add(p);
		
	}
}
