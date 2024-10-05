package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzl implements aarz {
    private final afyt a;
    private final Context b;
    private final aaea c;

    public afzl(afyt afytVar, Context context, aaea aaeaVar) {
        this.a = afytVar;
        this.b = context;
        this.c = aaeaVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        atog atogVar = this.c.a().p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        if (atogVar.n) {
            aone createBuilder = atne.a.createBuilder();
            int i = true != this.a.d(this.b) ? 3 : 2;
            createBuilder.copyOnWrite();
            atne atneVar = (atne) createBuilder.instance;
            atneVar.c = i - 1;
            atneVar.b |= 1;
            if (this.a.a() > 0) {
                long a = this.a.a();
                createBuilder.copyOnWrite();
                atne atneVar2 = (atne) createBuilder.instance;
                atneVar2.b = 2 | atneVar2.b;
                atneVar2.d = a;
            }
            armz armzVar = ((arnb) aoneVar.instance).c;
            if (armzVar == null) {
                armzVar = armz.a;
            }
            aone builder = armzVar.toBuilder();
            builder.copyOnWrite();
            armz armzVar2 = (armz) builder.instance;
            atne atneVar3 = (atne) createBuilder.build();
            atneVar3.getClass();
            armzVar2.S = atneVar3;
            armzVar2.d |= 2097152;
            aoneVar.copyOnWrite();
            arnb arnbVar = (arnb) aoneVar.instance;
            armz armzVar3 = (armz) builder.build();
            armzVar3.getClass();
            arnbVar.c = armzVar3;
            arnbVar.b |= 1;
        }
    }
}
