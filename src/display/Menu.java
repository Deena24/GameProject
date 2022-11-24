
package display;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Element.EleButton;
import Element.EleLabel;

public class Menu extends JPanel {
    public long point;
    public Menu() {
			
    }
    public Menu(long point, ActionListener main) {
        try {
                this.point = point;
                this.setBackground(Color.WHITE);
                this.setBounds(0,0,1000,600);
                this.setFocusable(true);
                this.setLayout(null);
					
                EleLabel status = new EleLabel("GAME OVER",30,400,100,200,100);
                status.setForeground(Color.BLACK);
					
                EleLabel showPoint = new EleLabel("TOTAL : "+this.point,30,400,200,200,100);
                showPoint.setForeground(Color.BLACK);
										
                EleButton restart = new EleButton("RESTART",15,380,300,200,50);
                restart.addActionListener(main);		
					
                this.add(showPoint);
                this.add(status);
                this.add(restart);
            } catch (Exception e) {		
	}	
    }
}
