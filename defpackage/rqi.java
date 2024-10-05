package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqi implements qom {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public rqi(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.a.a == 1);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
