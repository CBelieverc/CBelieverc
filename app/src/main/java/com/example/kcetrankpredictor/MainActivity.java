package com.example.kcetrankpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber3,editTextNumber5,editTextNumber6,editTextNumber7,editTextNumber8,editTextNumber9,editTextNumber10,editTextNumber11;
    Button button;
    private TextView textview12,textview10,textview11,textview6,textview8,textview9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
        editTextNumber7 = findViewById(R.id.editTextNumber7);
        editTextNumber8 = findViewById(R.id.editTextNumber8);
        editTextNumber9 = findViewById(R.id.editTextNumber9);
        editTextNumber10 = findViewById(R.id.editTextNumber10);
        editTextNumber11 = findViewById(R.id.editTextNumber11);
        textview12 = findViewById(R.id.textView12);
        textview10 = findViewById(R.id.textView10);
        textview11 = findViewById(R.id.textView11);
        textview6 = findViewById(R.id.textView6);
        textview8 = findViewById(R.id.textView8);
        textview9 = findViewById(R.id.textView9);
        button = findViewById(R.id.button);

    }

    public void calculation(View view){
        double pm1,pm2,pm3,pm4,km1,km2,km3,km4,pcm1,pcb1,pcm2,pcb2,temp1,temp2;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        String rank1 = "0";
        String rank2 = "0";
        pm1 = Double.parseDouble(editTextNumber3.getText().toString());
        pm2 = Double.parseDouble(editTextNumber5.getText().toString());
        pm3 = Double.parseDouble(editTextNumber6.getText().toString());
        pm4 = Double.parseDouble(editTextNumber7.getText().toString());
        km1 = Double.parseDouble(editTextNumber8.getText().toString());
        km2 = Double.parseDouble(editTextNumber9.getText().toString());
        km3 = Double.parseDouble(editTextNumber10.getText().toString());
        km4 = Double.parseDouble(editTextNumber11.getText().toString());
        
        pcm1 = (pm1+pm2+pm3)/3;
        pcm2 = (km1+km2+km3)/1.8;
        pcb1 = (pm1+pm2+pm4)/3;
        pcb2 = (km1+km2+km4)/1.8;

        temp1 = (pcm1+pcm2)/2;
        temp2 = (pcb1+pcb2)/2;

        if ( temp1>=180){
            result1 =0;result2=0;
        }
        if (temp1<=100 && temp1>=97.222){
             result1 =1;result2=2;
        }
        else if(temp1<=96.666 && temp1>=96.111){
            result1 =2;result2=3;
        }
        else if(temp1<=95.555 && temp1>=95){
            result1 =4;result2=5;
        }else if(temp1<=94.444 && temp1>=93.888){
            result1 =6;result2=7;
        }else if(temp1<=93.333 && temp1>92.777){
            result1 =8;result2=9;
        }else if(temp1<93.333 && temp1>=92.222){
            result1 =10;result2=20;
        }else if(temp1<92.222 && temp1>=91.111){
            result1 =21;result2=30;
        }else if(temp1<91.111 && temp1>=89.444){
            result1 =31;result2=40;
        }else if(temp1<89.444 && temp1>=86.666){
            result1 =41;result2=60;
        }else if(temp1<86.666 && temp1>=84.444){
            result1 =61;result2=80;
        }else if(temp1<84.444 && temp1>=81.111){
            result1 =81;result2=100;
        }else if(temp1<81.111 && temp1>=78.888){
            result1 =101;result2=140;
        }else if(temp1<78.888 && temp1>=78.333){
            result1 =141;result2=160;
        }
        else if(temp1<78.333 && temp1>=77.777){
            result1 =161;result2=200;
        }
        else if(temp1<77.777 && temp1>=77.222){
            result1 =201;result2=250;
        }
        else if(temp1<77.222 && temp1>=76.666){
            result1 =251;result2=300;
        }
        else if(temp1<76.666 && temp1>=72.222){
            result1 =301;result2=390;
        }
        else if(temp1<72.222 && temp1>=69.444){
            result1 =391;result2=400;
        }
        else if(temp1<69.444 && temp1>=66.666){
            result1 =410;result2=1000;
        }
        else if(temp1<66.666 && temp1>=63.888){
            result1 =1001;result2=1500;
        }
        else if(temp1<63.888 && temp1>=61.111){
            result1 =1501;result2=2000;
        }
        else if(temp1<61.111 && temp1>=58.333){
            result1 =2001;result2=2500;
        }
        else if(temp1<58.333 && temp1>=55.555){
            result1 =2501;result2=3000;
        }
        else if(temp1<55.555 && temp1>=52.777){
            result1 =3001;result2=3500;
        }
        else if(temp1<52.777 && temp1>=50.000){
            result1 =3501;result2=4000;
        }
        else if(temp1<50.000 && temp1>=47.222){
            result1 =4001;result2=4500;
        }
        else if(temp1<47.222 && temp1>=44.444){
            result1 =4501;result2=5000;
        }
        else if(temp1<44.444 && temp1>=41.666){
            result1 =5001;result2=5500;
        }
        else if(temp1<41.666 && temp1>=38.888){
            result1 =5501;result2=6000;
        }
        else if(temp1<38.888 && temp1>=36.111){
            result1 =6001;result2=10000;
        }
        else if(temp1<36.111 && temp1>=33.333){
            result1 =10001;result2=20000;
        }
        else if(temp1<33.33 && temp1>=30.555){
            result1 =20001;result2=40001;
        }
        else if(temp1<30.555 && temp1>=27.777){
            result1 =40001;result2=50000;
        }
        else if(temp1<27.777 && temp1>=25){
            result1 =50001;result2=60000;
        }
        else if(temp1<25 && temp1>=0){
            result1 =60001;result2=120000;
        }

        //pcb result

        //if ( temp2>=180){
        //    result3 =0;result4=0;
        //}
        if (temp2<=100 && temp2>=97.222){
            result3 =1;result4=2;
        }
        else if(temp2<=96.666 && temp2>=96.111){
            result3 =2;result4=3;
        }
        else if(temp2<=95.555 && temp2>=95){
            result3 =4;result4=5;
        }else if(temp2<=94.444 && temp2>=93.888){
            result3 =6;result4=7;
        }else if(temp2<=93.333 && temp2>92.777){
            result3 =8;result4=9;
        }else if(temp2<93.333 && temp2>=92.222){
            result3 =10;result4=20;
        }else if(temp2<92.222 && temp2>=91.111){
            result3 =21;result4=30;
        }else if(temp2<91.111 && temp2>=89.444){
            result3 =31;result4=40;
        }else if(temp2<89.444 && temp2>=86.666){
            result3 =41;result4=60;
        }else if(temp2<86.666 && temp2>=84.444){
            result3 =61;result4=80;
        }else if(temp2<84.444 && temp2>=81.111){
            result3 =81;result4=100;
        }else if(temp2<81.111 && temp2>=78.888){
            result3 =101;result4=140;
        }else if(temp2<78.888 && temp2>=78.333){
            result3 =141;result4=160;
        }
        else if(temp2<78.333 && temp2>=77.777){
            result3 =161;result4=200;
        }
        else if(temp2<77.777 && temp2>=77.222){
            result3 =201;result4=250;
        }
        else if(temp2<77.222 && temp2>=76.666){
            result3 =251;result4=300;
        }
        else if(temp2<76.666 && temp2>=72.222){
            result3 =301;result4=390;
        }
        else if(temp2<72.222 && temp2>=69.444){
            result3 =391;result4=400;
        }
        else if(temp2<69.444 && temp2>=66.666){
            result3 =410;result4=1000;
        }
        else if(temp2<66.666 && temp2>=63.888){
            result3 =1001;result4=1500;
        }
        else if(temp2<63.888 && temp2>=61.111){
            result3 =1501;result4=2000;
        }
        else if(temp2<61.111 && temp2>=58.333){
            result3 =2001;result4=2500;
        }
        else if(temp2<58.333 && temp2>=55.555){
            result3 =2501;result4=3000;
        }
        else if(temp2<55.555 && temp2>=52.777){
            result3 =3001;result4=3500;
        }
        else if(temp2<52.777 && temp2>=50.000){
            result3 =3501;result4=4000;
        }
        else if(temp2<50.000 && temp2>=47.222){
            result3 =4001;result4=4500;
        }
        else if(temp2<47.222 && temp2>=44.444){
            result3 =4501;result4=5000;
        }
        else if(temp2<44.444 && temp2>=41.666){
            result3 =5001;result4=5500;
        }
        else if(temp2<41.666 && temp2>=38.888){
            result3 =5501;result4=6000;
        }
        else if(temp2<38.888 && temp2>=36.111){
            result3 =6001;result4=10000;
        }
        else if(temp2<36.111 && temp2
                >=33.333){
            result3 =10001;result4=20000;
        }
        else if(temp2<33.33 && temp2>=30.555){
            result3 =20001;result4=40001;
        }
        else if(temp2<30.555 && temp2>=27.777){
            result3 =40001;result4=50000;
        }
        else if(temp2<27.777 && temp2>=25){
            result3 =50001;result4=60000;
        }
        else if(temp2<25 && temp2>=0){
            result3 =60001;result4=120000;
        }

        rank1 = String.format(":  %d - %d",result1,result2);
        textview12.setText(rank1);
        textview10.setText("RESULT");
        textview11.setText("Engeneering rank");
        textview6.setText("All the Best !");
        rank2 = String.format(":  %d - %d",result3,result4);
        textview9.setText(rank2);
        textview8.setText("B.Sc AG/Vet science/B-Pharma/D-Pharma");


    }

}