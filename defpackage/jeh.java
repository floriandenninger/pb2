package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jeh implements ayqd {
    final /* synthetic */ jei a;
    private ayqx b;
    private final /* synthetic */ int c;

    public jeh(jei jeiVar, int i) {
        this.c = i;
        this.a = jeiVar;
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (this.c != 0) {
            this.b = ayqxVar;
        } else {
            this.b = ayqxVar;
        }
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            zga.f("YT.MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isSeamlessSignInEnabled", th);
        } else if (i != 1) {
            zga.f("YT.MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isAssistedSignInEnabled", th);
        } else {
            zga.f("YT.MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isPassiveSignInEnabled", th);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        int i = this.c;
        if (i == 0) {
            this.b.qc();
        } else if (i != 1) {
            this.b.qc();
        } else {
            this.b.qc();
        }
    }

    @Override // defpackage.ayqd
    public final /* synthetic */ void c(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.k = ((Boolean) obj).booleanValue();
        } else if (i == 1) {
            this.a.j = ((Boolean) obj).booleanValue();
        } else {
            this.a.l = ((Boolean) obj).booleanValue();
        }
    }
}
