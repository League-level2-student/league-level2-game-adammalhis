import java.awt.Color;
import java.awt.Graphics;

public class Box {
	int x;
	int y;
	int width;
	int height;
	Color color;
	
	Box(int x, int y) {
		this.x= x;
		this.y= y;
		width= 100;
		height=100;
		color= Color.GRAY;
	}
	void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor(Color.white);
		g.drawRect(x, y, width, height);
		g.drawString("2", x, y);
		
	}
	
}
