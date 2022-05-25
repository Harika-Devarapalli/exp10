package com.example.exp10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class exp5main extends AppCompatActivity {
    EditText var1;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3;
    AlertDialog.Builder builder;
    AlertDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp5main);
        var1=findViewById(R.id.name2);
        r1=findViewById(R.id.male);
        r2=findViewById(R.id.female);
        r3=findViewById(R.id.others);
        c1=findViewById(R.id.english);
        c2=findViewById(R.id.telugu);
        c3=findViewById(R.id.hindi);
        builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder
                .setCancelable(false)
                .setView(inflater.inflate(R.layout.demo, null))
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        EditText var2=alert.findViewById(R.id.name2);
                        var1.setText(var2.getText().toString());

                        RadioButton male,female,others;
                        male=alert.findViewById(R.id.male);
                        female=alert.findViewById(R.id.female);
                        others=alert.findViewById(R.id.others);

                        CheckBox telugu,english,hindi;
                        telugu=alert.findViewById(R.id.telugu);
                        english=alert.findViewById(R.id.english);
                        hindi=alert.findViewById(R.id.hindi);

                        if(male.isSelected())
                            r2.setChecked(true);
                        else if(female.isChecked())
                            r1.setChecked(true);
                        else
                            r3.setChecked(true);

                        if(telugu.isChecked())
                            c2.setChecked(true);
                        if(english.isChecked())
                            c1.setChecked(true);
                        if(hindi.isChecked())
                            c3.setChecked(true);
                    }
                });
        alert = builder.create();
        alert.show();
    }
}
