package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sff implements anhh {
    final /* synthetic */ anhy a;
    final /* synthetic */ sfh b;

    public sff(sfh sfhVar, anhy anhyVar) {
        this.b = sfhVar;
        this.a = anhyVar;
    }

    private final void c() {
        synchronized (this.b) {
            this.b.a.remove(this.a);
        }
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        c();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        c();
    }
}
