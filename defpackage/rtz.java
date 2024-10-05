package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class rtz implements rua {
    public final /* synthetic */ aone a;
    private final /* synthetic */ int b;

    public /* synthetic */ rtz(aone aoneVar, int i) {
        this.b = i;
        this.a = aoneVar;
    }

    @Override // defpackage.rua
    public final anhy a(aobp aobpVar) {
        int i = this.b;
        if (i == 0) {
            return aobpVar.b((aocr) this.a.build());
        }
        if (i == 1) {
            aobt aobtVar = (aobt) this.a.build();
            axzp axzpVar = aobpVar.a;
            aych aychVar = aobq.a;
            if (aychVar == null) {
                synchronized (aobq.class) {
                    aychVar = aobq.a;
                    if (aychVar == null) {
                        ayce a = aych.a();
                        a.c = aycg.UNARY;
                        a.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "CreateLink");
                        a.b();
                        a.a = ayom.b(aobt.a);
                        a.b = ayom.b(aocb.a);
                        aychVar = a.a();
                        aobq.a = aychVar;
                    }
                }
            }
            return ayox.a(axzpVar.a(aychVar, aobpVar.b), aobtVar);
        }
        return aobpVar.b((aocr) this.a.build());
    }
}
