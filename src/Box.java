import java.awt.Color;
import java.awt.Graphics;

public class Box {
	int x;
	int y;
	int width;
	int height;
	
	Box(int x, int y) {
		this.x= x;
		this.y= y;
		width= 100;
		height=100;
	}
	void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(x, y, width, height);
	}
	
}
