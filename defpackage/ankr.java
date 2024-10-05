package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankr extends anju {
    public ankr() {
        super(anmw.class, new ankp(anjh.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ anjr i(int i, int i2, int i3) {
        aone createBuilder = anmz.a.createBuilder();
        aone createBuilder2 = anna.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anna) createBuilder2.instance).b = 16;
        anna annaVar = (anna) createBuilder2.build();
        createBuilder.copyOnWrite();
        anmz anmzVar = (anmz) createBuilder.instance;
        annaVar.getClass();
        anmzVar.b = annaVar;
        createBuilder.copyOnWrite();
        ((anmz) createBuilder.instance).c = i;
        anmz anmzVar2 = (anmz) createBuilder.build();
        aone createBuilder3 = anoa.a.createBuilder();
        aone createBuilder4 = anob.a.createBuilder();
        createBuilder4.copyOnWrite();
        ((anob) createBuilder4.instance).b = aobq.U(5);
        createBuilder4.copyOnWrite();
        ((anob) createBuilder4.instance).c = i2;
        anob anobVar = (anob) createBuilder4.build();
        createBuilder3.copyOnWrite();
        anoa anoaVar = (anoa) createBuilder3.instance;
        anobVar.getClass();
        anoaVar.b = anobVar;
        createBuilder3.copyOnWrite();
        ((anoa) createBuilder3.instance).c = 32;
        anoa anoaVar2 = (anoa) createBuilder3.build();
        aone createBuilder5 = anmx.a.createBuilder();
        createBuilder5.copyOnWrite();
        anmx anmxVar = (anmx) createBuilder5.instance;
        anmzVar2.getClass();
        anmxVar.b = anmzVar2;
        createBuilder5.copyOnWrite();
        anmx anmxVar2 = (anmx) createBuilder5.instance;
        anoaVar2.getClass();
        anmxVar2.c = anoaVar2;
        return new anjr((anmx) createBuilder5.build(), i3);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new ankq(anmx.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anmw) aonm.parseFrom(anmw.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anmw anmwVar = (anmw) aooyVar;
        anrp.d(anmwVar.b);
        new anku();
        anmy anmyVar = anmwVar.c;
        if (anmyVar == null) {
            anmyVar = anmy.a;
        }
        anku.j(anmyVar);
        new anmo();
        annz annzVar = anmwVar.d;
        if (annzVar == null) {
            annzVar = annz.a;
        }
        anmo.j(annzVar);
    }

    @Override // defpackage.anju
    public final int g() {
        return 2;
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
