package iics.deguzman.joshuamartin.labexercise1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EvenNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_numbers);

        final Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTextView = (TextView) findViewById(R.id.ResultTextView);

                int first = 10;
                int ctr = 0;
                resultTextView.setText("");
                for(int i=1; ctr<first; i++){
                    if(i%2==0){
                        ctr++;
                        resultTextView.append(i+"\n");
                    }
                }

            }
        });
    }
}
