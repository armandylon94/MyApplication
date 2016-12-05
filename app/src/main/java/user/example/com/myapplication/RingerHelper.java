package user.example.com.myapplication;

import android.media.AudioManager;

/**
 * Created by user on 4/12/2016.
 */

public class RingerHelper {

    private void RingerHelper(){};

    public  static void  performToggle(AudioManager audioManager){
        audioManager.setRingerMode(isPhoneSilent(audioManager)
                ?AudioManager.RINGER_MODE_NORMAL
                :AudioManager.RINGER_MODE_SILENT);
    }

    public  static  boolean isPhoneSilent(AudioManager audioManager){
        return audioManager.getRingerMode()== AudioManager.RINGER_MODE_SILENT;
    }

}
