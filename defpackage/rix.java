package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rix extends res {
    final /* synthetic */ rjj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rix(rjj rjjVar, rhh rhhVar) {
        super(rhhVar);
        this.b = rjjVar;
    }

    @Override // defpackage.res
    public final void b() {
        rjj rjjVar = this.b;
        rjjVar.n();
        if (rjjVar.A()) {
            rjjVar.aF().k.a("Inactivity, disconnecting from the service");
            rjjVar.p();
        }
    }
}
