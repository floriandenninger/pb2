package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahij implements SurfaceTexture.OnFrameAvailableListener, ahky {
    public final int a;
    public SurfaceTexture c;
    public boolean d;
    public long e;
    private final ahks f;
    private final Handler h;
    private final Surface i;
    private final ahii g = new ahii(this);
    public final float[] b = new float[16];

    public ahij(Handler handler, ahks ahksVar) {
        this.h = handler;
        this.f = ahksVar;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        ahkt.g(iArr[0]);
        int i = iArr[0];
        this.a = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.c = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.i = new Surface(this.c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
    }

    @Override // defpackage.ahky
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.ahky
    public final int b() {
        return 0;
    }

    @Override // defpackage.ahky
    public final long c() {
        return this.e;
    }

    @Override // defpackage.ahky
    public final ahlp d() {
        return null;
    }

    @Override // defpackage.ahky
    public final /* synthetic */ ByteBuffer e() {
        return null;
    }

    @Override // defpackage.ahky
    public final void f() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.a);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahky
    public final void g() {
        this.h.obtainMessage(0, this.i).sendToTarget();
    }

    @Override // defpackage.ahky
    public final void h() {
        if (this.d) {
            this.d = false;
            onFrameAvailable(null);
        }
    }

    @Override // defpackage.ahky
    public final float[] i() {
        return this.b;
    }

    @Override // defpackage.ahky
    public final int j() {
        return 1;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f.b(this.g);
    }
}
