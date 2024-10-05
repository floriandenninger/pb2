package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahjp extends ahfr {
    public Bitmap i;
    public boolean j;
    public float k;
    private final azrw m;
    private final int[] n;
    private boolean o;

    public ahjp(Bitmap bitmap, ahku ahkuVar, ahkv ahkvVar, azrw azrwVar) {
        super(ahkuVar, ahkvVar, azrwVar);
        this.i = bitmap;
        this.m = azrwVar;
        int[] iArr = new int[1];
        this.n = iArr;
        this.k = 1.0f;
        this.j = true;
        GLES20.glGenTextures(1, iArr, 0);
        ahkt.g(iArr[0]);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.i, 0);
    }

    public final void g() {
        this.o = true;
    }

    @Override // defpackage.ahfr
    protected final boolean m() {
        return true;
    }

    @Override // defpackage.ahfr
    public final void n() {
        if (this.i == null || this.n[0] == 0) {
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform1f(((ahob) this.m.get()).i, this.k);
        GLES20.glBindTexture(3553, this.n[0]);
        if (this.o) {
            if (this.j) {
                GLUtils.texImage2D(3553, 0, this.i, 0);
            } else {
                GLUtils.texSubImage2D(3553, 0, 0, 0, this.i);
            }
            this.o = false;
        }
        Boolean bool = ahkt.a;
        this.f.e.a(((ahob) this.m.get()).h);
    }
}
