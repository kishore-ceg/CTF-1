package com.workshop.cs.ctf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView textView; // The counter object
    int valueOfCounter; //The value of the counter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.counter);
        valueOfCounter = 0;
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

    //Increments the counter by 1 when UP button is pressed
    public void incrementCounter(View v) {
        valueOfCounter = Integer.parseInt(textView.getText().toString()); //Gets the value of the counter
        valueOfCounter++; //Increment
        textView.setText(Integer.toString(valueOfCounter)); //Sets the new value
    }

    //Decrements the counter by 1 when DOWN button is pressed
    public void decrementCounter(View v) {
        valueOfCounter = Integer.parseInt(textView.getText().toString()); //Gets the value of the counter
        valueOfCounter--; //Decrement
        textView.setText(Integer.toString(valueOfCounter)); //Sets the new value
    }
}
