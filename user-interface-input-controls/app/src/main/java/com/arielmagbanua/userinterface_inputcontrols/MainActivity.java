package com.arielmagbanua.userinterface_inputcontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonsDemo = findViewById(R.id.buttons_demo);
        Button textFieldDemo = findViewById(R.id.text_field_demo);

        buttonsDemo.setOnClickListener(this);
        textFieldDemo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttons_demo:
                Intent buttonsDemoIntent = new Intent(this, ButtonsDemoActivity.class);
                startActivity(buttonsDemoIntent);
                break;

            case R.id.text_field_demo:
                Intent textFieldDemoIntent = new Intent(this, TextFieldDemoActivity.class);
                startActivity(textFieldDemoIntent);
                break;
        }
    }
}
