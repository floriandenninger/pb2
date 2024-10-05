package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qta {
    private static qta b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private qta() {
    }

    public static synchronized qta a() {
        qta qtaVar;
        synchronized (qta.class) {
            if (b == null) {
                b = new qta();
            }
            qtaVar = b;
        }
        return qtaVar;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
            this.a = rootTelemetryConfiguration;
        }
    }
}
