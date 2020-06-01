package com.arielmagbanua.intentextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "intentExtra.MESSAGE";
    public final static String NUMBER_EXTRA = "number_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Button button = (Button)view;
        Log.d("MyActivity", "Button Click!");
        Log.d("MyActivity", button.getText().toString());

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.edit_message);
        String message = editText.getText().toString();


        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(NUMBER_EXTRA, 1000);

        startActivity(intent);
    }
}
