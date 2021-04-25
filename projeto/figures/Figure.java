package figures;
import java.awt.event.*;
import java.awt.*;
import java.awt.Graphics;

public abstract class Figure {
    public int x, y;
    public int w, h;
	public Color Contorno, Fundo;

	

    public  Figure (int x, int y, int w, int h, Color Contorno, Color Fundo) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
		this.Contorno = Contorno;
		this.Fundo = Fundo;
    }

    public void drag (int dx, int dy, Point p) {
        this.x += dx;
        this.y += dy;
    }

    public abstract void paint (Graphics g);
    public abstract boolean contains(MouseEvent evt);
		public abstract void colorFig(Color b);
			
		

}
