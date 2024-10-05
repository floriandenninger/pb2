package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqj implements baqr {
    public final int a;
    public final int b;
    public final Matrix c;
    public final Handler d;
    public final bara e;
    public final baqi f;
    private final int g;
    private final int h;
    private final int i;
    private final bapp j;
    private final int k;

    public baqj(int i, int i2, int i3, int i4, int i5, int i6, Matrix matrix, Handler handler, bara baraVar, final baqi baqiVar) {
        this.a = i;
        this.b = i2;
        this.g = i3;
        this.h = i4;
        this.k = i5;
        this.i = i6;
        this.c = matrix;
        this.d = handler;
        this.e = baraVar;
        this.j = new bapp(new Runnable() { // from class: baqe
            @Override // java.lang.Runnable
            public final void run() {
                baqi.this.a();
            }
        });
        this.f = baqiVar;
    }

    @Override // defpackage.baqr
    public final int a() {
        return this.i;
    }

    @Override // defpackage.baqr
    public final Matrix b() {
        return this.c;
    }

    @Override // defpackage.baqr
    public final int c() {
        return this.k;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.g, (r4 - (i2 + i4)) / this.h);
        matrix.preScale(i3 / this.g, i4 / this.h);
        int round = Math.round((this.a * i3) / this.g);
        int round2 = Math.round((this.b * i4) / this.h);
        Matrix matrix2 = new Matrix(this.c);
        matrix2.preConcat(matrix);
        retain();
        return new baqj(round, round2, i5, i6, this.k, this.i, matrix2, this.d, this.e, new baqh(this));
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return 0;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        return this.h;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        return this.g;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        this.f.b();
        this.j.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        this.f.c();
        this.j.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) aype.v(this.d, new Callable() { // from class: baqf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                baqj baqjVar = baqj.this;
                return baqjVar.e.a(baqjVar);
            }
        });
    }
}
