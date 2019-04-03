package com.example.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view){
        if(view.getId()==R.id.button){
            Intent intent= new Intent(this, MiActivity.class);
            startActivity(intent);
        }
        //Log.d("Prueba","Estamos probando el evento click");
        else{

            Toast.makeText(this, "Click de imagen", Toast.LENGTH_SHORT).show();
        }


    }
    public void onClick2 (View view){
        Toast.makeText(this, "Click de imagen", Toast.LENGTH_SHORT).show();
    }
}
