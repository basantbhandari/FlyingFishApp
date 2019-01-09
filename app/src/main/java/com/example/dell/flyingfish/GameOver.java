package com.example.dell.flyingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private  Button play_again;
    private TextView score_message;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        play_again = findViewById(R.id.btn_play_again);
        score_message = findViewById(R.id.tv_score_message);

        score = getIntent().getExtras().get("score").toString();


        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameOver.this,MainActivity.class);
                startActivity(i);
            }
        });

        score_message.setText("score = " +score);
    }
}
