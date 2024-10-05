package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzp {
    public final dwr a;
    public final dwr b;
    private pyy c;

    public pzp(dwr dwrVar, dwr dwrVar2) {
        this.a = dwrVar;
        this.b = dwrVar2;
    }

    public final synchronized pyy a(pyx pyxVar) {
        pyy pyyVar = this.c;
        if (pyyVar != null) {
            return pyyVar;
        }
        pyy pyyVar2 = new pyy(pyxVar);
        this.c = pyyVar2;
        return pyyVar2;
    }
}
