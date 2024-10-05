package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvx implements nxm {
    private final nwy a;

    public nvx(nwy nwyVar) {
        this.a = nwyVar;
    }

    @Override // defpackage.nxm
    public final nxh a(nxu nxuVar, int i) {
        nxu nxuVar2 = nxu.NO_FLING;
        int ordinal = nxuVar.ordinal();
        if (ordinal == 0) {
            return i < this.a.b().centerY() ? nxh.FULL_BLEED : nxh.HIDDEN;
        }
        if (ordinal == 1) {
            return nxh.FULL_BLEED;
        }
        if (ordinal == 2) {
            return nxh.HIDDEN;
        }
        throw new AssertionError(nxuVar);
    }

    @Override // defpackage.nxm
    public final nxh b(boolean z, amsx amsxVar) {
        return nxh.FULL_BLEED;
    }

    @Override // defpackage.nxm
    public final nxh c(nxh nxhVar) {
        return nxh.HIDDEN;
    }

    @Override // defpackage.nxm
    public final ammv d(boolean z, amsx amsxVar) {
        return ammv.j(nxh.FULL_BLEED);
    }
}
