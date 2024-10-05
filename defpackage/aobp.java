package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aobp extends ayoo {
    public aobp(axzp axzpVar, axzo axzoVar) {
        super(axzpVar, axzoVar);
    }

    @Override // defpackage.ayoq
    public final /* bridge */ /* synthetic */ ayoq a(axzp axzpVar, axzo axzoVar) {
        return new aobp(axzpVar, axzoVar);
    }

    public final anhy b(aocr aocrVar) {
        axzp axzpVar = this.a;
        aych aychVar = aobq.f;
        if (aychVar == null) {
            synchronized (aobq.class) {
                aychVar = aobq.f;
                if (aychVar == null) {
                    ayce a = aych.a();
                    a.c = aycg.UNARY;
                    a.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "StartLinkingSession");
                    a.b();
                    a.a = ayom.b(aocr.a);
                    a.b = ayom.b(aocm.a);
                    aychVar = a.a();
                    aobq.f = aychVar;
                }
            }
        }
        return ayox.a(axzpVar.a(aychVar, this.b), aocrVar);
    }
}
