package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adom extends admk {
    private static final String k = zga.a("MDX.ManualPairingRecoverer");

    public adom(bpw bpwVar, bph bphVar, addy addyVar, ysy ysyVar, ypa ypaVar) {
        super(bpwVar, bphVar, addyVar, ysyVar, ypaVar, 4, false);
    }

    @Override // defpackage.admk
    protected final void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.admk
    public final void b(bpv bpvVar) {
        if (!adeg.h(bpvVar)) {
            zga.m(k, "Non CLOUD route was passed in for recovery");
        } else {
            c(bpvVar);
        }
    }
}
