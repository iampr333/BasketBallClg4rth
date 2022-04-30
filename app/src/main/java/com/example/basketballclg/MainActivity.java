package com.example.basketballclg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

            TextView teamAScore;
            TextView teamBScore;
             int a =0;
             int b =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     void setValue()
     {
         teamAScore = findViewById(R.id.teamASore);
         teamBScore = findViewById(R.id.teamBSore);

          teamAScore.setText(""+a);
          teamBScore.setText(""+b); }
     public void reset(View view)
    {
        a = 0;
         b=0;
         setValue(); }
    public void freeThrowA(View view)
    {
          a++;
        setValue(); }
    public void twoPointsA(View view)
    {
          a = a+2;
        setValue(); }
    public void threePointsA(View view)
    {
        a = a+3;
        setValue(); }
    public void freeThrowB(View view)
    {
        b++;
        setValue(); }
    public void twoPointsB(View view)
    {
        b = b+2;
        setValue(); }
    public void threePointsB(View view)
    {
          b= b+3;
        setValue(); }
}