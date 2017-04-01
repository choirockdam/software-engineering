package com.example.rockdam.class_4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView =(ImageView)findViewById(R.id.iv_like); // 얘가 가져오는거고
        //객체 변수이름 = (형변환)  View가 imageView의 엄마니깐 다운캐스팅   //R이 리소스 .id.
        //View ->BUTTON ,



        imageView.setOnClickListener(this);//MainActivity  얘가 등록



        findViewById(R.id.iv_like).setOnClickListener(this);//얘한줄이 위 두줄이랑 똑같은거야 .자바
       //View                      .setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnTouchListener(this);
  }

    @Override
    public void onClick(View v){//얘가 클릭을하면 매개변수에 //요 매개변수

        switch(v.getId())
        {
            case R.id.iv_like:
                Toast.makeText(MainActivity.this,"I love IRENE",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_share:
                //Toast.makeText(MainActivity.this,"TOGHTER IRENE",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.iv_photo:

            Toast.makeText(MainActivity.this,"hi IRENE",Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
     //   Toast.makeText(MainActivity.this,"I love IRENE",Toast.LENGTH_SHORT).show();
    switch(event.getAction())
    {
        case MotionEvent.ACTION_DOWN:
            Toast.makeText(MainActivity.this,"DOWN IRENE",Toast.LENGTH_SHORT).show();
            break;
        case MotionEvent.ACTION_UP:
            Toast.makeText(MainActivity.this,"UP IRENE",Toast.LENGTH_SHORT).show();
            break;


    }
        return false;// true이면 하위에 있는 이벤트로 간다 .
    }
}
