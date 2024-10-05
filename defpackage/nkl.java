package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkl {
    private final aaea a;
    private final amnv b;

    public nkl(aaea aaeaVar, amnv amnvVar) {
        this.a = aaeaVar;
        this.b = amnvVar;
    }

    public final boolean a() {
        aswb aswbVar = this.a.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        boolean z = aswbVar.ap;
        aswb aswbVar2 = this.a.a().e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return z && (aswbVar2.at || !((Boolean) this.b.get()).booleanValue());
    }
}
