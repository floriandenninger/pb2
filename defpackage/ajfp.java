package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfp extends ajfh {
    public ajfp(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajfh
    public final /* bridge */ /* synthetic */ aqrf a(Object obj) {
        askb askbVar = (askb) obj;
        if ((askbVar.b & 64) == 0) {
            return null;
        }
        aqrf aqrfVar = askbVar.i;
        return aqrfVar == null ? aqrf.a : aqrfVar;
    }
}
