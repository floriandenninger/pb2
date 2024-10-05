package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azn implements azy {
    public final MediaCodec a;
    public final azs b;
    public final azq c;
    public int d = 0;
    private final boolean e;
    private boolean f;

    public azn(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.a = mediaCodec;
        this.b = new azs(handlerThread);
        this.c = new azq(mediaCodec, handlerThread2, z);
        this.e = z2;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    private final void q() {
        if (this.e) {
            try {
                this.c.b();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.azy
    public final int a() {
        int i;
        azs azsVar = this.b;
        synchronized (azsVar.a) {
            i = -1;
            if (!azsVar.d()) {
                azsVar.b();
                if (!azsVar.d.d()) {
                    i = azsVar.d.a();
                }
            }
        }
        return i;
    }

    @Override // defpackage.azy
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int i;
        azs azsVar = this.b;
        synchronized (azsVar.a) {
            i = -1;
            if (!azsVar.d()) {
                azsVar.b();
                if (!azsVar.e.d()) {
                    int a = azsVar.e.a();
                    i = -2;
                    if (a >= 0) {
                        pse.d(azsVar.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) azsVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (a == -2) {
                        azsVar.h = (MediaFormat) azsVar.g.remove();
                    }
                    i = a;
                }
            }
        }
        return i;
    }

    @Override // defpackage.azy
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        azs azsVar = this.b;
        synchronized (azsVar.a) {
            mediaFormat = azsVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.azy
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.azy
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.azy
    public final void g() {
        this.c.c();
        this.a.flush();
        final azs azsVar = this.b;
        final MediaCodec mediaCodec = this.a;
        mediaCodec.getClass();
        final Runnable runnable = new Runnable() { // from class: azk
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        };
        synchronized (azsVar.a) {
            azsVar.i++;
            Handler handler = azsVar.c;
            int i = pts.a;
            handler.post(new Runnable() { // from class: azr
                @Override // java.lang.Runnable
                public final void run() {
                    azs azsVar2 = azs.this;
                    Runnable runnable2 = runnable;
                    synchronized (azsVar2.a) {
                        if (!azsVar2.j) {
                            long j = azsVar2.i - 1;
                            azsVar2.i = j;
                            if (j <= 0) {
                                if (j < 0) {
                                    azsVar2.c(new IllegalStateException());
                                } else {
                                    azsVar2.a();
                                    try {
                                        runnable2.run();
                                    } catch (IllegalStateException e) {
                                        azsVar2.c(e);
                                    } catch (Exception e2) {
                                        azsVar2.c(new IllegalStateException(e2));
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.azy
    public final void h() {
        try {
            if (this.d == 1) {
                azq azqVar = this.c;
                if (azqVar.g) {
                    azqVar.c();
                    azqVar.d.quit();
                }
                azqVar.g = false;
                azs azsVar = this.b;
                synchronized (azsVar.a) {
                    azsVar.j = true;
                    azsVar.b.quit();
                    azsVar.a();
                }
            }
            this.d = 2;
        } finally {
            if (!this.f) {
                this.a.release();
                this.f = true;
            }
        }
    }

    @Override // defpackage.azy
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.azy
    public final void j(Surface surface) {
        q();
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.azy
    public final void k(Bundle bundle) {
        q();
        this.a.setParameters(bundle);
    }

    @Override // defpackage.azy
    public final void l(int i) {
        q();
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.azy
    public final boolean m() {
        return false;
    }

    @Override // defpackage.azy
    public final void n(int i, int i2, long j, int i3) {
        azq azqVar = this.c;
        azqVar.d();
        azp a = azq.a();
        a.a(i, i2, j, i3);
        Handler handler = azqVar.e;
        int i4 = pts.a;
        handler.obtainMessage(0, a).sendToTarget();
    }

    @Override // defpackage.azy
    public final void o(int i, ass assVar, long j) {
        azq azqVar = this.c;
        azqVar.d();
        azp a = azq.a();
        a.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = a.d;
        cryptoInfo.numSubSamples = assVar.f;
        cryptoInfo.numBytesOfClearData = azq.g(assVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = azq.g(assVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) pse.c(azq.f(assVar.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) pse.c(azq.f(assVar.a, cryptoInfo.iv));
        cryptoInfo.mode = assVar.c;
        if (pts.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(assVar.g, assVar.h));
        }
        azqVar.e.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.azy
    public final void p(int i) {
        this.a.releaseOutputBuffer(i, false);
    }
}
