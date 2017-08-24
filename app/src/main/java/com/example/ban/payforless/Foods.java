package com.example.ban.payforless;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ban on 25/08/2017.
 */
public class Foods extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foods);
    }

    public void jollibee(View view) {
        Intent addidasIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://allpromos.ph/11559/av-surfer-weekend-exclusive-treats/"));
        startActivity(addidasIntent);
    }

    public void subway(View view) {
        Intent agodaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.groupon.com/coupons/stores/subway.com"));
        startActivity(agodaIntent);
    }

    public void bonchon(View view) {
        Intent airasiaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.groupon.com/deals/bon-chon"));
        startActivity(airasiaIntent);
    }

    public void kentucky(View view) {
        Intent altheaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.picodi.com/ph/kfc"));
        startActivity(altheaIntent);
    }

    public void mcdo(View view) {
        Intent buffetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.picodi.com/ph/mcdonald-s"));
        startActivity(buffetIntent);
    }
}