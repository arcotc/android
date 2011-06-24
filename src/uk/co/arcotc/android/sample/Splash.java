package uk.co.arcotc.android.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        TextView textViewTopTitle = (TextView) findViewById(R.id.textViewTopTitle);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.splash_fade_in);
        fadeIn.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationStart(Animation arg0) {
				// Empty
			}
			
			@Override
			public void onAnimationRepeat(Animation arg0) {
				// Empty
			}
			
            public void onAnimationEnd(Animation animation) {
                fadeOutSplash((TextView) findViewById(R.id.textViewTopTitle));
            }
        });
        textViewTopTitle.startAnimation(fadeIn);
    }

	private void fadeOutSplash(TextView textViewTopTitle) {
		Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.splash_fade_out);
        fadeOut.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationStart(Animation arg0) {
				// Empty
			}
			
			@Override
			public void onAnimationRepeat(Animation arg0) {
				// Empty
			}
			
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(Splash.this, Menu.class));
            }
        });
        textViewTopTitle.startAnimation(fadeOut);
        Splash.this.finish();
	}

    @Override
    protected void onPause() {
        super.onPause();
        // Stop the animation
        TextView textViewTopTitle = (TextView) findViewById(R.id.textViewTopTitle);
        textViewTopTitle.clearAnimation();
//        TextView logo2 = (TextView) findViewById(R.id.textViewBottomTitle);
//        logo2.clearAnimation();
        // ... stop other animations
    }
}