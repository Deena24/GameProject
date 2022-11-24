
package event;

import Charactor.*;

public class Event {
    public static boolean checkHit(RedHood redhood,Wave wave,int redhoodSize,int waveHeight){
	if(redhood.x+redhoodSize>wave.x&&redhood.x<wave.x) {
            if(redhood.y+redhoodSize>=wave.y-waveHeight) {
		return true;
            }
	}
	return false;
    }
}