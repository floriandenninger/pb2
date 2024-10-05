package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjv implements aarz {
    private final zju a;

    public zjv(zju zjuVar) {
        this.a = zjuVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        zjp a = this.a.a();
        if (a != null) {
            armz armzVar = ((arnb) aoneVar.instance).c;
            if (armzVar == null) {
                armzVar = armz.a;
            }
            aone builder = armzVar.toBuilder();
            aone createBuilder = atgp.a.createBuilder();
            String str = a.b;
            createBuilder.copyOnWrite();
            atgp atgpVar = (atgp) createBuilder.instance;
            atgpVar.b |= 1;
            atgpVar.c = str;
            long j = a.a;
            createBuilder.copyOnWrite();
            atgp atgpVar2 = (atgp) createBuilder.instance;
            atgpVar2.b |= 2;
            atgpVar2.d = j;
            builder.copyOnWrite();
            armz armzVar2 = (armz) builder.instance;
            atgp atgpVar3 = (atgp) createBuilder.build();
            atgpVar3.getClass();
            armzVar2.f108J = atgpVar3;
            armzVar2.d |= 1;
            aoneVar.copyOnWrite();
            arnb arnbVar = (arnb) aoneVar.instance;
            armz armzVar3 = (armz) builder.build();
            armzVar3.getClass();
            arnbVar.c = armzVar3;
            arnbVar.b |= 1;
        }
    }
}
