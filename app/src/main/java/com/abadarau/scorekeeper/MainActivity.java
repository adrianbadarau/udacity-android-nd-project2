package com.abadarau.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer team1Goals = 0;
    private Integer team2Goals = 0;
    private Integer team1Fouls = 0;
    private Integer team2Fouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button team1GoalBtn = findViewById(R.id.team1Goal_BTN);
        team1GoalBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1Goals++;
                updateText(team1Goals, R.id.team1Goals_TV);
            }
        });

        final Button team2GoalBtn = findViewById(R.id.team2Goal_BTN);
        team2GoalBtn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                team2Goals++;
                updateText(team2Goals, R.id.team2Goals_TV);
            }
        });

        Button team1FaulBtn = findViewById(R.id.team1Foul_BTN);
        team1FaulBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team1Fouls++;
                updateText(team1Fouls, R.id.team1Fouls_TV);
            }
        });
        Button team2FaulBtn = findViewById(R.id.team2Foul_BTN);
        team2FaulBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team2Fouls++;
                updateText(team2Fouls, R.id.team2Fouls_TV);
            }
        });
        Button resetBtn = findViewById(R.id.reset_BT);
        resetBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team1Goals = 0;
                team2Goals = 0;
                team1Fouls = 0;
                team2Fouls = 0;
                updateText(team1Goals, R.id.team1Goals_TV);
                updateText(team2Goals, R.id.team2Goals_TV);
                updateText(team1Fouls, R.id.team1Fouls_TV);
                updateText(team2Fouls, R.id.team2Fouls_TV);
            }
        });
    }

    private void updateText(Integer score, int id){
        TextView item = findViewById(id);
        item.setText(score.toString());
    }


}
