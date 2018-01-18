package com.kujipa.ocrtuto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kujipa on 18/01/18.
 */

public class page_machine extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_machine);
    }

    public void logo_button_ra (View view) {
        startActivity(new Intent(this, MainActivity.class ));
    }

}

