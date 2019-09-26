package com.merocalculation.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name, point1,point2,point3;
    private Button Calculate;
    private TextView View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.name);
        point1 = findViewById(R.id.grade1);
        point2 = findViewById(R.id.grade2);
        point3 = findViewById(R.id.grade3);
        Calculate = findViewById(R.id.calculate);
        View = findViewById(R.id.view);


        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                //validation
                if (TextUtils.isEmpty(Name.getText().toString())){
                    Name.setError("Enter your Name");
                    return;
                }
                else if (TextUtils.isEmpty(point1.getText().toString())){
                    point1.setError("Enter your Grade");
                    return;
                }
               else if (TextUtils.isEmpty(point2.getText().toString())){
                    point2.setError("Enter your Grade");
                    return;
                }
               else if (TextUtils.isEmpty(point3.getText().toString())){
                    point3.setError("Enter your Grade");
                    return;
                }



                int x = Integer.parseInt(point1.getText().toString());
                int y = Integer.parseInt(point2.getText().toString());
                int z = Integer.parseInt(point3.getText().toString());


                int res = x+y+z;
                int ans = res/3;

                View.append(Name.getText().toString()+ " Percentage is "+ans +"\n");

               Name.getText().clear();
               point1.getText().clear();
               point2.getText().clear();
               point3.getText().clear();

            }
        });

    }

}
