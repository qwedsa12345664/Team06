package com.example.one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.Intent;

public class Page3 extends AppCompatActivity {
    static int score = 0, k = 0;

    Button button5,button6,button7;
    Spinner spinner,spinner2,spinner3,spinner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinner.getSelectedItemPosition() == 0) score += 0;
                if (spinner.getSelectedItemPosition() == 1) score += 5;
                if (spinner.getSelectedItemPosition() == 2) score += 0;
                if (spinner.getSelectedItemPosition() == 3) score += 10;

                if (spinner2.getSelectedItemPosition() == 0) score += 0;
                if (spinner2.getSelectedItemPosition() == 1) score += 0;
                if (spinner2.getSelectedItemPosition() == 2) score += 10;
                if (spinner2.getSelectedItemPosition() == 3) score += 5;


                if (spinner3.getSelectedItemPosition() == 0) score += 0;
                if (spinner3.getSelectedItemPosition() == 1) score += 10;
                if (spinner3.getSelectedItemPosition() == 2) score += 0;
                if (spinner3.getSelectedItemPosition() == 3) score += 5;


                if (spinner4.getSelectedItemPosition() == 0) score += 0;
                if (spinner4.getSelectedItemPosition() == 1) score += 5;
                if (spinner4.getSelectedItemPosition() == 2) score += 0;
                if (spinner4.getSelectedItemPosition() == 3) score += 10;

                if (k == 0) {
                    k = 1;
                    if (score > 33) {
                        Toast.makeText(Page3.this, "生活狀況", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page3.this)
                                .setTitle("結果:生活狀況")
                                .setMessage("你喜歡思考、富有哲學家的精神，無法忍受漫無目的地一天混過一天，你希望自己生命中的每一分、每一秒都是有意義的，所以你永遠都在問自己：「我的下一步要做什麼？」。")
                                .show();
                        k = 1;
                    } else if (score >= 32) {
                        Toast.makeText(Page3.this, "情感狀況", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page3.this)
                                .setTitle("結果:情感狀況")
                                .setMessage("你對「情」是很看重的，而且無論親情、愛情、友情都一樣，缺錢對你來說並不是什麼大問題，因為你淡泊名利，但是沒有「情」的日子你絕對過不下去，對每個人都會真心付出。")
                                .show();
                        k = 1;
                    } else if (score >= 24) {
                        Toast.makeText(Page3.this, "財務狀況", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page3.this)
                                .setTitle("結果:財務狀況")
                                .setMessage("你的腦子裡有無數個夢想，所以你希望在很短時間裡得到一大筆錢，無論是自己辛苦賺的或天上掉下來的都好，如此才能讓你立刻放下一切，毫無後顧之憂地去做自己想做的事。")
                                .show();
                        k = 1;
                    } else if (score >= 16) {
                        Toast.makeText(Page3.this, "工作狀況", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page3.this)
                                .setTitle("結果:工作狀況")
                                .setMessage("無論別人覺得你的工作表現好不好，其實只有你最清楚自己的工作狀況，有一些難以突破的障礙一直困擾著你，或許你該找一位值得信任的長輩商討對策，別再自我設限了。")
                                .show();
                        k = 1;
                    } else if (score >= 8) {
                        Toast.makeText(Page3.this, "身體狀況", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page3.this)
                                .setTitle("結果:身體狀況")
                                .setMessage("長期疲勞和精神壓力，讓你的身體發出或大或小的各種警訊，例如莫名的頭痛或渾身不對勁，你必須嚴肅地看待它們，並儘快找出解決之道，否則惡化速度會出乎你的想像。")
                                .show();
                        k =  1;
                    }
                } else

                    Toast.makeText(Page3.this, "不允許二次提交!", Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}