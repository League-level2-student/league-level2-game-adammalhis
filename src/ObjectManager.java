import java.awt.Color;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class ObjectManager implements KeyListener {
	Box[] b= new Box[16];
	Random bob= new Random();
	public static final Color YELLOWCOLOR= new Color(238,228,218);
	int yellow1;
	int yellow2;
	ObjectManager() {
		yellow1= bob.nextInt(b.length);
		yellow2= bob.nextInt(b.length);
		for (int j=0; j<b.length; j++) {
			Box amazon = new Box((j%4)*100+200, (j/4)*100+200);
			if (j==yellow1 || j==yellow2) {
				amazon.currentColor= YELLOWCOLOR;
				
			}
			b[j]= amazon;
		}
		
	}
	void draw(Graphics g) {
		for (int i = 0; i < b.length; i++) {
			b[i].draw(g);
			
			
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
