package com.example.intentanddialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1 , editText2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 =  findViewById(R.id.name);
        editText2 =  findViewById(R.id.address);
        btn =findViewById(R.id.send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityB.class);
                intent.putExtra("name",editText1.getText().toString());
                intent.putExtra("address",editText2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
