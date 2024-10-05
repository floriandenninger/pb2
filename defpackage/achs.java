package defpackage;

import android.view.ScaleGestureDetector;

/* compiled from: PG */
/* loaded from: classes.dex */
final class achs extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ acht a;

    public achs(acht achtVar) {
        this.a = achtVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        achq achqVar = this.a.aj;
        if (achqVar == null) {
            return true;
        }
        ((acif) achqVar).e.aP(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
