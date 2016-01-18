package com.example.test4.rating;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
private static Button btn;
    private static TextView t2;
    private static RatingBar Rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListenerForRatingBar();
        onButtonClickListener();
    }
public void ListenerForRatingBar(){
Rb=(RatingBar)findViewById(R.id.rb2);
    t2=(TextView)findViewById(R.id.txt);
    btn=(Button)findViewById(R.id.b1);
    Rb.setOnRatingBarChangeListener(
            new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    t2.setText(String.valueOf(rating));
                }
            }
    );


    }
    public void onButtonClickListener(){
        Rb=(RatingBar)findViewById(R.id.rb2);
        btn=(Button)findViewById(R.id.b1);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,String.valueOf(Rb.getRating()),Toast.LENGTH_LONG).show();
                    }
                }
        );

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
