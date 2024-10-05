package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvn implements anhh {
    final /* synthetic */ alcb a;
    final /* synthetic */ afsx b;
    final /* synthetic */ akvq c;

    public akvn(akvq akvqVar, alcb alcbVar, afsx afsxVar) {
        this.c = akvqVar;
        this.a = alcbVar;
        this.b = afsxVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.c.p.e("Failed to add normal job.", th);
        zga.f("UploadEngine", "Failed to add normal job.", th);
        this.c.i.g(this.a.b, this.b.d(), avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
        ((akze) this.c.l.get()).A(this.a.b);
        this.c.j.c(this.a.b);
    }
}
