package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmv implements ayqk {
    final ayqk a;
    final /* synthetic */ azmw b;

    public azmv(azmw azmwVar, ayqk ayqkVar) {
        this.b = azmwVar;
        this.a = ayqkVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            this.b.b.a(obj);
            this.a.sc(obj);
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.a.se(ayqxVar);
    }
}
