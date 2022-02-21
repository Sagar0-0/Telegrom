package com.example.android.telegrom;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;

public class SplashScreen extends AppCompatActivity {

    ImageView background;
    LottieAnimationView lottieAnimationView;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        background=findViewById(R.id.splash_background);
        lottieAnimationView=findViewById(R.id.lottie_animation);

        background.animate().translationY(-3000).setDuration(1000).setStartDelay(4500);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4500);

        Handler handler=new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this,HomeActivity.class));
            finish();
        },3200);
    }
}