package defpackage;

import java.nio.ShortBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuc implements vty {
    public final vud a = new vud();
    public final float b;
    public final long c;
    public boolean d;
    private final vub e;
    private boolean f;

    public vuc(vub vubVar, float f, long j) {
        this.e = vubVar;
        this.b = f;
        this.c = (((float) j) / ((float) TimeUnit.SECONDS.toMicros(1L))) * 7056000.0f;
    }

    @Override // defpackage.vty
    public final void a() {
        this.d = true;
        this.e.c();
    }

    @Override // defpackage.vty
    public final void b(ShortBuffer shortBuffer, int i, int i2) {
        if (!this.f) {
            vud vudVar = this.a;
            int i3 = vudVar.a;
            vcp.f(i3 == 0, "ticksPerSample already set (%s)", Integer.valueOf(i3));
            vcp.c(i > 0, "Invalid samplesPerSec (%s)", Integer.valueOf(i));
            vudVar.a = 7056000 / i;
            vud vudVar2 = this.a;
            int b = vlu.b(i2);
            vcp.e(vudVar2.b == 0, "channelCount already set");
            vudVar2.b = b;
            this.f = true;
        }
        vcp.c(i == this.a.c(), "samplesPerSec changed from %s to %s", Integer.valueOf(this.a.c()), Integer.valueOf(i));
        int i4 = this.a.b;
        vcp.c(i2 == i4, "channelCount changed from %s to %s", Integer.valueOf(i4), Integer.valueOf(i2));
        this.a.e(shortBuffer);
        this.e.c();
    }

    public final void c(long j) {
        this.a.f(j);
    }

    public final float d(int i) {
        return this.a.h(i) * this.b;
    }
}
