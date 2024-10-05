package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rsr implements anhh {
    final /* synthetic */ rsv a;

    public rsr(rsv rsvVar) {
        this.a = rsvVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aobz aobzVar = (aobz) obj;
        if (aobzVar != null) {
            rsv rsvVar = this.a;
            if (rsvVar.c.m) {
                aocb aocbVar = aobzVar.b;
                if (aocbVar == null) {
                    aocbVar = aocb.a;
                }
                rsvVar.a(aocbVar.d);
                return;
            }
            rsvVar.h.j(false);
            this.a.g(aorv.STATE_COMPLETE);
            rsv rsvVar2 = this.a;
            aocb aocbVar2 = aobzVar.b;
            if (aocbVar2 == null) {
                aocbVar2 = aocb.a;
            }
            rsvVar2.i(rqr.h(aocbVar2.d));
            return;
        }
        this.a.h.j(false);
        this.a.c(aoru.EVENT_MALFORMED_RESPONSE);
        this.a.i(rqr.g(1, "Linking failed; response not returned by the server"));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.h.j(false);
        this.a.b(th, rsl.WEB_OAUTH, "finishOAuth grpc call failed");
    }
}
