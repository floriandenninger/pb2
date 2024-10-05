package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayfm extends aybr {
    private final Status a;

    public ayfm(Status status) {
        this.a = status;
    }

    @Override // defpackage.aybr
    public final aybm a() {
        return aybm.b(this.a);
    }
}
