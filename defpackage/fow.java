package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fow extends ajfh {
    public fow(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajfh
    public final /* bridge */ /* synthetic */ aqrf a(Object obj) {
        avvr avvrVar = (avvr) obj;
        if ((avvrVar.b & 512) == 0) {
            return null;
        }
        aqrf aqrfVar = avvrVar.n;
        return aqrfVar == null ? aqrf.a : aqrfVar;
    }
}
