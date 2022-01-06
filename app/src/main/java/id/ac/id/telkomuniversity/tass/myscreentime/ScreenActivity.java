package id.ac.id.telkomuniversity.tass.myscreentime;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ScreenActivity extends AppCompatActivity {
    private TextView mHasilST;
    private Button mButtonTrack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);

        mHasilST=findViewById(R.id.textViewHasilST);
        mButtonTrack=findViewById(R.id.button_start_track);



    }
}
