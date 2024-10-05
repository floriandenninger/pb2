package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fos extends ajfh {
    public fos(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajfh
    public final /* bridge */ /* synthetic */ aqrf a(Object obj) {
        arfb arfbVar = (arfb) obj;
        if ((arfbVar.b & 512) == 0) {
            return null;
        }
        aqrf aqrfVar = arfbVar.n;
        return aqrfVar == null ? aqrf.a : aqrfVar;
    }
}
