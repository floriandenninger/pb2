package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zip implements anhh {
    final /* synthetic */ ayue a;

    public zip(ayue ayueVar) {
        this.a = ayueVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        if (this.a.e()) {
            return;
        }
        this.a.a();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.a.e()) {
            return;
        }
        this.a.c(th);
    }
}
