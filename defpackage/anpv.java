package defpackage;

import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpv extends anju {
    public anpv() {
        super(anov.class, new anpu(ankf.class));
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anov) aonm.parseFrom(anov.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anov anovVar = (anov) aooyVar;
        anrp.d(anovVar.b);
        anrp.b(new BigInteger(1, anovVar.d.I()).bitLength());
        anrp.c(new BigInteger(1, anovVar.e.I()));
        anot anotVar = anovVar.c;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        aocz.aC(anotVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 5;
    }
}
