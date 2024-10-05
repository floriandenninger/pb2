package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoaq extends aydr {
    final /* synthetic */ qnn a;

    public aoaq(qnn qnnVar) {
        this.a = qnnVar;
    }

    @Override // defpackage.aydr
    public final Status a(int i) {
        if (this.a.d(i)) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (1st-party only) security policy");
    }
}
