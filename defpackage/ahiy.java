package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahiy extends ahfr {
    protected static final float[] m = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private final Surface i;
    private final SurfaceTexture j;
    private final azrw k;
    public float n;
    private final int[] o;
    private Canvas p;
    private boolean q;

    public ahiy(float f, float f2, ahku ahkuVar, ahkv ahkvVar, azrw azrwVar) {
        super(ahkuVar, ahkvVar, azrwVar);
        this.k = azrwVar;
        int[] iArr = new int[1];
        this.o = iArr;
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, iArr, 0);
        ahkt.g(iArr[0]);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        this.j = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(s(f), s(f2));
        this.i = new Surface(surfaceTexture);
        this.n = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int s(float f) {
        return Math.round(f / 0.1f);
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public void i() {
        this.i.release();
        this.j.release();
        super.i();
    }

    @Override // defpackage.ahfr
    protected final boolean m() {
        return true;
    }

    @Override // defpackage.ahfr
    public final void n() {
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glBindTexture(36197, this.o[0]);
        GLES20.glUniform1f(((ahob) this.k.get()).i, this.n);
        GLES20.glUniform2f(((ahnz) this.k.get()).b, 1.0f, 1.0f);
        GLES20.glUniform2f(((ahnz) this.k.get()).d, 0.0f, 0.0f);
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public void q(ahjq ahjqVar) {
        super.q(ahjqVar);
        if (this.q) {
            this.j.updateTexImage();
            this.q = false;
        }
    }

    public final Canvas t() {
        this.p = null;
        if (this.i.isValid()) {
            Canvas lockCanvas = this.i.lockCanvas(null);
            this.p = lockCanvas;
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(float f, float f2) {
        this.j.setDefaultBufferSize(s(f), s(f2));
    }

    public final void x() {
        Canvas canvas = this.p;
        if (canvas != null) {
            this.i.unlockCanvasAndPost(canvas);
            this.q = true;
        }
        this.p = null;
    }
}
