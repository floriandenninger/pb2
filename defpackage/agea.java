package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agea implements agms {
    private static final long a = TimeUnit.HOURS.toSeconds(1);
    private final aaea b;
    private final ylf c;

    public agea(ylf ylfVar, aaea aaeaVar) {
        this.c = ylfVar;
        this.b = aaeaVar;
    }

    @Override // defpackage.agms
    public final void a() {
        atph atphVar = this.b.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        atqn atqnVar = atphVar.c;
        if (atqnVar == null) {
            atqnVar = atqn.a;
        }
        if (atqnVar.b) {
            this.c.e("offline_client_state", Math.max(a, atqnVar.c), false, 1, null, null, false);
        }
    }
}
