package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ckp {
    private static aeh d;
    private static final Interpolator c = new LinearInterpolator();
    static final clg a = clg.a("t", "s", "e", "o", "i", "h", "to", "ti");
    static final clg b = clg.a("x", "y");

    ckp() {
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator linearInterpolator;
        pointF.x = cln.b(pointF.x, -1.0f, 1.0f);
        pointF.y = cln.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = cln.b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = cln.b(pointF2.y, -100.0f, 100.0f);
        int d2 = cls.d(pointF.x, pointF.y, pointF2.x, pointF2.y);
        synchronized (ckp.class) {
            if (d == null) {
                d = new aeh();
            }
            weakReference = (WeakReference) d.e(d2);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                linearInterpolator = jg.o(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = jg.o(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (ckp.class) {
                    d.k(d2, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.clt a(defpackage.clh r21, defpackage.cfj r22, float r23, defpackage.cld r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckp.a(clh, cfj, float, cld, boolean, boolean):clt");
    }
}
