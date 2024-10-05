package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aebt extends aedo {
    public aebt() {
        super((aedn) null);
    }

    @Override // defpackage.aedo
    public final void a(acsx acsxVar) {
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmd.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmd asmdVar = (asmd) createBuilder2.instance;
        asmdVar.b |= 4096;
        asmdVar.i = true;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmd asmdVar2 = (asmd) createBuilder2.build();
        asmdVar2.getClass();
        asmbVar.w = asmdVar2;
        asmbVar.c |= 524288;
        acsxVar.a((asmb) createBuilder.build());
    }
}
