package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aykd extends aygq {
    final /* synthetic */ Status a;
    final /* synthetic */ ayaw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aykd(ayke aykeVar, ayaw ayawVar, Status status, byte[] bArr, byte[] bArr2) {
        super(aykeVar.a);
        this.b = ayawVar;
        this.a = status;
    }

    @Override // defpackage.aygq
    public final void a() {
        this.b.c(this.a, new aycd());
    }
}
