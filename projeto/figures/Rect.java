package figures;

import java.awt.*;
import java.awt.event.*;

import java.awt.Color;

public class Rect extends Figure {
	
	Color Contorno;
	Color Fundo;
	//Color corBorda;
	Rectangle  r;
    public Rect (int x, int y, int w, int h, Color Contorno, Color Fundo) {
		 super(x, y,w,h,Contorno,Fundo);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.Contorno = Contorno;
		this.Fundo = Fundo;
		this.r = new Rectangle(this.x, this.y, this.w, this.h);
    }
	

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.Contorno);
        g2d.draw(this.r);
        g2d.setColor(this.Fundo);
        g2d.fillRect(this.x,this.y, this.w,this.h);
    }
	
	
	 public boolean contains(MouseEvent evt) {
        if (this.r.contains(evt.getPoint()))
            return true;
        return false;
    }
	
		public void colorFig(Color Fundo){
			this.Fundo = Fundo;
			
			
		}
	
	
	public void drag(int x,int y, Point p){
        this.x+=x;
        this.y+=y;
        this.r = new Rectangle(this.x,this.y, this.w,this.h);
    }
}

