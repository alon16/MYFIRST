package com.example.myfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi);

        Button bt= findViewById(R.id.button2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MiActivity.this, "Boton", Toast.LENGTH_SHORT).show();
                CheckBox ch= findViewById(R.id.checkBox);
                EditText et= findViewById(R.id.editText);
                Spinner sp=findViewById(R.id.spinner);
                TextView txt= findViewById(R.id.textView);
                //if(ch.isChecked()){
                   // Toast.makeText(MiActivity.this, "Chekeado", Toast.LENGTH_SHORT).show();
                //}
               // else
                    //Toast.makeText(MiActivity.this, "NO chekeado", Toast.LENGTH_SHORT).show();
                String cadena = (String) sp.getSelectedItem();

                if(cadena.equals(et.getText().toString())){
                   txt.setText("Son iguales");
                }
                else
                    et.setError("LO sentimos deben ser iguales");

            }

        });
    }
}
