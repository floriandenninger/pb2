package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aebg extends aedo {
    public final long a;

    public aebg(long j) {
        super((aedn) null);
        this.a = j;
    }

    @Override // defpackage.aedo
    public final void a(acsx acsxVar) {
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmd.a.createBuilder();
        long j = this.a;
        createBuilder2.copyOnWrite();
        asmd asmdVar = (asmd) createBuilder2.instance;
        asmdVar.b |= 2048;
        asmdVar.h = j;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmd asmdVar2 = (asmd) createBuilder2.build();
        asmdVar2.getClass();
        asmbVar.w = asmdVar2;
        asmbVar.c |= 524288;
        acsxVar.a((asmb) createBuilder.build());
    }
}
