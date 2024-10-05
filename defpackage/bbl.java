package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbl extends pou {
    private final pnd a;

    public bbl(pnd pndVar) {
        this.a = pndVar;
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        posVar.i(z ? 0 : null, z ? bbk.b : null, -9223372036854775807L, 0L, asb.a, true);
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        potVar.e(pot.a, this.a, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
        potVar.l = true;
        return potVar;
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        return obj == bbk.b ? 0 : -1;
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
        return bbk.b;
    }
}
