package com.example.passtools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * The MainActivity class represents the home screen that users interact with. They can choose to
 * navigate to the RecallActivity by clicking the store_button, the TestActivity by clicking the
 * test_button, or the MakeActivity by clicking the make_button.
 * @author Canaan Eggers
 */
public class MainActivity extends AppCompatActivity {

    /**
     * sets up the screen layout and activates the click listeners for the buttons
     * @param savedInstanceState, the last state of the PassTools app (Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttonIds = {R.id.store_button, R.id.test_button, R.id.make_button};
        for (int id : buttonIds){
            setupButton(id);
        }
    }

    /**
     * launches the appropriate activity based on the user's click input
     * @param view, the layout of the screen (View)
     */
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.store_button)
            launchStore();
        else if(view.getId() == R.id.test_button)
            launchTest();
        else if(view.getId() == R.id.make_button)
            launchMake();
    }

    /**
     * launches the StoreActivity
     */
    private void launchStore() {
        Intent intent = new Intent(this, RecallActivity.class);
        startActivity(intent);
    }

    /**
     * launches the TestActivity
     */
    private void launchTest() {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }

    /**
     * launches the MakeActivity
     */
    private void launchMake() {
        Intent intent = new Intent(this, MakeActivity.class);
        startActivity(intent);
    }

    /**
     * sets up the click listener for the button passed into the function
     * @param buttonId, the number representation of the button (int)
     */
    private void setupButton(int buttonId) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(this);
    }
}