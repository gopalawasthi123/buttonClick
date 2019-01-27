package com.example.gopalawasthi.buttonclick;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   ProgressBar progressBar;
   LinearLayout linearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressbar);
        linearlayout = findViewById(R.id.linearlayout);

        GradientDrawable shape =new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
       // shape.setColor(Color.BLACK);
        shape.setSize(3,0);
        shape.mutate();
        shape.setCornerRadius(50.0f);
        progressBar.setProgress(70);
        linearlayout.setBackground(shape);

       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            progressBar.setProgressTintList(ColorStateList.valueOf(Color.RED));
           
        }else{
            Drawable progressDrawable = progressBar.getProgressDrawable().mutate();
            progressDrawable.setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
            progressBar.setBackground(progressDrawable);
        }




    }

}
