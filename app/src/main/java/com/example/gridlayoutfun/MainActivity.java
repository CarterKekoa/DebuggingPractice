package com.example.gridlayoutfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid3);   //we have a second activity main that we use instead "grid1"
    }

    public void onButtonClick(View view){
        Button button = (Button) view;
        String text = button.getText().toString(); //use the text in the button to know which one
        Toast.makeText(this, "Hello from button " + text, Toast.LENGTH_SHORT).show();
    }
}
