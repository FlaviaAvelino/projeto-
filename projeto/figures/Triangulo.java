
package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Triangulo  extends Figure{
	 int x, y;
	 int w, h;
	 Polygon p ;
	 Color a;
	 Color b;
       public int[] x1, x2;

	public Triangulo (int x, int y, int w, int h,Color Contorno, Color Fundo){
        super(x, y,w,h,Contorno,Fundo);	
     
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.Contorno = Contorno;
		this.Fundo = Fundo;
		int x1[]= {this.x,((this.w)/2) + (this.x),(this.w) + (this.x)};
		int x2[]={this.y, (this.y) - (this.h),this.y};
	 	this.p=new Polygon(x1, x2, 3);

    }
	

	public void colorFig(Color Fundo){
			this.Fundo = Fundo;
			
			
		}
	public void paint (Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		/*int[] x1= {this.x,((this.w)/2) + (this.x),(this.w) + (this.x)};
		int[] x2={this.y, (this.y) - (this.h),this.y};
		*/
       
        g2d.setColor(this.Contorno);
        g2d.draw(this.p);
        g2d.setColor(this.Fundo);
        g2d.fillPolygon(this.p);
    }
	
	public boolean contains(MouseEvent evt) {
        if (this.p.contains(evt.getPoint()))
            return true;
        return false;
    }
	
	
	
	  public void drag(int x,int y, Point pos){
        this.x += x;
        this.y += y;
		int[] x1= {this.x,((this.w)/2) + (this.x),(this.w) + (this.x)};
		int[] x2={this.y, (this.y) - (this.h),this.y};
      
        this.p = new Polygon(x1, x2, 3);
    }
}