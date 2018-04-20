package com.example.administrator.courseproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

/*
Задание

Создать проект с пустой активити.
В разметку добавить EditText и Button.
Вводим текст и по нажатию на Button отображаем Toast с введенным текстом.
Если в EditText нет текста, то по нажатию на Button ничего не происходит.
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
