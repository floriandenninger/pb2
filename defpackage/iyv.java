package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyv implements aarz {
    private final gni a;

    public iyv(gni gniVar) {
        this.a = gniVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        armz armzVar = ((arnb) aoneVar.instance).c;
        if (armzVar == null) {
            armzVar = armz.a;
        }
        aone builder = armzVar.toBuilder();
        gng gngVar = gng.LIGHT;
        int ordinal = this.a.a().ordinal();
        if (ordinal == 0) {
            builder.copyOnWrite();
            armz armzVar2 = (armz) builder.instance;
            armzVar2.O = 1;
            armzVar2.d |= 8192;
        } else if (ordinal == 1) {
            builder.copyOnWrite();
            armz armzVar3 = (armz) builder.instance;
            armzVar3.O = 2;
            armzVar3.d |= 8192;
        }
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        armz armzVar4 = (armz) builder.build();
        armzVar4.getClass();
        arnbVar.c = armzVar4;
        arnbVar.b |= 1;
    }
}
