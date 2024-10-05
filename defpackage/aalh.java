package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aalh implements ayqd {
    private final ayqd a;
    private final aali b;

    public aalh(ayqd ayqdVar, aali aaliVar) {
        this.a = ayqdVar;
        this.b = aaliVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.a.se(new aalg(ayqxVar, this.b));
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
