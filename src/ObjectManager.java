import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class ObjectManager implements KeyListener{
	Box[] b= new Box[16];
	Random bob= new Random();
	
	ObjectManager() {
		for (int j=0; j<b.length; j++) {
			b[j] = new Box((j%4)*100+200, (j/4)*100+200);
			
		}
		
	}
	void draw(Graphics g) {
		for (int i = 0; i < b.length; i++) {
			b[i].draw(g);
			int a= bob.nextInt(15);
			b[a].setColor
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
