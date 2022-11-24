
package Element;

import java.awt.Font;
import java.io.File;

public class Element {
    public static Font getFont(int size){
	Font font = null;
            try {
		font = Font.createFont(Font.TRUETYPE_FONT,new File("font\\COOPBL.ttf"));
		return font.deriveFont((float)size);
            } catch (Exception e) {

            }
		return font;
	}
}