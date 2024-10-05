package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nym implements fgp {
    public final fgq a;
    private final acra b;
    private fhg c = fhg.NONE;

    public nym(fgq fgqVar, acra acraVar) {
        this.a = fgqVar;
        this.b = acraVar;
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        if (fhgVar.k() || fhgVar.i()) {
            this.c = fhgVar;
        }
        if (fhgVar2.k()) {
            this.b.n(new acqx(acsb.c(35989)));
            this.b.n(new acqx(acsb.c(34699)));
            if (this.c.i()) {
                this.b.p(acrs.DEFAULT);
                return;
            }
            return;
        }
        if (fhgVar2.i()) {
            this.b.n(new acqx(acsb.c(35988)));
            InteractionLoggingScreen c = this.b.c();
            if (!this.c.k() || c == null) {
                return;
            }
            this.b.z(acrs.DEFAULT, c);
        }
    }
}
