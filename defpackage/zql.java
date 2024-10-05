package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zql {
    public static final float[] a = new float[16];
    public static final float[] b = new float[16];
    final arz c;
    final float d;
    final float[] e;
    final aogi f;
    final zpe g;
    final int h;
    final int i;

    public zql(arz arzVar, float f, float[] fArr, aogi aogiVar, zpe zpeVar, int i, int i2) {
        arzVar.getClass();
        this.c = arzVar;
        this.d = f;
        fArr.getClass();
        this.e = fArr;
        this.f = aogiVar;
        this.g = zpeVar;
        this.h = i;
        this.i = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zql a(Bitmap bitmap, arz arzVar, float[] fArr, aogi aogiVar, zpe zpeVar, int i, int i2) {
        int i3 = arzVar.a;
        int i4 = arzVar.b;
        GLES20.glBindTexture(i4, i3);
        GLUtils.texImage2D(i4, 0, bitmap, 0);
        art.d("glTexImage2D");
        art.e();
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
        return new zql(arzVar, bitmap.getWidth() / bitmap.getHeight(), fArr, aogiVar, zpeVar, i, i2);
    }
}
