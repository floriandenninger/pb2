package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rqj extends rqf {
    @Override // defpackage.rqf
    public final void b(Status status) {
        if (status.c()) {
            return;
        }
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("disconnect(): Could not unregister listener: status=");
        sb.append(valueOf);
        Log.e("UsageReportingClientImp", sb.toString());
    }
}
