package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView txtView2;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);


        Log.i(tag: "Lifecycle", msg: "OneCreate called...");


        }

        @Override
        protected void onStart() {
                super.onStart();
                Log.i(tag: "Lifecycle", msg:"onStart() invoked..");
        }

        @Override
        protected void onRestart() {
                super.onRestart();
                Log.i(tag: "Lifecycle", msg:"onRestart() invoked..");
        }

        @Override
        protected void onResume() {
                super.onResume();
                Log.i(tag: "Lifecycle", msg:"onResume() invoked..");
        }

        @Override
        protected void onPause() {
                super.onPause();
                Log.i(tag: "Lifecycle", msg:"onPause() invoked..");
        }

        @Override
        protected void onStop() {
                super.onStop();
                Log.i(tag: "Lifecycle", msg:"onStop() invoked..");
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                Log.i(tag: "Lifecycle", msg:"onDestroy() invoked..");
        }
}
