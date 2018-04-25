package com.example.administrator.itxiuzhenyuan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button guanbi,denglu,yanzhengbtn,zhucebtn;
    private TextView yanzhengText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*********
 * 隐藏标题栏
 * **/
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        initBtn();


    }

    /**
     * 初始化按钮
     */
    public void initBtn(){
        guanbi=findViewById(R.id.guanbi);
        denglu=findViewById(R.id.denglu);
        yanzhengbtn=findViewById(R.id.yanzhengbtn);
        zhucebtn=findViewById(R.id.zhucebtn);
        guanbi.setOnClickListener(new Buttonlist());
        denglu.setOnClickListener(new Buttonlist());
        yanzhengbtn.setOnClickListener(new Buttonlist());
        denglu.setOnClickListener(new Buttonlist());
        zhucebtn.setOnClickListener(new Buttonlist());

    }
     private class Buttonlist implements View.OnClickListener{

         @Override
         public void onClick(View v) {
             switch (v.getId()){
                 case R.id.guanbi:

                     Toast.makeText(MainActivity.this,"你点击了关闭",Toast.LENGTH_SHORT).show();
                     System.exit(0);
                     break;

                 case R.id.denglu:
                     Toast.makeText(MainActivity.this,"你点击了登陆",Toast.LENGTH_SHORT).show();
                     break;

                 case R.id.yanzhengbtn:
                   //  yanzhengText=findViewById(R.id.yanzheng);
                     yanzhengbtn.setText("60秒");
                     break;
                 case R.id.zhucebtn:
                     Toast.makeText(MainActivity.this,"你点击了注册",Toast.LENGTH_SHORT).show();
                     break;
             }
         }
     }




}
