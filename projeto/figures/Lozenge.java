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

public class Lozenge extends Figure {

    public Lozenge (int x, int y, int w, int h, Color Contorno, Color Fundo) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.Contorno = Contorno;
        this.Fundo = Fundo;
    }
    
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.Contorno);
        g2d.rotate(Math.toRadians(45), this.x+this.w/2, this.y+this.h/2);
        g2d.drawRect(this.x, this.y, this.w, this.w);
        g2d.setColor(this.Fundo);
        g2d.fillRect(this.x, this.y, this.w, this.w);
        g2d.rotate(Math.toRadians(-45), this.x+this.w/2, this.y+this.h/2);
    }
}
