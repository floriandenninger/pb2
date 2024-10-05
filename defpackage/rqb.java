package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqb extends rqf {
    final /* synthetic */ rpv a;

    public rqb(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.rqf
    public final void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        qar.o(status, new qol(new rqi(Status.a, usageReportingOptInOptions)), this.a);
    }
}
