
package Charactor;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Wave {
    public int speed;
    public int x;
    public int y;
    Timer timeMove;
    public Wave(int x,int y,int speed,JPanel page) {
        this.x = x;
	this.y = y;
	this.speed = speed;
	this.move(page);
    }
		
    public void move(JPanel page) {
	this.timeMove = new Timer(50,new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(x<=0) {
                x = (int)(1000+(150+Math.random()*1000));
            }
            x -= speed;
            page.repaint();
        }
    });
    this.timeMove.start();
}
		
    public BufferedImage getImage() {
	BufferedImage image = null;
            try {
                    image = ImageIO.read(new File("img\\fox.png"));
                    return image;
                } catch (Exception e) {
			
		}
		return image;
    }
}
