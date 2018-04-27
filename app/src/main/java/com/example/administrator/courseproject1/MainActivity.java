package com.example.administrator.courseproject1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/*
Задание 1
(выполнено)
Создать проект с пустой активити.
В разметку добавить EditText и Button.
Вводим текст и по нажатию на Button отображаем Toast с введенным текстом.
Если в EditText нет текста, то по нажатию на Button ничего не происходит.

Задание 2

Создать второй экран с TextView и Button
Второй экран теперь открывается при нажатии на кнопку на первом экране
В TextView передаем текст из EditText первого экрана.
По нажатию на Button пока ничего не происходит.

 */


private EditText mEditTextOne;
private Button mButtonOne;
private String mEditTextOneString;//произвольная строка в mEditTextOneString

    private void showMessage(String string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

//-----обработка нажатия на кнопки
    private View.OnClickListener mOnButtonOneClickListener;

    {
        mOnButtonOneClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (IsEditTextEmpty())  //если текст в EditText присутсвует то выдает подсказку на экран

                {
                    mEditTextOneString=mEditTextOne.getText().toString();
                    showMessage(mEditTextOneString);
                    //далее запускаем вторую форму с помощью Intent
                    Intent startSecondActivityIntent =new Intent(MainActivity.this,SecondActivity.class);
                    startSecondActivityIntent.putExtra(SecondActivity.MAIN_EDITTEXT_KEY,mEditTextOneString);//Intent принимает текст введенный в EditText первого экрана.
                    startActivity(startSecondActivityIntent);//собственно старт второй формы через интент
 /*                   */

                 } else {

                    mEditTextOneString=getResources().getString(R.string.input_error);
                    showMessage(mEditTextOneString);//выдача сообщения обшибке ввода
                }


            }

        };
    }

    private boolean IsEditTextEmpty(){
        return !TextUtils.isEmpty(mEditTextOne.getText());
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //------инициализируем EditText и Button----
        mEditTextOne=findViewById(R.id.etOne);
        mButtonOne=findViewById(R.id.buttonOne);

        mButtonOne.setOnClickListener(mOnButtonOneClickListener);//иницыализируем обработчик нажатия на кнопки

    }
}
