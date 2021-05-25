/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphicbvasic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author MinhTo
 */
public class AxisCoordinates {
    public static void drawAxisCoordinates(Graphics g,int rong,int cao,int spaceX,int spaceY) {
//        		int x = drawPanel.getWidth();
//        		int y = drawPanel.getHeight();
//        		g.setColor(Color.DARK_GRAY);
//        		g.drawLine(x / 2 + move_start.x, move_start.y + 2, x / 2 + move_start.x, y + move_start.y - 1);
//        		g.drawLine(move_start.x + 2, y / 2 + move_start.y, x + move_start.x - 1, y / 2 + move_start.y);
//        		g.setColor(Color.RED);
//        		g.fillOval(x / 2 + move_start.x - 2, y / 2 + move_start.y - 2, 5, 5);
//        
//        		g.drawString("O", centerAxisPoint.x - 15, centerAxisPoint.y + 15);
//        		g.drawString("X", drawPa    nel.getWidth() + move_start.x - 20, centerAxisPoint.y - 7);
//        		g.drawString("Y", centerAxisPoint.x + 5, move_start.y + 20);
                        
                        g.setColor(Color.DARK_GRAY);
                        g.drawLine(0,cao/2 , rong, cao/2);
                        g.drawLine(rong/2, 0, rong/2, cao);
	}
    
        public static void drawAxisCoordinates2(Graphics g,int x,int y,int spaceX,int spaceY) {
//        		int x = drawPanel.getWidth();
//        		int y = drawPanel.getHeight();
//        		g.setColor(Color.DARK_GRAY);
//        		g.drawLine(x / 2 + move_start.x, move_start.y + 2, x / 2 + move_start.x, y + move_start.y - 1);
//        		g.drawLine(move_start.x + 2, y / 2 + move_start.y, x + move_start.x - 1, y / 2 + move_start.y);
//        		g.setColor(Color.RED);
//        		g.fillOval(x / 2 + move_start.x - 2, y / 2 + move_start.y - 2, 5, 5);
//        
//        		g.drawString("O", centerAxisPoint.x - 15, centerAxisPoint.y + 15);
//        		g.drawString("X", drawPa    nel.getWidth() + move_start.x - 20, centerAxisPoint.y - 7);
//        		g.drawString("Y", centerAxisPoint.x + 5, move_start.y + 20);
                        
//                        g.setColor(Color.DARK_GRAY);
//                        g.drawLine(0,cao/2 , rong, cao/2);
//                        g.drawLine(rong/2, 0, rong/2, cao);
	}
        public static Point convertDescart(Point p,double deltaX,double deltaY,int xAxisSize,int yAxisSize){  
                  
                    double x=p.getX();
                   double y=-p.getY();                
                   if(x>=0&&y>=0)
                       {
                            x=x-deltaX;
                            y=y-deltaY;
                       }
                   else if(x>=0&&y<=0)
                       {
                           x=x-deltaX;
                            y=y+deltaY;
                       }
                   else if(x<=0&&y>=0)
                       {
                           x=x+deltaX;
                            y=y-deltaY;
                       }
                   else{
                       x=x+deltaX;
                            y=y+deltaY;
                   }
                
                   Point pointNew=new Point();
                   pointNew.setLocation(x, y);
                   return pointNew;
        }
}
