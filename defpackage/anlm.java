package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anlm extends anjs {
    public anlm(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anom) aonm.parseFrom(anom.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anom anomVar = (anom) aooyVar;
        aone createBuilder = anol.a.createBuilder();
        createBuilder.copyOnWrite();
        anol anolVar = (anol) createBuilder.instance;
        anomVar.getClass();
        anolVar.c = anomVar;
        createBuilder.copyOnWrite();
        ((anol) createBuilder.instance).b = 0;
        return (anol) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anom anomVar = (anom) aooyVar;
        if (anomVar.b.isEmpty() || anomVar.c == null) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
