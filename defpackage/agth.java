package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agth {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final aadw d;

    public agth(aadw aadwVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.d = aadwVar;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public final agtg a(agnm agnmVar) {
        if (((agof) this.a.get()).a().q().equals("NO_OP_STORE_TAG")) {
            return null;
        }
        apwy b = this.d.b();
        if ((b.b & 65536) == 0) {
            return null;
        }
        atoy atoyVar = b.m;
        if (atoyVar == null) {
            atoyVar = atoy.a;
        }
        int i = atoyVar.d;
        if (i == 1) {
            return ((agta) this.b.get()).a(agnmVar);
        }
        if (i == 2) {
            return ((agte) this.c.get()).a(agnmVar);
        }
        if (i != 3) {
            return null;
        }
        agtg a = ((agta) this.b.get()).a(agnmVar);
        ((agte) this.c.get()).a(agnmVar);
        return new agtg(a.a, a.b, 4, a.c);
    }
}
