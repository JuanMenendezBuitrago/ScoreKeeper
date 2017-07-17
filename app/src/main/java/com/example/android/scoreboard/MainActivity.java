package com.example.android.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int home_goals_counter = 0;
    private int away_goals_counter = 0;
    private int home_fouls_counter = 0;
    private int away_fouls_counter = 0;
    private int home_red_cards_counter = 0;
    private int away_red_cards_counter = 0;
    private int home_yellow_cards_counter = 0;
    private int away_yellow_cards_counter = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ///
    /// home team goals
    ///

    private void updateHomeTeamGoals() {
        TextView view = (TextView) findViewById(R.id.home_team_score);
        int amount = home_goals_counter;
        display(view, amount);
    }

    public void increaseHomeTeamGoals(View view) {
        home_goals_counter += 1;
        updateHomeTeamGoals();
    }

    public void decreaseHomeTeamGoals(View view) {
        home_goals_counter -= 1;
        if(home_goals_counter < 0)
            home_goals_counter = 0;

        updateHomeTeamGoals();
    }

    ///
    /// away team goals
    ///

    private void updateAwayTeamGoals() {
        TextView view = (TextView) findViewById(R.id.away_team_score);
        int amount = away_goals_counter;
        display(view, amount);
    }

    public void increaseAwayTeamGoals(View view) {
        away_goals_counter += 1;
        updateAwayTeamGoals();
    }

    public void decreaseAwayTeamGoals(View view) {
        away_goals_counter -= 1;
        if(away_goals_counter < 0)
            away_goals_counter = 0;

        updateAwayTeamGoals();
    }

    ///
    /// home team fouls
    ///

    private void updateHomeTeamFouls() {
        TextView view = (TextView) findViewById(R.id.home_team_fouls_counter);
        int amount = home_fouls_counter;
        display(view, amount);
    }

    public void increaseHomeTeamFouls(View view) {
        home_fouls_counter += 1;
        updateHomeTeamFouls();
    }

    public void decreaseHomeTeamFouls(View view) {
        home_fouls_counter -= 1;
        if(home_fouls_counter < 0)
            home_fouls_counter = 0;

        updateHomeTeamFouls();
    }

    ///
    /// away team fouls
    ///

    private void updateAwayTeamFouls() {
        TextView view = (TextView) findViewById(R.id.away_team_fouls_counter);
        int amount = away_fouls_counter;
        display(view, amount);
    }

    public void decreaseAwayTeamFouls(View view) {
        away_fouls_counter += 1;
        updateAwayTeamFouls();
    }

    public void increaseAwayTeamFouls(View view) {
        away_fouls_counter -= 1;
        if(away_fouls_counter < 0)
            away_fouls_counter = 0;

        updateAwayTeamFouls();
    }

    ///
    /// away home team yellow cards
    ///

    private void updateHomeTeamYellowCards() {
        TextView view = (TextView) findViewById(R.id.home_team_yellow_cards_counter);
        int amount = home_yellow_cards_counter;
        display(view, amount);
    }

    public void increaseHomeTeamYellowCards(View view) {
        home_yellow_cards_counter += 1;
        updateHomeTeamYellowCards();
    }

    public void decreaseHomeTeamYellowCards(View view) {
        home_yellow_cards_counter -= 1;
        if(home_yellow_cards_counter < 0)
            home_yellow_cards_counter = 0;

        updateHomeTeamYellowCards();
    }

    ///
    /// away team yellow cards
    ///

    private void updateAwayTeamYellowCards() {
        TextView view = (TextView) findViewById(R.id.away_team_yellow_cards_counter);
        int amount = away_yellow_cards_counter;
        display(view, amount);
    }

    public void decreaseAwayTeamYellowCards(View view) {
        away_yellow_cards_counter += 1;
        updateAwayTeamYellowCards();
    }

    public void increaseAwayTeamYellowCards(View view) {
        away_yellow_cards_counter -= 1;
        if(away_yellow_cards_counter < 0)
            away_yellow_cards_counter = 0;

        updateAwayTeamYellowCards();
    }

    ///
    /// home team red cards
    ///

    private void updateHomeTeamRedCards() {
        TextView view = (TextView) findViewById(R.id.home_team_red_cards_counter);
        int amount = home_red_cards_counter;
        display(view, amount);
    }

    public void increaseHomeTeamRedCards(View view) {
        home_red_cards_counter += 1;
        updateHomeTeamRedCards();
    }

    public void decreaseHomeTeamRedCards(View view) {
        home_red_cards_counter -= 1;
        if(home_red_cards_counter < 0)
            home_red_cards_counter = 0;

        updateHomeTeamRedCards();
    }

    ///
    /// away team red cards
    ///

    private void updateAwayTeamRedCards() {
        TextView view = (TextView) findViewById(R.id.away_team_red_cards_counter);
        int amount = away_red_cards_counter;
        display(view, amount);
    }


    public void decreaseAwayTeamRedCards(View view) {
        away_red_cards_counter += 1;
        updateAwayTeamRedCards();
    }

    public void increaseAwayTeamRedCards(View view) {
        away_red_cards_counter -= 1;
        if(away_red_cards_counter < 0)
            away_red_cards_counter = 0;

        updateAwayTeamRedCards();
    }


    /**
     * Resets all the values in the score keeper.
     * @param view
     */
    public void resetData(View view) {
        home_goals_counter = 0;
        away_goals_counter = 0;
        home_fouls_counter = 0;
        away_fouls_counter = 0;
        home_red_cards_counter = 0;
        away_red_cards_counter = 0;
        home_yellow_cards_counter = 0;
        away_yellow_cards_counter = 0;
        updateHomeTeamGoals();
        updateAwayTeamGoals();
        updateHomeTeamFouls();
        updateAwayTeamFouls();
        updateHomeTeamYellowCards();
        updateAwayTeamYellowCards();
        updateHomeTeamRedCards();
        updateAwayTeamRedCards();
    }

    /**
     * Displays a certain amount in a given (text) view.
     * @param view
     * @param amount
     */
    private void display(TextView view, int amount) {
        view.setText("" + amount);
    }
}
