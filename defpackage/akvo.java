package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvo implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ afsx b;
    final /* synthetic */ akvq c;
    private final /* synthetic */ int d;

    public akvo(akvq akvqVar, String str, afsx afsxVar, int i) {
        this.d = i;
        this.c = akvqVar;
        this.a = str;
        this.b = afsxVar;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        if (this.d != 0) {
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.d == 0) {
            this.c.p.e("Failed to add feedback only job.", th);
            zga.f("UploadEngine", "Failed to add feedback only job.", th);
            this.c.i.g(this.a, this.b.d(), avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
            this.c.j.c(this.a);
            return;
        }
        this.c.p.e("Failed to add reels job.", th);
        zga.f("UploadEngine", "Failed to add reels job.", th);
        this.c.i.g(this.a, this.b.d(), avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED);
        this.c.j.c(this.a);
    }
}
