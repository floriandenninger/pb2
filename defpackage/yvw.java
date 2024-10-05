package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvw extends NetworkQualityRttListener {
    public final azqv a;
    public final amnv b;
    private final azrw c;

    public yvw(Executor executor, azrw azrwVar) {
        super(executor);
        this.a = azqv.aq(atmk.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
        this.c = azrwVar;
        this.b = amkq.x(new amnv() { // from class: yvv
            @Override // defpackage.amnv
            public final Object get() {
                return yvw.this.a.n().G().l(250L, TimeUnit.MILLISECONDS).y();
            }
        });
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        atmk atmkVar;
        azqv azqvVar = this.a;
        int effectiveConnectionType = ((ExperimentalCronetEngine) this.c.get()).getEffectiveConnectionType();
        if (effectiveConnectionType == 1) {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_OFFLINE;
        } else if (effectiveConnectionType == 2) {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
        } else if (effectiveConnectionType == 3) {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_2G;
        } else if (effectiveConnectionType == 4) {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_3G;
        } else if (effectiveConnectionType == 5) {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_4G;
        } else {
            atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        }
        azqvVar.c(atmkVar);
    }
}
