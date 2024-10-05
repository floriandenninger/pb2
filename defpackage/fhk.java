package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhk {
    private final aadw a;
    private final ylf b;

    public fhk(aadw aadwVar, ylf ylfVar) {
        this.a = aadwVar;
        this.b = ylfVar;
    }

    public static final void b(ylf ylfVar) {
        ylfVar.c("NetworkQualityLogger");
    }

    public final void a() {
        aadw aadwVar = this.a;
        atfq atfqVar = aadwVar.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        if (atfqVar.j) {
            atfq atfqVar2 = aadwVar.b().o;
            if (atfqVar2 == null) {
                atfqVar2 = atfq.a;
            }
            if (atfqVar2.k) {
                TimeUnit timeUnit = TimeUnit.MINUTES;
                atfq atfqVar3 = this.a.b().o;
                if (atfqVar3 == null) {
                    atfqVar3 = atfq.a;
                }
                long seconds = timeUnit.toSeconds(atfqVar3.l);
                if (seconds < 1) {
                    return;
                }
                this.b.d("NetworkQualityLogger", seconds + 5, 5L, true, 0, false, null, null);
            }
        }
    }
}
