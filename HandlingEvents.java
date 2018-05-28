/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_proj_0;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
 
public class HandlingEvents extends Canvas {
 
    int X1 = 40;
    int Y1 = 275;
     int X2 = 60;
    int Y2 = 275;
     int X3 = 80;
    int Y3= 275;
     int X4 = 100;
    int Y4 = 275;
     int X5 = 120;
    int Y5= 275;
     int X6 = 140;
    int Y6= 275;
    int X7 = 150;
    int Y7 = 290;
   
    public HandlingEvents() {
        setSize(new Dimension(500, 500));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                moveIt(evt);
            }
        });
    }
 
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(X1, Y1 , 15, 15);//FIRST BALL
        g.setColor(Color.GREEN);
        g.fillOval(X2, Y2 , 15, 15);
        g.setColor(Color.GREEN);
        g.fillOval(X3, Y3 , 15, 15);
        g.setColor(Color.RED);
        g.fillOval(X4, Y4, 15, 15);
        g.setColor(Color.RED);
        g.fillOval(X5, Y5, 15, 15);
        g.setColor(Color.RED);
        g.fillOval(X6, Y6, 15, 15);
        g.setColor(Color.blue);
        g.fillRect(150, 290, 200, 20);
        g.setColor(Color.black);
        g.fillRect(X7, Y7, 35, 15);

//SECOND BALL
    }
 
    public void moveIt(KeyEvent evt) {
    
            
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_0:
                
                        X4+=310;
                        X5+=310;
                        X7+=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_1:
                
                        X5-=310;
                        X7-=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_2:
                
                        X5+=310;
                        X6+=310;
                        X7+=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_3:
                
                        X4-=310;
                        X7-=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_4:
                
                        X1+=310;
                        X2+=310;
                        X7+=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_5:
                
                        X1-=310;
                        X5-=310;
                        X7-=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_6:
                
                        X1+=310;
                        X3+=310;
                        X7+=165;
         
                break;
            }
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_7:
                
                        
                        X6-=310;
                        X7-=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_8:
                
                        X5+=310;
                        X6+=310;
                        X7+=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_9:
                
                        X5-=310;
                        X7-=165;
         
                break;}
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_9:
                
                        X5+=310;
                        X4+=310;
                        X7+=165;
         
                break;}
           // switch (evt.getKeyCode()) {
             //   case KeyEvent.VK_ENTER:
               
                  //     JFrame jframe = null;
                //       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
                //break;}
            
    
        
 
    
   
        repaint();
    }}