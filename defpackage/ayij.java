package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayij implements aygg {
    final Status a;
    private final ayge b;

    public ayij(Status status, ayge aygeVar) {
        amkq.F(!status.f(), "error must not be OK");
        this.a = status;
        this.b = aygeVar;
    }

    @Override // defpackage.aybg
    public final aybc c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.aygg
    public final aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        return new ayii(this.a, this.b, ayepVarArr, null, null, null);
    }
}
