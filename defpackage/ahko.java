package defpackage;

import android.opengl.Matrix;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrViewerParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahko {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    public final ahkp d;
    public final Eye e;
    public final GvrViewerParams f;

    public ahko(float[] fArr, float[] fArr2, ahkp ahkpVar, Eye eye, GvrViewerParams gvrViewerParams) {
        fArr2.getClass();
        this.b = fArr2;
        this.a = fArr;
        float[] fArr3 = new float[16];
        this.c = fArr3;
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        this.d = ahkpVar;
        this.e = eye;
        this.f = gvrViewerParams;
    }

    public final int a() {
        return this.e.getType();
    }
}
