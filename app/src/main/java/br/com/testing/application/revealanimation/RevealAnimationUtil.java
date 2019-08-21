package br.com.testing.application.revealanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewAnimationUtils;

public class RevealAnimationUtil {

    public static void reveal(View v) {

        int cx = v.getWidth() / 2;
        int cy = v.getHeight() / 2;
        float finalRadius = (float) Math.hypot(cx, cy);

        Animator animator = ViewAnimationUtils.createCircularReveal(v, cx, cy, 0, finalRadius);
        v.setVisibility(View.VISIBLE);
        animator.start();
    }

    public static void obscure(final View v) {

        int cx = v.getWidth() / 2;
        int cy = v.getHeight() / 2;
        float initialRadius = (float) Math.hypot(cx, cy);

        Animator animator = ViewAnimationUtils.createCircularReveal(v, cx, cy, initialRadius, 0);
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                v.setVisibility(View.INVISIBLE);
            }
        });

        animator.start();
    }
}
