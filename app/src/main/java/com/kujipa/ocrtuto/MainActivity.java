package com.kujipa.ocrtuto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

    ImageButton image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 =  findViewById(R.id.imagemachine);
        image2 =  findViewById(R.id.imageporte);
        image3 =  findViewById(R.id.imagemaintenance);

    }

    public void logo_bouton1 (View view) {
        startActivity(new Intent(this, page_machine.class));
    }

    public void logo_bouton2 (View view) {
        startActivity(new Intent(this, page_porte.class));
    }

    public void logo_bouton3 (View view) {
        startActivity(new Intent(this, page_maintenance.class));
    }

}
