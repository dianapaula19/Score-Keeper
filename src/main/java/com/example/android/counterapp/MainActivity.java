package com.example.android.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreForSlytherin = 0;
    int scoreForGryffindor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void add10ForGryffindor(View view) {
        scoreForGryffindor = scoreForGryffindor + 10;
        displayForGryffindor(scoreForGryffindor);

    }

    public void add150forGryffindor(View view) {
        scoreForGryffindor = scoreForGryffindor + 150;
        displayForGryffindor(scoreForGryffindor);
        if (scoreForSlytherin < scoreForGryffindor) {
            displayTheWinner("The winner team is Gryffindor");
        } else if (scoreForSlytherin > scoreForGryffindor) {
            displayTheWinner("The winner team is Slytherin");

        } else if (scoreForGryffindor == scoreForSlytherin) {
            displayTheWinner("It's a tie");
        }


    }

    public void add10ForSlytherin(View view) {
        scoreForSlytherin = scoreForSlytherin + 10;
        displayForSlytherin(scoreForSlytherin);

    }

    public void add150forSlyhterin(View view) {
        scoreForSlytherin = scoreForSlytherin + 150;
        displayForSlytherin(scoreForSlytherin);
        if (scoreForSlytherin < scoreForGryffindor) {
            displayTheWinner("The winner team is Gryffindor");
        } else if (scoreForSlytherin > scoreForGryffindor) {
            displayTheWinner("The winner team is Slytherin");

        } else if (scoreForGryffindor == scoreForSlytherin) {
            displayTheWinner("It's a tie");
        }



    }

    public void reset(View view) {
        scoreForGryffindor = 0;
        scoreForSlytherin = 0;
        displayForGryffindor(scoreForGryffindor);
        displayForSlytherin(scoreForSlytherin);
        displayTheWinner("");
    }

    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor);
        scoreView.setText(String.valueOf(score));


    }

    public void displayForSlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.slytherin);
        scoreView.setText(String.valueOf(score));


    }

    public void displayTheWinner(String team) {
        TextView winnerView = (TextView) findViewById(R.id.winner);
        winnerView.setText(team);


    }

}


