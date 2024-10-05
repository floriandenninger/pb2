package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anme extends anju {
    public anme() {
        super(annu.class, new anmd(anjn.class));
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annu) aonm.parseFrom(annu.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annu annuVar = (annu) aooyVar;
        anrp.d(annuVar.b);
        anns annsVar = annuVar.c;
        if (annsVar == null) {
            annsVar = anns.a;
        }
        aobq.ab(annsVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 5;
    }
}
