package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmy implements aarz {
    private final azrw a;
    private final azrw b;
    private final aadw c;

    public akmy(azrw azrwVar, azrw azrwVar2, aadw aadwVar) {
        this.c = aadwVar;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        if ((this.c.b().b & 262144) != 0) {
            atfq atfqVar = this.c.b().o;
            if (atfqVar == null) {
                atfqVar = atfq.a;
            }
            int i = atfqVar.b;
            if ((33554432 & i) != 0 && (i & 32768) != 0 && atfqVar.n && atfqVar.j) {
                armz armzVar = ((arnb) aoneVar.instance).c;
                if (armzVar == null) {
                    armzVar = armz.a;
                }
                aone builder = armzVar.toBuilder();
                atmk b = ((akmu) this.b.get()).b();
                builder.copyOnWrite();
                armz armzVar2 = (armz) builder.instance;
                armzVar2.Q = b.g;
                armzVar2.d |= 524288;
                aoneVar.copyOnWrite();
                arnb arnbVar = (arnb) aoneVar.instance;
                armz armzVar3 = (armz) builder.build();
                armzVar3.getClass();
                arnbVar.c = armzVar3;
                arnbVar.b |= 1;
            }
            if (atfqVar.r && atfqVar.o) {
                anhy a = ((amce) this.a.get()).a();
                if (a.isDone()) {
                    try {
                        ammv ammvVar = (ammv) a.get();
                        if (!ammvVar.h()) {
                            return;
                        }
                        armz armzVar4 = ((arnb) aoneVar.instance).c;
                        if (armzVar4 == null) {
                            armzVar4 = armz.a;
                        }
                        aone builder2 = armzVar4.toBuilder();
                        long longValue = ((Long) ammvVar.c()).longValue();
                        builder2.copyOnWrite();
                        armz armzVar5 = (armz) builder2.instance;
                        armzVar5.d |= 1048576;
                        armzVar5.R = longValue / 1024;
                        aoneVar.copyOnWrite();
                        arnb arnbVar2 = (arnb) aoneVar.instance;
                        armz armzVar6 = (armz) builder2.build();
                        armzVar6.getClass();
                        arnbVar2.c = armzVar6;
                        arnbVar2.b |= 1;
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
        }
    }
}
