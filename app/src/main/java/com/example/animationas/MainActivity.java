package com.example.animationas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);

// Получаем ссылку на изображение солнца
        ImageView sunlmageView = (ImageView) findViewById(R.id.sun);

// Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sunrise);
// Подключаем анимацию к нужному изображению
        View sunlmageVie.startAnimation(sunRiseAnimation);
    }
}
