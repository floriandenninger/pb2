package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayha extends aygq {
    final Status a;
    final ayaw b;

    public ayha(ayhg ayhgVar, ayaw ayawVar, Status status, byte[] bArr, byte[] bArr2) {
        super(ayhgVar.a);
        this.b = ayawVar;
        this.a = status;
    }

    @Override // defpackage.aygq
    public final void a() {
        this.b.c(this.a, new aycd());
    }
}
