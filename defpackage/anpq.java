package defpackage;

import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpq extends anju {
    public anpq() {
        super(anor.class, new anpp(ankf.class));
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anor) aonm.parseFrom(anor.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anor anorVar = (anor) aooyVar;
        anrp.d(anorVar.b);
        anrp.b(new BigInteger(1, anorVar.d.I()).bitLength());
        anrp.c(new BigInteger(1, anorVar.e.I()));
        anop anopVar = anorVar.c;
        if (anopVar == null) {
            anopVar = anop.a;
        }
        aocz.aB(anopVar);
    }

    @Override // defpackage.anju
    public final int g() {
        return 2;
    }

    @Override // defpackage.anju
    public final int h() {
        return 5;
    }
}
