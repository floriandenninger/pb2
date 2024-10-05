package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.util.Property;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.camera.RotateLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znr extends AnimatorListenerAdapter {
    final /* synthetic */ Property a;
    final /* synthetic */ Property b;
    final /* synthetic */ float c;
    final /* synthetic */ znv d;

    public znr(znv znvVar, Property property, Property property2, float f) {
        this.d = znvVar;
        this.a = property;
        this.b = property2;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.set(this.d.an, Float.valueOf(0.0f));
        this.b.set(this.d.an, Float.valueOf(this.c));
        ViewGroup.LayoutParams layoutParams = this.d.am.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.d.al.getLayoutParams();
        Resources resources = this.d.al.getResources();
        znv znvVar = this.d;
        int i = znvVar.ar;
        if (i == 0 || i == 180) {
            layoutParams.width = znvVar.af.getWidth();
            layoutParams2.width = layoutParams.width;
            this.d.al.setBackgroundColor(resources.getColor(R.color.camera_header_background));
        } else {
            layoutParams.width = znvVar.af.getHeight();
            layoutParams2.width = this.d.o(resources, 0);
            this.d.al.setBackgroundResource(R.drawable.camera_header_landscape_background);
        }
        znv znvVar2 = this.d;
        RotateLayout rotateLayout = znvVar2.an;
        int i2 = znvVar2.ar % 360;
        if (rotateLayout.a == i2) {
            return;
        }
        rotateLayout.a = i2;
        rotateLayout.requestLayout();
    }
}
