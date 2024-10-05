package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rsq implements anhh {
    final /* synthetic */ rsv a;

    public rsq(rsv rsvVar) {
        this.a = rsvVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aocb aocbVar = (aocb) obj;
        if (aocbVar != null) {
            rsv rsvVar = this.a;
            if (rsvVar.c.m) {
                rsvVar.a(aocbVar.d);
                return;
            }
            rsvVar.h.j(false);
            this.a.g(aorv.STATE_COMPLETE);
            this.a.i(rqr.h(aocbVar.d));
            return;
        }
        this.a.h.j(false);
        this.a.c(aoru.EVENT_MALFORMED_RESPONSE);
        this.a.i(rqr.g(1, "Linking failed; link was not returned by the server "));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.h.j(false);
        this.a.b(th, rsl.APP_FLIP, "createLink grpc call failed");
    }
}
