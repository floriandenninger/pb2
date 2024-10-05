package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anli extends anjs {
    public anli(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anok) aonm.parseFrom(anok.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anok anokVar = (anok) aooyVar;
        aone createBuilder = anoj.a.createBuilder();
        createBuilder.copyOnWrite();
        anoj anojVar = (anoj) createBuilder.instance;
        anokVar.getClass();
        anojVar.c = anokVar;
        createBuilder.copyOnWrite();
        ((anoj) createBuilder.instance).b = 0;
        return (anoj) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
    }
}
