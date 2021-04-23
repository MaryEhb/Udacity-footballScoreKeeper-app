package android.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int scoreTeamA = 0;
    int foulTeamA = 0;

    public void displayForTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneTeamA(View view) {
        scoreTeamA++;
        displayForTeamAScore(scoreTeamA);
    }

    public void addFoulTeamA(View view) {
        foulTeamA++;
        displayForTeamAFoul(foulTeamA);
    }

    int scoreTeamB = 0;
    int foulTeamB = 0;

    public void displayForTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneTeamB(View view) {
        scoreTeamB++;
        displayForTeamBScore(scoreTeamB);
    }

    public void addFoulTeamB(View view) {
        foulTeamB++;
        displayForTeamBFoul(foulTeamB);
    }


    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamAScore(scoreTeamA);
        displayForTeamBScore(scoreTeamB);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBFoul(foulTeamB);
    }
}