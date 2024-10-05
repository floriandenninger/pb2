package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class haa {
    private final aadw a;
    private final ylf b;

    public haa(ylf ylfVar, aadw aadwVar) {
        this.b = ylfVar;
        this.a = aadwVar;
    }

    public static final void b(ylf ylfVar) {
        ylfVar.c("NetworkStatusReporter");
    }

    public final void a() {
        atfq atfqVar = this.a.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        if (atfqVar.k) {
            atfq atfqVar2 = this.a.b().o;
            if (atfqVar2 == null) {
                atfqVar2 = atfq.a;
            }
            if (atfqVar2.j) {
                TimeUnit timeUnit = TimeUnit.MINUTES;
                atfq atfqVar3 = this.a.b().o;
                if (atfqVar3 == null) {
                    atfqVar3 = atfq.a;
                }
                long seconds = timeUnit.toSeconds(atfqVar3.m);
                if (seconds < 1) {
                    return;
                }
                this.b.d("NetworkStatusReporter", seconds + 5, seconds, true, 0, false, null, null);
            }
        }
    }
}
