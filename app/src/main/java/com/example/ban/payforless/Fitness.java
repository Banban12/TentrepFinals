package com.example.ban.payforless;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ban on 25/08/2017.
 */
public class Fitness extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitness);
    }

    public void levelx(View view) {
        Intent levelxIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metrodeal.com/deals/Metro_Manila/Level-X-Fitness-Gym/632002895"));
        startActivity(levelxIntent);
    }

    public void hybrid(View view) {
        Intent hybridIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metrodeal.com/deals/Metro_Manila/Hybrid-Manila/741650389"));
        startActivity(hybridIntent);
    }

    public void beyond(View view) {
        Intent beyondIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metrodeal.com/deals/Metro_Manila/Beyond-Yoga/414360418"));
        startActivity(beyondIntent);
    }
    public void gold(View view) {
        Intent goldIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metrodeal.com/deals/Metro_Manila/Golds-Gym-Philippines/921813070"));
        startActivity(goldIntent);
    }
}
