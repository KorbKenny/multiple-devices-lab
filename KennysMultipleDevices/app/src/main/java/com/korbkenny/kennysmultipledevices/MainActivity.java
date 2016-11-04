package com.korbkenny.kennysmultipledevices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView mImage;
    Button mButton;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.main_text);
        mButton = (Button) findViewById(R.id.button);
        mImage = (ImageView) findViewById(R.id.image);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText(R.string.answer);
                mImage.setImageResource(R.drawable.ic_tag_faces_black_24dp);
            }
        });

    }
}
