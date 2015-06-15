package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* int scoreTeamA = 0;
    int scoreTeamB = 0;


    //score team a
    public void buttonPlus3TeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        setScoreTeamA("" + scoreTeamA);

    }

    public void buttonPlus2TeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        setScoreTeamA("" + scoreTeamA);

    }

    public void buttonPlus1TeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        setScoreTeamA("" + scoreTeamA);
    }


    //score team b
    public void buttonPlus3TeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        setScoreTeamA("" + scoreTeamB);

    }

    public void buttonPlus2TeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        setScoreTeamA("" + scoreTeamB);

    }

    public void buttonPlus1TeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        setScoreTeamA("" + scoreTeamB);

    }

    public void setScoreTeamA(String score) {
        TextView myScore = (TextView) findViewById(R.id.score_team_a);
        myScore.setText(score);
    }


    public void setScoreTeamB(String score) {
        TextView myScore = (TextView) findViewById(R.id.score_team_b);
        myScore.setText(score);
    } */


    int scoreA;
    int scoreB;


    //iam adding this
    class ButtonOp {
        void plusOp(int i, int id) {
            if (id == R.id.team_a) {
                scoreA = scoreA + i;
                setScoreToTeam(id, scoreA);

            }
            if (id == R.id.team_b) {
                scoreB = scoreB + i;
                setScoreToTeam(id, scoreB);
            }

        }

        void resetOp(){
            scoreA = 0;
            scoreB = 0;
            setScoreToTeam(R.id.team_a, scoreA);
            setScoreToTeam(R.id.team_b, scoreB);
        }

    }

    public void setScoreToTeam(int id, int score) {
        TextView myView = (TextView) findViewById(id);
        myView.setText("" + score);
    }

    


    public void Button1(View v) {
        ButtonOp buttonOp1 = new ButtonOp();
        int myViewId = v.getId();
        buttonOp1.plusOp(1, myViewId);
    }

    public void Button2(View v) {
        ButtonOp buttonOp2 = new ButtonOp();
        int myViewId = v.getId();
        buttonOp2.plusOp(2, myViewId);
    }

    public void Button3(View v) {
        ButtonOp buttonOp3 = new ButtonOp();
        int myViewId = v.getId();
        buttonOp3.plusOp(3, myViewId);
    }

    public void resetAll(View v){
        ButtonOp reset = new ButtonOp();
        reset.resetOp();
    }


}
