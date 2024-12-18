package com.nandana.visitorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addVisitor extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button b1;
    String getFn,getLn,getPrps,getWtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_visitor);

        ed1=(EditText) findViewById(R.id.fn);
        ed2=(EditText) findViewById(R.id.ln);
        ed3=(EditText) findViewById(R.id.prps);
        ed4=(EditText) findViewById(R.id.wtm);
        b1=(Button)findViewById(R.id.sub);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFn=ed1.getText().toString();
                getLn=ed2.getText().toString();
                getPrps=ed3.getText().toString();
                getWtm=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getFn+" "+getLn+" "+getPrps+" "+getWtm,Toast.LENGTH_LONG).show();

            }
        });

    }
}