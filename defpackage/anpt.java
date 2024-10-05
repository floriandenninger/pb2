package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpt extends ankd {
    public anpt() {
        super(anou.class, new anpr(anke.class));
    }

    public static anos i(int i, int i2, int i3, int i4, BigInteger bigInteger) {
        aone createBuilder = anot.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anot) createBuilder.instance).b = aobq.U(i);
        createBuilder.copyOnWrite();
        ((anot) createBuilder.instance).c = aobq.U(i2);
        createBuilder.copyOnWrite();
        ((anot) createBuilder.instance).d = i3;
        anot anotVar = (anot) createBuilder.build();
        aone createBuilder2 = anos.a.createBuilder();
        createBuilder2.copyOnWrite();
        anos anosVar = (anos) createBuilder2.instance;
        anotVar.getClass();
        anosVar.b = anotVar;
        createBuilder2.copyOnWrite();
        ((anos) createBuilder2.instance).c = i4;
        aomf x = aomf.x(bigInteger.toByteArray());
        createBuilder2.copyOnWrite();
        ((anos) createBuilder2.instance).d = x;
        return (anos) createBuilder2.build();
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anps(anos.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anou) aonm.parseFrom(anou.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anou anouVar = (anou) aooyVar;
        anrp.d(anouVar.b);
        anov anovVar = anouVar.c;
        if (anovVar == null) {
            anovVar = anov.a;
        }
        anrp.b(new BigInteger(1, anovVar.d.I()).bitLength());
        anov anovVar2 = anouVar.c;
        if (anovVar2 == null) {
            anovVar2 = anov.a;
        }
        anrp.c(new BigInteger(1, anovVar2.e.I()));
        anov anovVar3 = anouVar.c;
        if (anovVar3 == null) {
            anovVar3 = anov.a;
        }
        anot anotVar = anovVar3.c;
        if (anotVar == null) {
            anotVar = anot.a;
        }
        aocz.aC(anotVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 4;
    }
}
