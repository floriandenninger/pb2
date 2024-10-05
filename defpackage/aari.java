package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aari implements aarz {
    private final afsy a;

    public aari(afsy afsyVar) {
        afsyVar.getClass();
        this.a = afsyVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        arng arngVar = ((arnb) aoneVar.instance).e;
        if (arngVar == null) {
            arngVar = arng.a;
        }
        aone builder = arngVar.toBuilder();
        boolean g = this.a.c().g();
        builder.copyOnWrite();
        arng arngVar2 = (arng) builder.instance;
        arngVar2.b |= 4096;
        arngVar2.e = g;
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        arng arngVar3 = (arng) builder.build();
        arngVar3.getClass();
        arnbVar.e = arngVar3;
        arnbVar.b |= 4;
    }
}
