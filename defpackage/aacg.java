package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacg implements aarz {
    private final aamb a;

    public aacg(aamb aambVar) {
        this.a = aambVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        arng arngVar = ((arnb) aoneVar.instance).e;
        if (arngVar == null) {
            arngVar = arng.a;
        }
        aone builder = arngVar.toBuilder();
        boolean a = this.a.a();
        builder.copyOnWrite();
        arng arngVar2 = (arng) builder.instance;
        arngVar2.b |= 32;
        arngVar2.d = a;
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        arng arngVar3 = (arng) builder.build();
        arngVar3.getClass();
        arnbVar.e = arngVar3;
        arnbVar.b |= 4;
    }
}
