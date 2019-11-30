package com.example.intentanddialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    TextView t1,t2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        t1 = findViewById(R.id.name);
        t2 = findViewById(R.id.address);
        btn = findViewById(R.id.ok);

        Intent intent = getIntent();
        t1.setText(intent.getStringExtra("name"));
        t2.setText(intent.getStringExtra("address"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityB.this);
                builder.setTitle("confirmation")
                        .setMessage("is the data recieved ?!")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ActivityB.this,"date recieved",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActivityB.this,"failed",Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog a = builder.create();
                a.show();
            }
        });
    }
}
