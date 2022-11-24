
package Element;

import java.awt.Color;
import javax.swing.JButton;

public class EleButton extends JButton{
    public EleButton(String title,int size,int x,int y,int width,int height) {
        super(title);
	this.setBackground(Color.BLACK);
	this.setForeground(Color.WHITE);
	this.setFont(Element.getFont(size));
	this.setBounds(x, y, width, height);
    }	
}
