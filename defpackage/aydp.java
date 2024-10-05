package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydp extends aydr {
    @Override // defpackage.aydr
    public final Status a(int i) {
        if (i == aydq.a) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (internal-only) security policy");
    }
}
