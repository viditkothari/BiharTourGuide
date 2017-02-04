package in.co.viditkothari.bihartourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent i = new Intent(MainActivity.this, Listing.class);


        findViewById(R.id.btn_events).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra(TheConstants.listType, TheConstants.EVENTS);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_restaurants).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra(TheConstants.listType, TheConstants.RESTAURANTS);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_historicalplaces).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra(TheConstants.listType, TheConstants.HISTORICAL);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_landmarks).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra(TheConstants.listType, TheConstants.LANDMARKS);
                startActivity(i);
            }
        });
    }
}
