import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Font titleFont= new Font("Arial", Font.PLAIN, 48);
    Font enterFont= new Font("Arial", Font.PLAIN, 24);
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState= MENU;
    
    GamePanel() {
    	repaint();
    	
    }
    
    
	void drawMenuState(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, AdamsGame.WIDTH, AdamsGame.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("NUMBER WARS", 315, 250);
		g.setFont(enterFont);
		g.drawString("Press ENTER to start", 365, 500);
		g.drawString("Press SPACE for instructions", 330, 750);
		
	}
private void drawGameState(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, AdamsGame.WIDTH, AdamsGame.HEIGHT);
		
		
	}
private void drawEndState(Graphics g) {
		
		
	}
	

	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}
		else if(currentState == GAME){
		    drawGameState(g);
		}
		else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		currentState = GAME;
		}
		}
		
		else {
			currentState++;
		}
		
		
		}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}      