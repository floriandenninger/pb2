package defpackage;

import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;
import com.google.android.libraries.elements.interfaces.PerformanceSpanBlocklist;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tbe extends PerformanceMonitorAdapter {
    private final boolean a;

    public tbe(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final long getCurrentThread() {
        tbl tblVar = tbl.b;
        return tbk.a().b;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final EnumSet getPerformanceSpanBlocklist() {
        return EnumSet.noneOf(PerformanceSpanBlocklist.class);
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean isMainThread() {
        tbl tblVar = tbl.b;
        return tbk.a().a;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean shouldRecordLogs() {
        return this.a;
    }
}
