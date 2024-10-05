package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aexi extends pou {
    private final boolean a;
    private final pnd b;

    public aexi(boolean z, pnd pndVar) {
        this.a = z;
        this.b = pndVar;
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        return obj != aexl.b ? -1 : 0;
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
    public final pos a(int i, pos posVar, boolean z) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        posVar.e(z ? aexl.a : null, z ? aexl.b : null, -9223372036854775807L, 0L);
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = pot.a;
        pnd pndVar = this.b;
        potVar.e(obj, pndVar, -9223372036854775807L, -9223372036854775807L, this.a, true, pndVar.c, 0L, -9223372036854775807L, 0L);
        return potVar;
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        return aexl.b;
    }
}
