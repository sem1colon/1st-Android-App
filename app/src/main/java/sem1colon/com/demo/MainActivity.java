package sem1colon.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        TextView text = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        text.setText("Welcome to the My 1st App!");
        button.setVisibility(View.GONE);
    }
}
