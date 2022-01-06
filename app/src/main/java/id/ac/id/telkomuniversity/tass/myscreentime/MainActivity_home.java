package id.ac.id.telkomuniversity.tass.myscreentime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_home extends AppCompatActivity {

    Button screentime, reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        screentime = findViewById(R.id.screen_time);
        reminder = findViewById(R.id.reminder);

        reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity_home.this, MainActivity.class);
                startActivity(i);
            }
        });

        screentime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity_home.this, ScreenActivity.class);
                startActivity(k);
            }
        });

    }
}