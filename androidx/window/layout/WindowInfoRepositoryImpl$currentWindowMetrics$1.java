package androidx.window.layout;

import android.app.Activity;
import defpackage.aztj;
import defpackage.azum;

/* compiled from: PG */
/* loaded from: classes.dex */
final class WindowInfoRepositoryImpl$currentWindowMetrics$1 extends azum implements aztj {
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$currentWindowMetrics$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl) {
        super(0);
        this.this$0 = windowInfoRepositoryImpl;
    }

    @Override // defpackage.aztj
    public final WindowMetrics invoke() {
        WindowMetricsCalculator windowMetricsCalculator;
        Activity activity;
        windowMetricsCalculator = this.this$0.windowMetricsCalculator;
        activity = this.this$0.activity;
        return windowMetricsCalculator.computeCurrentWindowMetrics(activity);
    }
}
