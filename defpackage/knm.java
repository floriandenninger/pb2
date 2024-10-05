package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class knm implements nun {
    public final boolean a;
    public final azrw b;
    public final azqy c;
    public aypn d;

    public knm(aadw aadwVar, azrw azrwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.a = (asvuVar == null ? asvu.a : asvuVar).cq;
        this.b = azrwVar;
        this.c = azqy.ap();
        this.d = aypn.r();
    }

    public static final boolean b(boolean z, nxh nxhVar) {
        return !z || nxh.HIDDEN.equals(nxhVar);
    }

    private static final boolean c(nqg nqgVar) {
        return nqgVar != null && nqgVar.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (this.a) {
            return b(c(((nqp) this.b.get()).c()), ((nqp) this.b.get()).h().o);
        }
        return true;
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        this.c.c(Boolean.valueOf(c(nqgVar)));
    }
}
