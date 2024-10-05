package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aldw implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ aldq b;
    final /* synthetic */ aldo c;
    final /* synthetic */ aldy d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;
    final /* synthetic */ String g;
    final /* synthetic */ anhy h;
    final /* synthetic */ aldz i;

    public aldw(aldz aldzVar, String str, aldq aldqVar, aldo aldoVar, aldy aldyVar, long j, boolean z, String str2, anhy anhyVar) {
        this.i = aldzVar;
        this.a = str;
        this.b = aldqVar;
        this.c = aldoVar;
        this.d = aldyVar;
        this.e = j;
        this.f = z;
        this.g = str2;
        this.h = anhyVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.i.f(this.a, (akwp) obj, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        akzs akzsVar;
        if (this.h.isCancelled()) {
            String.valueOf(this.g).concat(" interrupted because the Future was cancelled");
            return;
        }
        if (this.c.a()) {
            try {
                akzsVar = this.i.d.b(this.a);
            } catch (akwn e) {
                this.i.f.e("Unexeptected missing job while evaluating interruption.", e);
                zga.f("UploadTaskController", "Unexeptected missing job while evaluating interruption.", e);
                akzsVar = null;
            }
            if (akzsVar != null && akzsVar.t && !akzsVar.u) {
                String.valueOf(this.g).concat(" interrupted because the Future was interrupted.");
                return;
            }
        }
        this.i.f(this.a, this.b.m(th, this.a, this.i.d, !this.f), this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
