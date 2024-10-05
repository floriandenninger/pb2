package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bho extends ple {
    private final asw a;
    private final pth b;
    private long c;
    private pol d;

    public bho() {
        super(6);
        this.a = new asw(1);
        this.b = new pth();
    }

    @Override // defpackage.ple
    protected final void K(pms[] pmsVarArr, long j, long j2) {
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        return "application/x-camera-motion".equals(pmsVar.n) ? 4 : 0;
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ple
    protected final void k() {
    }

    @Override // defpackage.ple
    protected final void m(long j, boolean z) {
        this.c = Long.MIN_VALUE;
    }

    @Override // defpackage.poe
    public final void p(long j, long j2) {
        while (!ax() && this.c < 100000 + j) {
            this.a.clear();
            if (af(al(), this.a, 0) != -4 || this.a.isEndOfStream()) {
                return;
            }
            asw aswVar = this.a;
            this.c = aswVar.d;
            if (this.d != null && !aswVar.isDecodeOnly()) {
                this.a.c();
                ByteBuffer byteBuffer = this.a.b;
                int i = pts.a;
                if (byteBuffer.remaining() == 16) {
                    this.b.E(byteBuffer.array(), byteBuffer.limit());
                    this.b.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr[i2] = Float.intBitsToFloat(this.b.e());
                    }
                }
            }
        }
    }

    @Override // defpackage.poe
    public final boolean r() {
        return ax();
    }

    @Override // defpackage.ple, defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 8) {
            this.d = (pol) obj;
        }
    }

    @Override // defpackage.poe
    public final boolean s() {
        return true;
    }
}
