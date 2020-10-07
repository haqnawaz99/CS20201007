package org.haqnawaz.cs20201007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Call(View view){
       /* Uri uri = Uri.parse("tel:+92334037449");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);*/

        /*Uri uri = Uri.parse("http://www.haqnawaz.org");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);*/


        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
