package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vti {
    public vth a;
    public ByteBuffer[] b;
    public int c = 1;
    private ByteBuffer[] d;
    private final vur e;

    public vti(vur vurVar, MediaFormat mediaFormat) {
        this.e = vurVar;
        vurVar.i(mediaFormat, null, 1);
    }

    public final Surface a() {
        return this.e.a.createInputSurface();
    }

    public final void b(long j) {
        if (this.c != 2) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int b = this.e.b(bufferInfo, j);
            if (b == -1) {
                return;
            }
            if (b == -3) {
                this.d = this.e.h();
            } else if (b == -2) {
                this.a.b(this, this.e.a.getOutputFormat());
            } else if (b < 0) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Unexpected result from dequeueOutputBuffer: ");
                sb.append(b);
                vtv.b(sb.toString());
            } else {
                this.a.a(this, this.d[b], bufferInfo);
                this.e.d(b, false);
                if ((bufferInfo.flags & 4) != 0) {
                    this.c = 3;
                    return;
                }
            }
        }
    }

    public final void c(long j) {
        this.e.j(this.e.a(-1L), 0, j, 4);
    }

    public final void d(ByteBuffer byteBuffer, int i, long j) {
        int a = this.e.a(-1L);
        if (a < 0) {
            throw new RuntimeException("No input buffer available.");
        }
        ByteBuffer byteBuffer2 = this.b[a];
        byteBuffer2.put(byteBuffer);
        this.e.j(a, i, j, 0);
    }

    public final void e() {
        this.e.c();
    }

    public final void f() {
        this.e.a.signalEndOfInputStream();
    }

    public final void g() {
        this.c = 2;
        this.e.e();
        this.b = this.e.g();
        this.d = this.e.h();
    }

    public final void h() {
        this.c = 4;
        this.e.f();
    }
}
