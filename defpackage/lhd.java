package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lhd {
    private final azrw a;
    private final azrw b;
    private final afsy c;

    public lhd(azrw azrwVar, azrw azrwVar2, afsy afsyVar) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        afsyVar.getClass();
        this.c = afsyVar;
    }

    public final akev a() {
        if (b()) {
            return (akev) this.a.get();
        }
        return (akev) this.b.get();
    }

    public final boolean b() {
        return !this.c.t();
    }
}
