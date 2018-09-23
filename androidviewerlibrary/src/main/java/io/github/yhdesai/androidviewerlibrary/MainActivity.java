package io.github.yhdesai.androidviewerlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String joke = getIntent().getStringExtra("joke");
        TextView jokesView = findViewById(R.id.jokeView);
        jokesView.setText(joke);

    }
}
