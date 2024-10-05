package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcd extends dha {

    @dnt(a = 13)
    tce a;

    @dnt(a = 14)
    private final tcc b;

    public tcd() {
        super("ElementDeferredLayout");
        this.b = new tcc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        tce tceVar = this.a;
        try {
            sxc a = sxc.a().a();
            tcf tcfVar = tceVar.a;
            sqq sqqVar = tcfVar.a;
            dpj dpjVar = tcfVar.d;
            sxb e = a.e();
            e.f(tcfVar.c);
            e.l = tcfVar.i;
            baqlVar.a = sqqVar.b(dpjVar, e.a(), tcfVar.j, tcfVar.b, tcfVar.e);
            this.b.a = (dha) baqlVar.a;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((tcc) dlqVar2).a = ((tcc) dlqVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dha dhaVar = this.b.a;
        if (dhaVar != null) {
            return dhaVar.j();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.b;
    }
}
