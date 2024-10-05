package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rss implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ rsv b;

    public rss(rsv rsvVar, String str) {
        this.b = rsvVar;
        this.a = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.h.j(false);
        this.b.g(aorv.STATE_COMPLETE);
        this.b.i(rqr.h(this.a));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        rsv rsvVar = this.b;
        rub rubVar = rsvVar.i;
        rsy rsyVar = rsvVar.c;
        anaf.Y(rubVar.a(rsyVar.e, rsyVar.c, rsyVar.i, rsyVar.n), new rst(rsvVar, th), angq.a);
    }
}
