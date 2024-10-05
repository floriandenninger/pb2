package defpackage;

import android.view.ScaleGestureDetector;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zoc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private final zob a;

    public zoc(zob zobVar) {
        zobVar.getClass();
        this.a = zobVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.mo(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
