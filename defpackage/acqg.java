package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acqg implements amml {
    public final /* synthetic */ aone a;
    private final /* synthetic */ int b;

    public /* synthetic */ acqg(aone aoneVar, int i) {
        this.b = i;
        this.a = aoneVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aone aoneVar = this.a;
                arxh arxhVar = (arxh) obj;
                aoneVar.copyOnWrite();
                ovs ovsVar = (ovs) aoneVar.instance;
                ovs ovsVar2 = ovs.a;
                arxhVar.getClass();
                ovsVar.e = arxhVar;
                ovsVar.b |= 2;
                return aoneVar;
            }
            aone aoneVar2 = this.a;
            tot totVar = (tot) obj;
            if (totVar == tot.DOWNLOADED || totVar == tot.PENDING) {
                aoneVar2.copyOnWrite();
                aned anedVar = (aned) aoneVar2.instance;
                aned anedVar2 = aned.a;
                anedVar.c = anaf.o(4);
                anedVar.b = 1 | anedVar.b;
            } else {
                aoneVar2.copyOnWrite();
                aned anedVar3 = (aned) aoneVar2.instance;
                aned anedVar4 = aned.a;
                anedVar3.c = anaf.o(5);
                anedVar3.b = 1 | anedVar3.b;
            }
            return (aned) aoneVar2.build();
        }
        aone aoneVar3 = this.a;
        awuv awuvVar = (awuv) obj;
        int i2 = acql.m;
        long j = awuvVar.c;
        if (j != -1) {
            aoneVar3.copyOnWrite();
            aqxq aqxqVar = (aqxq) aoneVar3.instance;
            aqxq aqxqVar2 = aqxq.a;
            aqxqVar.b |= 2;
            aqxqVar.d = j;
            aone builder = awuvVar.toBuilder();
            builder.copyOnWrite();
            awuv awuvVar2 = (awuv) builder.instance;
            awuvVar2.b = 1 | awuvVar2.b;
            awuvVar2.c = j + 1;
            return (awuv) builder.build();
        }
        aoneVar3.copyOnWrite();
        aqxq aqxqVar3 = (aqxq) aoneVar3.instance;
        aqxq aqxqVar4 = aqxq.a;
        aqxqVar3.b |= 2;
        aqxqVar3.d = 0L;
        aone builder2 = awuvVar.toBuilder();
        builder2.copyOnWrite();
        awuv awuvVar3 = (awuv) builder2.instance;
        awuvVar3.b = 1 | awuvVar3.b;
        awuvVar3.c = 1L;
        return (awuv) builder2.build();
    }
}
