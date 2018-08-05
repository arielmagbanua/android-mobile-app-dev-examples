package com.arielmagbanua.userinterface;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get all the buttons
        Button showNotificationButton = findViewById(R.id.show_notification);
        Button showToastButton = findViewById(R.id.show_toast);
        Button showDialogButton = findViewById(R.id.show_dialog);
        Button showLayoutsDemoButton = findViewById(R.id.show_layouts_demo);

        // Implement listeners here
        showNotificationButton.setOnClickListener(this);
        showDialogButton.setOnClickListener(this);
        showLayoutsDemoButton.setOnClickListener(this);
        Toast.makeText(this, "Application Thinker!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_send:
                Log.d(TAG, "menu_send is clicked!");
                return true;
            case R.id.menu_settings:
                Log.d(TAG, "menu_settings is clicked!");
                return true;
        }

        return false;
    }

    public void showToast(View view){
        Toast.makeText(this, "Advance Thinker!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.show_dialog:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle("Sample Dialog");
                builder.setMessage("Are you an advance thinker?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Positive button clicked!", Toast.LENGTH_SHORT).show();

                        // Your logic here...
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Negative button clicked!", Toast.LENGTH_SHORT).show();

                        // Your logic here...
                    }
                });
                builder.setNeutralButton("Meh...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Neutral button clicked!", Toast.LENGTH_SHORT).show();

                        // Your logic here...
                    }
                });

                builder.show();
                break;

            case R.id.show_layouts_demo:

                Intent intent = new Intent(this, LayoutsDemoActivity.class);
                startActivity(intent);

                break;

            case R.id.show_notification:



                break;
        }
    }
}
