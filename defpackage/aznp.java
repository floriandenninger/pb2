package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznp implements ayqk {
    final /* synthetic */ aznq a;
    private final ayqk b;

    public aznp(aznq aznqVar, ayqk ayqkVar) {
        this.a = aznqVar;
        this.b = ayqkVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        Object a;
        aznq aznqVar = this.a;
        ayrv ayrvVar = aznqVar.b;
        if (ayrvVar != null) {
            try {
                a = ayrvVar.a(th);
            } catch (Throwable th2) {
                aynu.c(th2);
                this.b.b(new ayrf(th, th2));
                return;
            }
        } else {
            a = aznqVar.c;
        }
        if (a == null) {
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.b.b(nullPointerException);
            return;
        }
        this.b.sc(a);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.b.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.b.se(ayqxVar);
    }
}
