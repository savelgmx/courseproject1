package com.example.administrator.courseproject1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 25.04.2018.
 */

public class SecondActivity extends AppCompatActivity{

    public static final String MAIN_EDITTEXT_KEY="MAIN_EDITTEXT_KEY";


    private TextView mTextView;
    private Button mButtonTwo;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        mTextView =findViewById(R.id.tvTwo);
        Bundle bundle =getIntent().getExtras();
        mTextView.setText(bundle.getString(MAIN_EDITTEXT_KEY));
    }


}
