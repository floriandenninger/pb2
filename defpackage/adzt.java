package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adzt extends aedo {
    public final int a;

    public adzt(int i) {
        super((aedn) null);
        this.a = i;
    }

    @Override // defpackage.aedo
    public final void a(acsx acsxVar) {
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmd.a.createBuilder();
        aone createBuilder3 = asmc.a.createBuilder();
        createBuilder3.copyOnWrite();
        asmc asmcVar = (asmc) createBuilder3.instance;
        asmcVar.b |= 1;
        asmcVar.c = true;
        int i = this.a;
        createBuilder3.copyOnWrite();
        asmc asmcVar2 = (asmc) createBuilder3.instance;
        asmcVar2.d = aobq.aF(i);
        asmcVar2.b |= 2;
        createBuilder2.au((asmc) createBuilder3.build());
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmd asmdVar = (asmd) createBuilder2.build();
        asmdVar.getClass();
        asmbVar.w = asmdVar;
        asmbVar.c |= 524288;
        acsxVar.a((asmb) createBuilder.build());
    }
}
