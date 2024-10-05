package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aegk extends aty {
    public aegk(CronetEngine cronetEngine, Executor executor, ammy ammyVar, int i, int i2, boolean z, boolean z2) {
        super(cronetEngine, executor, i, i2, z, ammyVar, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aty
    public final UrlRequest.Builder o(ath athVar) {
        UrlRequest.Builder o = super.o(athVar);
        Object obj = athVar.k;
        if ((obj instanceof aehx) && ((aehx) obj).e) {
            ((ExperimentalUrlRequest.Builder) o).setIdempotency(1);
        }
        return o;
    }
}
