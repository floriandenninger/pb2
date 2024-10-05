package defpackage;

import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfd implements axfa {
    private final GvrAudioSurround a;
    private final float[] b;
    private final axfg c;

    public axfd(int i, int i2, axfg axfgVar, int i3) {
        axfq.c(i > 0);
        axfq.c(true);
        axfq.c(true);
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11 || i2 == 16 || i2 == 18) {
            this.b = new float[4];
            this.c = axfgVar;
            this.a = new GvrAudioSurround(i3, i, i2, 1024);
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Number of input channels (");
            sb.append(i2);
            sb.append(") is not supported");
            throw new axfe(sb.toString());
        }
    }

    private final void e() {
        this.c.a(this.b);
        GvrAudioSurround gvrAudioSurround = this.a;
        float[] fArr = this.b;
        gvrAudioSurround.updateNativeOrientation(fArr[3], fArr[0], fArr[1], fArr[2]);
    }

    @Override // defpackage.axfa
    public final void a() {
        this.a.flush();
    }

    @Override // defpackage.axfa
    public final boolean b(ByteBuffer byteBuffer) {
        e();
        return !byteBuffer.hasRemaining();
    }

    @Override // defpackage.axfa
    public final boolean c(ByteBuffer byteBuffer) {
        e();
        if (byteBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.axfa
    public final void d() {
    }
}
