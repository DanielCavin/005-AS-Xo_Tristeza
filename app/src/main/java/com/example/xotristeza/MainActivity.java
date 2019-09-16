package com.example.xotristeza;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView iSmile;
    Button btnSmile;
    TextView tContSmile;

    int[] imagensIds = new int[]{
            R.drawable.smile01,
            R.drawable.smile02,
            R.drawable.smile03,
            R.drawable.smile04,
            R.drawable.smile05,
            R.drawable.smile06,
            R.drawable.smile07,
            R.drawable.smile08,
            R.drawable.smile09,
            R.drawable.smile10,
            R.drawable.smile11

    };
    int n = 0;
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iSmile = findViewById(R.id.iSmile);
        btnSmile = findViewById(R.id.btnSmile);
        tContSmile = findViewById(R.id.tContSmile);
        iSmile.setImageResource(imagensIds[cont]);

        // Responsavel por zerar a contagem

        // logia do contador
        btnSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
                if(n % 10 == 0 && cont < 10){
                  cont++;
                }

                iSmile.setImageResource(imagensIds[cont]);
                tContSmile.setText(""+ n );

            }
        });
    }
}

