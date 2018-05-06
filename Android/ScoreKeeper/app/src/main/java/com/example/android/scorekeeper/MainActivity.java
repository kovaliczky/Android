package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;

    int lastPoint = 0;
    boolean playerA = false;
    boolean playerB = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void addOneforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 1;
    }

    public void addTwoforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 2;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 2;
    }

    public void addThreeforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 3;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 3;
    }

    public void addFourforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 4;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 4;
    }

    public void addFiveforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 5;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 5;
    }

    public void addSixforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 6;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 6;
    }

    public void addSevenforPlayerA(View view) {
        scorePlayerA = scorePlayerA + 7;
        displayForPlayerA(scorePlayerA);
        playerA = true;
        playerB = false;
        lastPoint = 7;
    }

    public void addOneforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 1;
    }

    public void addTwoforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 2;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 2;
    }

    public void addThreeforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 3;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 3;
    }

    public void addFourforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 4;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 4;
    }

    public void addFiveforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 5;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 5;
    }

    public void addSixforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 6;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 6;
    }

    public void addSevenforPlayerB(View view) {
        scorePlayerB = scorePlayerB + 7;
        displayForPlayerB(scorePlayerB);
        playerA = false;
        playerB = true;
        lastPoint = 7;
    }

    public void resetScore(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void undo(View view) {
        if (playerA) {
            scorePlayerA = scorePlayerA - lastPoint;
            displayForPlayerA(scorePlayerA);
        }
        else if(playerB) {
            scorePlayerB = scorePlayerB - lastPoint;
            displayForPlayerB(scorePlayerB);
        }
        lastPoint = 0;
        playerA = false;
        playerB = false;
    }

    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}