package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpo extends ankd {
    public anpo() {
        super(anoq.class, new anpm(anke.class));
    }

    public static anoo i(int i, int i2, BigInteger bigInteger) {
        aone createBuilder = anop.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anop) createBuilder.instance).b = aobq.U(i);
        anop anopVar = (anop) createBuilder.build();
        aone createBuilder2 = anoo.a.createBuilder();
        createBuilder2.copyOnWrite();
        anoo anooVar = (anoo) createBuilder2.instance;
        anopVar.getClass();
        anooVar.b = anopVar;
        createBuilder2.copyOnWrite();
        ((anoo) createBuilder2.instance).c = i2;
        aomf x = aomf.x(bigInteger.toByteArray());
        createBuilder2.copyOnWrite();
        ((anoo) createBuilder2.instance).d = x;
        return (anoo) createBuilder2.build();
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anpn(anoo.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anoq) aonm.parseFrom(anoq.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anoq anoqVar = (anoq) aooyVar;
        anrp.d(anoqVar.b);
        anor anorVar = anoqVar.c;
        if (anorVar == null) {
            anorVar = anor.a;
        }
        anrp.b(new BigInteger(1, anorVar.d.I()).bitLength());
        anor anorVar2 = anoqVar.c;
        if (anorVar2 == null) {
            anorVar2 = anor.a;
        }
        anrp.c(new BigInteger(1, anorVar2.e.I()));
        anor anorVar3 = anoqVar.c;
        if (anorVar3 == null) {
            anorVar3 = anor.a;
        }
        anop anopVar = anorVar3.c;
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
        return 4;
    }
}
