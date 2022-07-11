import javax.swing.JFrame;

public class AdamsGame {

	public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    JFrame frame;
    GamePanel panel; 
	public static void main(String[] args) {
		new AdamsGame().setup();
		
		
		
	}
	
	AdamsGame() {
		frame = new JFrame();
		panel= new GamePanel(frame);
		frame.add(panel);
		
	}
	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
		
		            
	}

}
