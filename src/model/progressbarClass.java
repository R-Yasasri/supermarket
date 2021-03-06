/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class progressbarClass extends JPanel {

    static int progress = 0;

    public static void update_Progress(int progress1) {
        progress = progress1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2d.rotate(Math.toRadians(270));
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Float(0, 0, 110, 110);
        arc.setFrameFromCenter(new Point(0, 0), new Point(120, 120));
        circle.setFrameFromCenter(new Point(0, 0), new Point(110, 110));
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress * 3.6);
        g2d.setColor(Color.red);
        g2d.draw(arc);
        g2d.fill(arc);
        g2d.setColor(Color.white);
        g2d.draw(circle);
        g2d.fill(circle);
        g2d.setColor(Color.red);
        g2d.rotate(Math.toRadians(90));
        g2d.setFont(new Font("Verdana", Font.PLAIN,50));
        FontMetrics fm = g2d.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(progress+"%", g);
        int x = 0-((int)r.getWidth())/2;
        int y = 0-((int)r.getHeight())/2 + fm.getAscent();
        g2d.drawString(progress+"%", x, y);
    }

}
