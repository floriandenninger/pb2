package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bain extends NetworkQualityRttListener {
    private final NetworkQualityRttListener a;

    public bain(NetworkQualityRttListener networkQualityRttListener) {
        super(networkQualityRttListener.getExecutor());
        this.a = networkQualityRttListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bain)) {
            return false;
        }
        return this.a.equals(((bain) obj).a);
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        this.a.onRttObservation(i, j, i2);
    }
}
