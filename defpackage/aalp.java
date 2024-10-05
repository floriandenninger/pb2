package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalp extends aalr {
    private final aaea b;

    public aalp(shf shfVar, aaea aaeaVar) {
        super(shfVar);
        this.b = aaeaVar;
    }

    @Override // defpackage.aalr, defpackage.aals
    public final synchronized void a(String str, String str2) {
        arfd a = this.b.a();
        if (a != null) {
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.I) {
                super.a(str, str2);
                return;
            }
        }
        this.a.clear();
    }
}
