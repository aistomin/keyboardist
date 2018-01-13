package com.github.aistomin.keyboardist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            ((TextView) findViewById(R.id.tvDisplay)).setText(
                String.format(
                    Locale.getDefault(), "%s: %d\n%s: %s",
                    getString(R.string.key_code), event.getKeyCode(),
                    getString(R.string.key_details), event.toString()
                )
            );
        }
        return super.dispatchKeyEvent(event);
    }
}
