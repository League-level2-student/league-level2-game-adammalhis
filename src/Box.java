import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Box {
	Color currentColor;
	int x;
	int y;
	int width;
	int height;
	Color color;
	Color color2;
	Font font1;
	
	Box(int x, int y) {
		this.x= x;
		this.y= y;
		width= 100;
		height=100;
		color= Color.GRAY;
		color2= Color.BLACK;
		currentColor= color;
		font1= new Font("ariel", Font.BOLD, 32);
	}
	void draw(Graphics g) {
		g.setColor(currentColor);
		g.fillRect(x, y, width, height);
		g.setColor(Color.white);
		if (currentColor == ObjectManager.YELLOWCOLOR) {
			g.setColor(color2);
			g.setFont(font1);
		g.drawString("2", x+40, y+60);
		}
		g.drawRect(x, y, width, height);
	
		
		
	}
	public void setCurrentColor(Color color) {
		this.currentColor= color;
	}
	
}
