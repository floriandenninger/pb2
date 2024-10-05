package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmc implements baqr {
    public Handler a;
    public boolean b;
    public acnc c;
    private final int d;
    private final int e;
    private final int f;
    private final Matrix g;
    private final acoo h;
    private final Runnable i;
    private final Object j = new Object();
    private int k;

    public acmc(int i, int i2, int i3, Matrix matrix, acoo acooVar, Runnable runnable) {
        boolean z = false;
        if (i > 0 && i2 > 0) {
            z = true;
        }
        amkq.E(z);
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = matrix;
        this.h = acooVar;
        this.i = runnable;
        this.k = 1;
    }

    @Override // defpackage.baqr
    public final int a() {
        return this.f;
    }

    @Override // defpackage.baqr
    public final Matrix b() {
        Matrix matrix = this.g;
        return matrix == null ? new Matrix() : matrix;
    }

    @Override // defpackage.baqr
    public final int c() {
        return 2;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.g);
        matrix.postScale(i3 / this.d, i4 / this.e);
        matrix.postTranslate(i / this.d, i2 / this.e);
        return new acmc(i5, i6, this.f, matrix, this.h, new acmb(this, 0));
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return 0;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        return this.e;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        return this.d;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        int i;
        Handler handler;
        synchronized (this.j) {
            i = this.k - 1;
            this.k = i;
        }
        if (i == 0) {
            Runnable runnable = this.i;
            if (runnable != null) {
                runnable.run();
            }
            if (this.c == null || (handler = this.a) == null) {
                return;
            }
            handler.post(new acmb(this, 1));
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        synchronized (this.j) {
            this.k++;
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        this.b = true;
        final acoo acooVar = this.h;
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        aype.v(acooVar.b, new Callable() { // from class: acon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                acoo acooVar2 = acoo.this;
                VideoFrame.I420Buffer[] i420BufferArr2 = i420BufferArr;
                VideoFrame.I420Buffer a = acooVar2.c.a(this);
                i420BufferArr2[0] = a;
                return a;
            }
        });
        return i420BufferArr[0];
    }
}
