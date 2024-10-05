package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xli implements aarz {
    private final azrw a;

    public xli(azrw azrwVar) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        yjk.e();
        xlj xljVar = (xlj) this.a.get();
        armt armtVar = ((arnb) aoneVar.instance).j;
        if (armtVar == null) {
            armtVar = armt.a;
        }
        aone builder = armtVar.toBuilder();
        builder.copyOnWrite();
        ((armt) builder.instance).b = armt.emptyProtobufList();
        aone createBuilder = askp.a.createBuilder();
        String e = xljVar.e();
        createBuilder.copyOnWrite();
        askp askpVar = (askp) createBuilder.instance;
        e.getClass();
        askpVar.b |= 1;
        askpVar.e = e;
        String d = xljVar.d();
        createBuilder.copyOnWrite();
        askp askpVar2 = (askp) createBuilder.instance;
        d.getClass();
        askpVar2.c = 2;
        askpVar2.d = d;
        builder.copyOnWrite();
        armt armtVar2 = (armt) builder.instance;
        askp askpVar3 = (askp) createBuilder.build();
        askpVar3.getClass();
        aony aonyVar = armtVar2.b;
        if (!aonyVar.c()) {
            armtVar2.b = aonm.mutableCopy(aonyVar);
        }
        armtVar2.b.add(askpVar3);
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        armt armtVar3 = (armt) builder.build();
        armtVar3.getClass();
        arnbVar.j = armtVar3;
        arnbVar.b |= 256;
    }
}
