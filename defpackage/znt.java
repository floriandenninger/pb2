package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.Settings;
import android.util.Property;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znt extends OrientationEventListener {
    final /* synthetic */ znv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znt(znv znvVar, Context context) {
        super(context);
        this.a = znvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = -1;
        if (i == -1 || this.a.ae.I() || this.a.af.getHeight() == 0 || Settings.System.getInt(this.a.af.getContext().getContentResolver(), "accelerometer_rotation", 0) != 1) {
            return;
        }
        int i3 = (i + this.a.at) % 360;
        int[] iArr = znv.a;
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            int i5 = iArr[i4];
            int abs = Math.abs(i3 - i5);
            if (abs > 180) {
                abs = 360 - abs;
            }
            if (abs < 20) {
                i2 = i5;
                break;
            }
            i4++;
        }
        if (i2 >= 0) {
            znv znvVar = this.a;
            if (i2 != znvVar.ar) {
                znvVar.ar = i2;
                znvVar.r(znvVar.d.c());
                int i6 = znvVar.ar;
                float f = 360.0f - i6;
                if (f > 180.0f) {
                    f = -i6;
                }
                znvVar.ai.animate().rotation(f).setDuration(300L).start();
                int i7 = znvVar.an.a;
                Property p = znv.p(i7);
                float n = znvVar.n(i7, false);
                Property p2 = znv.p(znvVar.ar);
                float n2 = znvVar.n(znvVar.ar, false);
                float n3 = znvVar.n(znvVar.ar, true);
                AnimatorSet animatorSet = znvVar.aj;
                if (animatorSet != null && animatorSet.isRunning()) {
                    znvVar.aj.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(znvVar.an, p.getName(), ((Float) p.get(znvVar.an)).floatValue(), n);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(znvVar.an, p2.getName(), n2, n3);
                ofFloat2.addListener(new znr(znvVar, p, p2, n2));
                ofFloat2.addUpdateListener(new znn(znvVar, 1));
                znvVar.aj = new AnimatorSet();
                znvVar.aj.playSequentially(ofFloat, ofFloat2);
                znvVar.aj.start();
            }
        }
    }
}
