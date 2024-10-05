package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznk implements ayqk {
    final ayqk a;
    final ayrv b;

    public aznk(ayqk ayqkVar, ayrv ayrvVar) {
        this.a = ayqkVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            Object a = this.b.a(obj);
            aysw.b(a, "The mapper function returned a null value.");
            this.a.sc(a);
        } catch (Throwable th) {
            aynu.c(th);
            b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.a.se(ayqxVar);
    }
}
