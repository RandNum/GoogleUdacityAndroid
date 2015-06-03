package com.udacity.wiggins.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnSpotify);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Spotify App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

        /* Spotify button handler */
        Button ScoresButton = (Button) findViewById(R.id.btnScores);
        ScoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Score App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

        /* Library button handler */
        Button LibraryButton = (Button) findViewById(R.id.btnLibrary);
        LibraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Library App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

        /* Bigger button handler */
        Button BiggerButton = (Button) findViewById(R.id.btnBigger);
        BiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Build It Bigger App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

        /* Reader button handler */
        Button ReaderButton = (Button) findViewById(R.id.btnReader);
        ReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Reader App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

        /* Capstone button handler */
        Button CapstoneButton = (Button) findViewById(R.id.btnCapstone);
        CapstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                //from the Google API guide (http://developer.android.com/guide/topics/ui/notifiers/toasts.html)
            }
        });

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
}
