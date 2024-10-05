package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kwi extends ajsu {
    private final ajpd a;
    private final ayqx b;

    public kwi(ajvb ajvbVar, aahv aahvVar, arbt arbtVar) {
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        ajpdVar.add(arbtVar);
        ajvbVar.a(arbt.class);
        this.b = aahvVar.c().h(arbtVar.c, false).ab(ayqr.a()).aw();
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        ayrz.c((AtomicReference) this.b);
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
