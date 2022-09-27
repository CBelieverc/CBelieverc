package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class subjects1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects1);
        ImageView back8 =findViewById(R.id.back8);
        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });

    }

    public void openactivity_v1(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, puc1.class);
        intent.putExtra("subject1","Mathematics");
        startActivity(intent);
    }
    public void openactivity_v2(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, puc1.class);
        intent.putExtra("subject1","Physics");
        startActivity(intent);
    }
    public void openactivity_v3(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, puc1.class);
        intent.putExtra("subject1","Chemistry");
        startActivity(intent);
    }
    public void openactivity_v4(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, puc1.class);
        intent.putExtra("subject1","Biology");
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();

    }
}