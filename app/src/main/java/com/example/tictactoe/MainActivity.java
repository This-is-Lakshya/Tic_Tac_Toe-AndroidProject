package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button r1_c1, r1_c2, r1_c3, r2_c1, r2_c2, r2_c3, r3_c1, r3_c2, r3_c3;
    Button ReStart;
    String b1_1, b1_2, b1_3, b2_1, b2_2, b2_3, b3_1, b3_2, b3_3;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ReStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1_c1.setText("");
                r1_c2.setText("");
                r1_c3.setText("");
                r2_c1.setText("");
                r2_c2.setText("");
                r2_c3.setText("");
                r3_c1.setText("");
                r3_c2.setText("");
                r3_c3.setText("");

                count = 0;
                flag = 0;
            }
        });
    }

    private void init(){
        r1_c1 = findViewById(R.id.r1_c1);
        r1_c2 = findViewById(R.id.r1_c2);
        r1_c3 = findViewById(R.id.r1_c3);
        r2_c1 = findViewById(R.id.r2_c1);
        r2_c2 = findViewById(R.id.r2_c2);
        r2_c3 = findViewById(R.id.r2_c3);
        r3_c1 = findViewById(R.id.r3_c1);
        r3_c2 = findViewById(R.id.r3_c2);
        r3_c3 = findViewById(R.id.r3_c3);

        ReStart = findViewById(R.id.ReStart);
    }

    public void check(View v){
        Button btnCurr = (Button) v;
        count++;

        if(flag == 0){
            btnCurr.setText("X");
            flag = 1;
        }else{
            btnCurr.setText("O");
            flag = 0;
        }

        // ---
        if(count>4){
            b1_1 = r1_c1.getText().toString();
            b1_2 = r1_c2.getText().toString();
            b1_3 = r1_c3.getText().toString();
            b2_1 = r2_c1.getText().toString();
            b2_2 = r2_c2.getText().toString();
            b2_3 = r2_c3.getText().toString();
            b3_1 = r3_c1.getText().toString();
            b3_2 = r3_c2.getText().toString();
            b3_3 = r3_c3.getText().toString();

            // conditions -

            if(b1_1.equals(b1_2) && b1_2.equals(b1_3) && !b1_1.equals("")){
                Toast.makeText(this, "Winner - "+b1_1, Toast.LENGTH_SHORT).show();

                r2_c1.setText("");
                r2_c2.setText("");
                r2_c3.setText("");
                r3_c1.setText("");
                r3_c2.setText("");
                r3_c3.setText("");
            }
            else if(b2_1.equals(b2_2) && b2_2.equals(b2_3) && !b2_1.equals("")){
                Toast.makeText(this, "Winner - "+b2_1, Toast.LENGTH_SHORT).show();

                r1_c1.setText("");
                r1_c2.setText("");
                r1_c3.setText("");
                r3_c1.setText("");
                r3_c2.setText("");
                r3_c3.setText("");
            }
            else if(b3_1.equals(b3_2) && b3_2.equals(b3_3) && !b3_1.equals("")){
                Toast.makeText(this, "Winner - "+b3_1, Toast.LENGTH_SHORT).show();

                r1_c1.setText("");
                r1_c2.setText("");
                r1_c3.setText("");
                r2_c1.setText("");
                r2_c2.setText("");
                r2_c3.setText("");
            }
            else if(b1_1.equals(b2_1) && b2_1.equals(b3_1) && !b1_1.equals("")){
                Toast.makeText(this, "Winner - "+b1_1, Toast.LENGTH_SHORT).show();

                r1_c2.setText("");
                r1_c3.setText("");
                r2_c2.setText("");
                r2_c3.setText("");
                r3_c2.setText("");
                r3_c3.setText("");
            }
            else if(b1_2.equals(b2_2) && b2_2.equals(b3_2) && !b1_2.equals("")){
                Toast.makeText(this, "Winner - "+b1_2, Toast.LENGTH_SHORT).show();

                r1_c1.setText("");
                r1_c3.setText("");
                r2_c1.setText("");
                r2_c3.setText("");
                r3_c1.setText("");
                r3_c3.setText("");
            }
            else if(b1_3.equals(b2_3) && b2_3.equals(b3_3) && !b1_3.equals("")){
                Toast.makeText(this, "Winner - "+b1_3, Toast.LENGTH_SHORT).show();

                r1_c1.setText("");
                r1_c2.setText("");
                r2_c1.setText("");
                r2_c2.setText("");
                r3_c1.setText("");
                r3_c2.setText("");
            }
            else if(b1_1.equals(b2_2) && b2_2.equals(b3_3) && !b1_1.equals("")){
                Toast.makeText(this, "Winner - "+b1_1, Toast.LENGTH_SHORT).show();

                r1_c2.setText("");
                r1_c3.setText("");
                r2_c1.setText("");
                r2_c3.setText("");
                r3_c1.setText("");
                r3_c2.setText("");
            }
            else if(b1_3.equals(b2_2) && b2_2.equals(b3_1) && !b1_3.equals("")){
                Toast.makeText(this, "Winner - "+b1_3, Toast.LENGTH_SHORT).show();

                r1_c1.setText("");
                r1_c2.setText("");
                r2_c1.setText("");
                r2_c3.setText("");
                r3_c2.setText("");
                r3_c3.setText("");
            }
            else if(count == 9){
                Toast.makeText(this, "It's a DRAW!", Toast.LENGTH_SHORT).show();
            }

        }

    }


}