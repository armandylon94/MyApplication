package user.example.com.myapplication;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import user.example.com.myapplication.RingerHelper;

public class MainActivity extends AppCompatActivity {

    AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize
        audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.content);

        frameLayout.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                RingerHelper.performToggle(audioManager); // helper function
               //updateUI();
            }
        });
    }

    private void updateUI(){
        ImageView imageView = (ImageView)findViewById(R.id.phone_icon);

        int imageSelect = RingerHelper.isPhoneSilent(audioManager)
                ?R.drawable.frontpage
                :R.drawable.gopherbw;

        imageView.setImageResource(R.drawable.gopherbw);
    }

    @Override
    protected void onResume(){
        super.onResume();
        //updateUI();
    }

}
