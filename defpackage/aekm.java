package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekm {
    public final shf a;
    public final aaea b;
    public final ExecutorService c;

    public aekm(ExecutorService executorService, ExecutorService executorService2, shf shfVar, aaea aaeaVar, aadw aadwVar) {
        this.a = shfVar;
        this.b = aaeaVar;
        atej atejVar = aadwVar.b().k;
        atse atseVar = (atejVar == null ? atej.a : atejVar).s;
        if ((atseVar == null ? atse.b : atseVar).r) {
            this.c = executorService2;
        } else {
            this.c = executorService;
        }
    }
}
