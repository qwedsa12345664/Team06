package com.example.one;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class Page2 extends AppCompatActivity {
    static int score = 0, i = 0;

    Button button2,button3;
    Spinner spinner,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8,spinner9,spinner10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button4);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);
        spinner8 = findViewById(R.id.spinner8);
        spinner9 = findViewById(R.id.spinner9);
        spinner10 = findViewById(R.id.spinner10);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItemPosition() == 0) score += 0;
                if (spinner.getSelectedItemPosition() == 1) score += 2;
                if (spinner.getSelectedItemPosition() == 2) score += 4;
                if (spinner.getSelectedItemPosition() == 3) score += 6;

                if (spinner2.getSelectedItemPosition() == 0) score += 0;
                if (spinner2.getSelectedItemPosition() == 1) score += 6;
                if (spinner2.getSelectedItemPosition() == 2) score += 4;
                if (spinner2.getSelectedItemPosition() == 3) score += 7;
                if (spinner2.getSelectedItemPosition() == 4) score += 2;
                if (spinner2.getSelectedItemPosition() == 5) score += 1;

                if (spinner3.getSelectedItemPosition() == 0) score += 0;
                if (spinner3.getSelectedItemPosition() == 1) score += 4;
                if (spinner3.getSelectedItemPosition() == 2) score += 2;
                if (spinner3.getSelectedItemPosition() == 3) score += 5;
                if (spinner3.getSelectedItemPosition() == 4) score += 7;

                if (spinner4.getSelectedItemPosition() == 0) score += 0;
                if (spinner4.getSelectedItemPosition() == 1) score += 7;
                if (spinner4.getSelectedItemPosition() == 2) score += 6;
                if (spinner4.getSelectedItemPosition() == 3) score += 4;
                if (spinner4.getSelectedItemPosition() == 4) score += 2;
                if (spinner4.getSelectedItemPosition() == 5) score += 1;

                if (spinner5.getSelectedItemPosition() == 0) score += 0;
                if (spinner5.getSelectedItemPosition() == 1) score += 4;
                if (spinner5.getSelectedItemPosition() == 2) score += 2;
                if (spinner5.getSelectedItemPosition() == 3) score += 3;
                if (spinner5.getSelectedItemPosition() == 4) score += 5;
                if (spinner5.getSelectedItemPosition() == 5) score += 6;
                if (spinner5.getSelectedItemPosition() == 6) score += 1;

                if (spinner6.getSelectedItemPosition() == 0) score += 0;
                if (spinner6.getSelectedItemPosition() == 1) score += 4;
                if (spinner6.getSelectedItemPosition() == 2) score += 6;
                if (spinner6.getSelectedItemPosition() == 3) score += 2;
                if (spinner6.getSelectedItemPosition() == 4) score += 1;

                if (spinner7.getSelectedItemPosition() == 0) score += 0;
                if (spinner7.getSelectedItemPosition() == 1) score += 6;
                if (spinner7.getSelectedItemPosition() == 2) score += 7;
                if (spinner7.getSelectedItemPosition() == 3) score += 5;
                if (spinner7.getSelectedItemPosition() == 4) score += 4;
                if (spinner7.getSelectedItemPosition() == 5) score += 3;
                if (spinner7.getSelectedItemPosition() == 6) score += 2;
                if (spinner7.getSelectedItemPosition() == 7) score += 1;

                if (spinner8.getSelectedItemPosition() == 0) score += 0;
                if (spinner8.getSelectedItemPosition() == 1) score += 6;
                if (spinner8.getSelectedItemPosition() == 2) score += 2;
                if (spinner8.getSelectedItemPosition() == 3) score += 4;

                if (spinner9.getSelectedItemPosition() == 0) score += 0;
                if (spinner9.getSelectedItemPosition() == 1) score += 6;
                if (spinner9.getSelectedItemPosition() == 2) score += 2;
                if (spinner9.getSelectedItemPosition() == 3) score += 4;

                if (spinner10.getSelectedItemPosition() == 0) score += 0;
                if (spinner10.getSelectedItemPosition() == 1) score += 6;
                if (spinner10.getSelectedItemPosition() == 2) score += 4;
                if (spinner10.getSelectedItemPosition() == 3) score += 3;
                if (spinner10.getSelectedItemPosition() == 4) score += 5;

                if (i == 0) {
                    i = 1;
                    if (score > 60) {
                        Toast.makeText(Page2.this, "傲慢的孤獨者", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:傲慢的孤獨者")
                                .setMessage("你的性格是桀驁的野心家，從骨子裡透出來的傲氣，揚在眉角自信，很像是天蠍座或獅子座。但是你的性格過於孤傲，行事風格以自我為中心，很難考慮到他人的感受，在朋友間常常會讓人不敢靠近。你的內心有很強的支配慾望與控制慾望，你希望能夠得到很大的權利。")
                                .show();
                        i=1;
                    } else if (score >= 60) {
                        Toast.makeText(Page2.this, "吸引人的冒險家", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:吸引人的冒險家")
                                .setMessage("你的性格屬於愛冒險的人，通常大腦的思維非常活躍，喜歡嘗試新鮮的事情，行事風格偏重感性，只要自己覺得可行就會馬上去做，而且通常不計後果。但是往往結果會有很好的驚喜等著你，決策方面果敢而堅決，不會受他人的影響，愛情方面你總能給對方一些驚喜。")
                                .show();
                        i=1;
                    } else if (score >= 50) {
                        Toast.makeText(Page2.this, "平衡而中庸", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:平衡而中庸")
                                .setMessage("你的性格屬於中和性人格，為人有一定的謙遜姿態，但是同時有自己的主見，能夠理解他人，懂得照顧他人的感受，但同時不容許別人侵犯你。你有著很強的自我控制力，你下決心做的事情，一定會成功。很喜歡交朋友，人際關係處理的不錯，常常是朋友圈裡最值得信賴的人物。")
                                .show();
                        i=1;
                    } else if (score >= 40) {
                        Toast.makeText(Page2.this, "以牙還牙的自我保護者", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:以牙還牙的自我保護者")
                                .setMessage("你的內心有著很強的控制欲望，有著對於周圍的生活環境一貫性理解的強烈需求，當環境有一點風吹草動，你就會非常的敏感。對待朋友非常的忠誠，而且你更渴望對方也能夠同樣的態度來重視你。你最接受不了的是好朋友在背後議論你，這樣會讓你傷心欲絕，並因此產生報復的心理。")
                                .show();
                        i=1;
                    } else if (score >= 30) {
                        Toast.makeText(Page2.this, "缺乏信心的挑惕者", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:缺乏信心的挑惕者")
                                .setMessage("你擁有近乎強迫症般的追求完美，有些類似於處女座。行事風格屬於謹慎小心型的，在一件事情沒有完全策劃好之前，你是不敢輕易去做的，這也反映了你缺乏自信心的表現，而且對於做事情的過程也很挑剔，不容許自己犯一點點的錯誤。")
                                .show();
                        i=1;
                    } else if (score >= 20) {
                        Toast.makeText(Page2.this, "內傾性格", Toast.LENGTH_SHORT).show();
                        new AlertDialog.Builder(Page2.this)
                                .setTitle("結果:內傾性格")
                                .setMessage("你屬於那內傾性格，為人比較內向，處事風格有些優柔寡斷，常常害怕犯錯誤，習慣自我反省，社交場所上會很害羞，最害怕麻煩，所以不喜歡參加不必要的活動，也不想認識沒有關係的人。情緒常常處在比較低落的狀態，常常以弟弟、妹妹自稱，希望得到別人的保護與支持。")
                                .show();
                        i=1;
                    }
                }else

                    Toast.makeText(Page2.this,"不允許二次提交!", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}