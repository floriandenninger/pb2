package androidx.window.layout;

import android.app.Activity;
import defpackage.ayep;
import defpackage.aztj;
import defpackage.azuj;
import defpackage.azyx;
import defpackage.azyy;
import defpackage.azzb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WindowInfoRepositoryImpl implements WindowInfoRepository {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final Activity activity;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azuj azujVar) {
            this();
        }
    }

    public WindowInfoRepositoryImpl(Activity activity, WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        activity.getClass();
        windowMetricsCalculator.getClass();
        windowBackend.getClass();
        this.activity = activity;
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    private final azyy configurationChanged(aztj aztjVar) {
        return ayep.A(new WindowInfoRepositoryImpl$configurationChanged$1(this, aztjVar, null));
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azyy getCurrentWindowMetrics() {
        return new azyx(configurationChanged(new WindowInfoRepositoryImpl$currentWindowMetrics$1(this)), azzb.b);
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azyy getWindowLayoutInfo() {
        return ayep.A(new WindowInfoRepositoryImpl$windowLayoutInfo$1(this, null));
    }
}
