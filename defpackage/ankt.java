package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankt extends anjs {
    public ankt(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anmz) aonm.parseFrom(anmz.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anmz anmzVar = (anmz) aooyVar;
        aone createBuilder = anmy.a.createBuilder();
        anna annaVar = anmzVar.b;
        if (annaVar == null) {
            annaVar = anna.a;
        }
        createBuilder.copyOnWrite();
        anmy anmyVar = (anmy) createBuilder.instance;
        annaVar.getClass();
        anmyVar.c = annaVar;
        aomf x = aomf.x(anrj.a(anmzVar.c));
        createBuilder.copyOnWrite();
        ((anmy) createBuilder.instance).d = x;
        createBuilder.copyOnWrite();
        ((anmy) createBuilder.instance).b = 0;
        return (anmy) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anmz anmzVar = (anmz) aooyVar;
        anrp.a(anmzVar.c);
        anna annaVar = anmzVar.b;
        if (annaVar == null) {
            annaVar = anna.a;
        }
        anku.i(annaVar);
    }
}
