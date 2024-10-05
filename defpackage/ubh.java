package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubh {
    public final uat a;

    public ubh(uat uatVar) {
        this.a = uatVar;
    }

    public final void a(twu twuVar, Long l, aokf aokfVar) {
        long longValue = twuVar.d.longValue();
        if (longValue == 0) {
            tzk.e("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", twuVar.b);
            b(twuVar, aokfVar);
        } else if (l == null || longValue < l.longValue()) {
            tzk.e("ChimeSyncHelperImpl", "Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", twuVar.b, twuVar.d, aokfVar.name());
            this.a.a(twuVar, longValue, aokfVar);
        } else {
            tzk.e("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", twuVar.b, twuVar.d, l);
        }
    }

    public final void b(twu twuVar, aokf aokfVar) {
        this.a.c(twuVar, aokfVar);
    }
}
