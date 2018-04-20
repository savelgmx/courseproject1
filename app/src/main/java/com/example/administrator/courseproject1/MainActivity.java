package com.example.administrator.courseproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

/*
Задание

Создать проект с пустой активити.
В разметку добавить EditText и Button.
Вводим текст и по нажатию на Button отображаем Toast с введенным текстом.
Если в EditText нет текста, то по нажатию на Button ничего не происходит.
 */

private EditText mEditTextOne;
private Button mButtonOne;

//-----обработка нажатия на кнопки
    private View.OnClickListener mOnButtonOneClickListener= new View.OnClickListener(){
        @Override
        public void onClick(View view){
            //todo обработка нажатия на кнопки
        }

};
    private boolean IsEditTextEmpty(){
        return !TextUtils.isEmpty(mEditTextOne.getText());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //------инициализируем EditText и Button----
        mEditTextOne=findViewById(R.id.etOne);
        mButtonOne=findViewById(R.id.buttonOne);
        //-------иницыализируем обработчик нажатия на кнопки
        mButtonOne.setOnClickListener(mOnButtonOneClickListener);

    }
}
