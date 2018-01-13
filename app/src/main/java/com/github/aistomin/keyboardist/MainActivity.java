package com.github.aistomin.keyboardist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            ((TextView) findViewById(R.id.tvDisplay)).setText(event.toString());
        }
        return super.dispatchKeyEvent(event);
    }
}
