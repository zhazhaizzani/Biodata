package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone(View view) {
        String no = "081904867169";
        Intent it = new Intent(Intent.ACTION_DIAL);
        it.setData(Uri.fromParts("tel",no,null));
        startActivity(it);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"zhazhaizza05@gmail.com"});

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {

        }
    }


    public void showMaps(View view) {
        Uri uri = Uri.parse("geo:-6.809692, 110.929728=");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}