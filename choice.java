/*
* citytour 관광앱 중 관광지 고르는 부분
*/

package com.example.ws.citytour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choice extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Button button1=(Button) findViewById(R.id.btnGangdong);
        Button button2=(Button) findViewById(R.id.btnKuniv);
        Button button3=(Button) findViewById(R.id.btnSuniv);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.diningcode.com/list.php?query=%EA%B0%95%EB%8F%99%EA%B5%AC"));
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://goo.gl/IJJdmZ"));
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://goo.gl/iTn5H1"));
                startActivity(intent);

            }
        });



    }



}
