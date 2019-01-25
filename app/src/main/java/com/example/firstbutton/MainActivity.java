package com.example.firstbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This pulls up the xml document where we defined the button.  Without this, we will not be able to find our button.
        Button button = findViewById(R.id.toast); // Here we find the button we defined earlier in our xml and assign it to a variable of type Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yay, our button works!", Toast.LENGTH_SHORT).show(); //Toast message
            }
        });


    }
}
