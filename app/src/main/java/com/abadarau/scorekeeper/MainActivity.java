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

        final Button team1GoalBtn = findViewById(R.id.btn_team1_goal);
        team1GoalBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1Goals++;
                updateText(team1Goals, R.id.tv_team1_goals);
            }
        });

        final Button team2GoalBtn = findViewById(R.id.btn_team2_goal);
        team2GoalBtn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                team2Goals++;
                updateText(team2Goals, R.id.tv_team2_goals);
            }
        });

        Button team1FaulBtn = findViewById(R.id.btn_team1_foul);
        team1FaulBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team1Fouls++;
                updateText(team1Fouls, R.id.tv_team1_fouls);
            }
        });
        Button team2FaulBtn = findViewById(R.id.btn_team2_foul);
        team2FaulBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team2Fouls++;
                updateText(team2Fouls, R.id.tv_team2_fouls);
            }
        });
        Button resetBtn = findViewById(R.id.btn_reset);
        resetBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                team1Goals = 0;
                team2Goals = 0;
                team1Fouls = 0;
                team2Fouls = 0;
                updateText(team1Goals, R.id.tv_team1_goals);
                updateText(team2Goals, R.id.tv_team2_goals);
                updateText(team1Fouls, R.id.tv_team1_fouls);
                updateText(team2Fouls, R.id.tv_team2_fouls);
            }
        });
    }

    private void updateText(Integer score, int id){
        TextView item = findViewById(id);
        item.setText(score.toString());
    }


}
