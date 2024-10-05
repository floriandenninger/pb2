package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmj extends plk {
    private static final long b = TimeUnit.SECONDS.toMicros(1);
    public boolean a = true;
    private final long c;

    public hmj(hrv hrvVar) {
        this.c = TimeUnit.MILLISECONDS.toMicros(hrvVar.a()) + b;
    }

    @Override // defpackage.plk, defpackage.pmv
    public final long a() {
        return this.c;
    }

    @Override // defpackage.plk, defpackage.pmv
    public final boolean b(long j, long j2, float f) {
        return j2 <= this.c;
    }

    @Override // defpackage.plk, defpackage.pmv
    public final boolean c(long j, float f, boolean z, long j2) {
        return this.a ? j >= this.c : super.c(j, f, z, j2);
    }
}
