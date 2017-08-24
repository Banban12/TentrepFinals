package com.example.ban.payforless;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);
    }
    public void addidas (View view){
        Intent addidasIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/adidas-coupons/"));
        startActivity(addidasIntent);
    }
    public void agoda (View view){
        Intent agodaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/agoda-coupons/"));
        startActivity(agodaIntent);
    }
    public void airasia (View view){
        Intent airasiaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/airasia-coupons/"));
        startActivity(airasiaIntent);
    }
    public void althea (View view){
        Intent altheaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/althea-coupons/"));
        startActivity(altheaIntent);
    }
    public void buffet (View view){
        Intent buffetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/buffet-101-coupons/"));
        startActivity(buffetIntent);
    }
    public void grab (View view){
        Intent grabIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/grab-coupons/"));
        startActivity(grabIntent);
    }
    public void mcdo (View view){
        Intent mcdoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/mcdonalds-coupons/"));
        startActivity(mcdoIntent);
    }
    public void sm (View view){
        Intent smIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/the-sm-store-coupons/"));
        startActivity(smIntent);
    }
    public void zalora (View view){
        Intent zaloraIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/zalora-coupons/"));
        startActivity(zaloraIntent);
    }
    public void lazada (View view){
        Intent lazadaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coupons.rappler.com/lazada-coupons/"));
        startActivity(lazadaIntent);
    }

}
