package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkn implements pkd, bgv, ahky {
    private final int[] a;
    private final float[] b;
    private final Handler c;
    private final AtomicReference d;
    private int e = 2;
    private float f;
    private ahlp g;
    private long h;
    private ByteBuffer i;

    public ahkn(Handler handler) {
        int[] iArr = new int[3];
        this.a = iArr;
        this.c = handler;
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            ahkt.g(this.a[i]);
        }
        this.d = new AtomicReference();
        float[] fArr = new float[16];
        this.b = fArr;
        Matrix.setIdentityM(fArr, 0);
        fArr[5] = -1.0f;
        fArr[13] = 1.0f;
    }

    @Override // defpackage.ahky
    public final float a() {
        return this.f;
    }

    @Override // defpackage.ahky
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ahky
    public final long c() {
        return this.h;
    }

    @Override // defpackage.ahky
    public final ahlp d() {
        return this.g;
    }

    @Override // defpackage.ahky
    public final ByteBuffer e() {
        return this.i;
    }

    @Override // defpackage.ahky
    public final void f() {
        ahlq ahlqVar = (ahlq) this.d.getAndSet(null);
        int i = 0;
        while (i < 3) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.a[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (ahlqVar != null) {
                int a = i == 0 ? ahlqVar.a() : (ahlqVar.a() + 1) / 2;
                GLES20.glPixelStorei(3317, 1);
                int i2 = ahlqVar.c()[i];
                VpxOutputBuffer vpxOutputBuffer = ahlqVar.b;
                GLES20.glTexImage2D(3553, 0, 6409, i2, a, 0, 6409, 5121, (vpxOutputBuffer != null ? vpxOutputBuffer.yuvPlanes : ahlqVar.c.yuvPlanes)[i]);
            }
            i++;
        }
        if (ahlqVar == null) {
            return;
        }
        VpxOutputBuffer vpxOutputBuffer2 = ahlqVar.b;
        this.e = vpxOutputBuffer2 != null ? vpxOutputBuffer2.colorspace : ahlqVar.c.colorspace;
        this.g = ahlqVar.d;
        this.f = ((vpxOutputBuffer2 != null ? vpxOutputBuffer2.width : ahlqVar.c.width) - 0.5f) / ahlqVar.c()[0];
        VpxOutputBuffer vpxOutputBuffer3 = ahlqVar.b;
        this.h = vpxOutputBuffer3 != null ? vpxOutputBuffer3.timestampUs : ahlqVar.c.timeUs;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = ahlqVar.c;
        ByteBuffer byteBuffer = videoDecoderOutputBuffer != null ? videoDecoderOutputBuffer.supplementalData : null;
        if (byteBuffer != null) {
            int limit = byteBuffer.limit();
            ByteBuffer byteBuffer2 = this.i;
            if (byteBuffer2 == null || byteBuffer2.capacity() < limit) {
                this.i = ByteBuffer.allocate(limit);
            }
            this.i.put(byteBuffer);
        }
        ahlqVar.b();
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahky
    public final void g() {
        this.c.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.ahky
    public final void h() {
    }

    @Override // defpackage.ahky
    public final float[] i() {
        return this.b;
    }

    @Override // defpackage.ahky
    public final int j() {
        return 2;
    }

    public final void k() {
        GLES20.glDeleteTextures(3, this.a, 0);
        Boolean bool = ahkt.a;
        for (int i = 0; i < 3; i++) {
            this.a[i] = 0;
        }
    }

    public final synchronized void l(ahlq ahlqVar) {
        ahlq ahlqVar2 = (ahlq) this.d.getAndSet(ahlqVar);
        if (ahlqVar2 != null) {
            ahlqVar2.b();
        }
    }

    @Override // defpackage.bgv
    public final synchronized void rH(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ahlq ahlqVar = (ahlq) ahlq.a.a();
        if (ahlqVar == null) {
            ahlqVar = new ahlq();
        }
        ahlqVar.b = null;
        videoDecoderOutputBuffer.getClass();
        ahlqVar.c = videoDecoderOutputBuffer;
        asf asfVar = videoDecoderOutputBuffer.format.z;
        if (asfVar != null) {
            ahlqVar.d = new ahlp(asfVar);
        } else {
            ahlqVar.d = null;
        }
        l(ahlqVar);
    }

    @Override // defpackage.pkd
    public final synchronized void rI(VpxOutputBuffer vpxOutputBuffer) {
        ahlq ahlqVar = (ahlq) ahlq.a.a();
        if (ahlqVar == null) {
            ahlqVar = new ahlq();
        }
        vpxOutputBuffer.getClass();
        ahlqVar.b = vpxOutputBuffer;
        ahlqVar.c = null;
        ColorInfo colorInfo = vpxOutputBuffer.colorInfo;
        if (colorInfo != null) {
            ahlqVar.d = new ahlp(colorInfo);
        } else {
            ahlqVar.d = null;
        }
        l(ahlqVar);
    }
}
