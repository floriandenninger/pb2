package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aebu extends aedo {
    public final String a;

    public aebu(String str) {
        super((aedn) null);
        this.a = str;
    }

    @Override // defpackage.aedo
    public final void a(acsx acsxVar) {
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmd.a.createBuilder();
        String str = this.a;
        createBuilder2.copyOnWrite();
        asmd asmdVar = (asmd) createBuilder2.instance;
        str.getClass();
        asmdVar.b |= 512;
        asmdVar.f = str;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmd asmdVar2 = (asmd) createBuilder2.build();
        asmdVar2.getClass();
        asmbVar.w = asmdVar2;
        asmbVar.c |= 524288;
        acsxVar.a((asmb) createBuilder.build());
    }
}
