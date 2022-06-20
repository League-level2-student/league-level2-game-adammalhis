import javax.swing.JFrame;

public class AdamsGame {

	public static final int WIDTH = 500;
    public static final int HEIGHT = 800;
    JFrame frame;
    GamePanel panel = new GamePanel();
	public static void main(String[] args) {
		
		new AdamsGame().setup();
		
		
		
	}
	
	AdamsGame() {
		frame = new JFrame();
	}
	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
		
		            
	}

}
