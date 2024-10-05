package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rst implements anhh {
    final /* synthetic */ Throwable a;
    final /* synthetic */ rsv b;

    public rst(rsv rsvVar, Throwable th) {
        this.b = rsvVar;
        this.a = th;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.h.j(false);
        this.b.b(this.a, null, "Google credential deposit failed. 3P token deleted.");
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.b.h.j(false);
        this.b.b(th, null, "Google credential deposit failed. Failed to delete 3P token.");
    }
}
