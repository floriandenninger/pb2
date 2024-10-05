package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdf extends pou {
    private static final Object a = new Object();
    private final long b;
    private final long c;
    private final boolean e;
    private final pnd f;
    private final pnb g;

    static {
        pmx pmxVar = new pmx();
        pmxVar.b("SinglePeriodTimeline");
        pmxVar.a = Uri.EMPTY;
        pmxVar.a();
    }

    public bdf(long j, boolean z, boolean z2, pnd pndVar) {
        pnb pnbVar = z2 ? pndVar.c : null;
        this.b = j;
        this.c = j;
        this.e = z;
        pse.c(pndVar);
        this.f = pndVar;
        this.g = pnbVar;
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        pse.i(i, 1);
        posVar.e(null, z ? a : null, this.b, 0L);
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        pse.i(i, 1);
        potVar.e(pot.a, this.f, -9223372036854775807L, -9223372036854775807L, this.e, false, this.g, 0L, this.c, 0L);
        return potVar;
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        return a.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.pou
    public final int g() {
        return 1;
    }

    @Override // defpackage.pou
    public final int h() {
        return 1;
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        pse.i(i, 1);
        return a;
    }
}
