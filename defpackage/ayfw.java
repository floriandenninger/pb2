package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayfw extends aygq {
    final /* synthetic */ aycd a;
    final /* synthetic */ ayga b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayfw(ayga aygaVar, aycd aycdVar) {
        super(aygaVar.b.d);
        this.b = aygaVar;
        this.a = aycdVar;
    }

    @Override // defpackage.aygq
    public final void a() {
        int i = aypd.a;
        ayga aygaVar = this.b;
        if (aygaVar.a != null) {
            return;
        }
        try {
            aygaVar.c.d(this.a);
        } catch (Throwable th) {
            this.b.b(Status.c.c(th).withDescription("Failed to read headers"));
        }
    }
}
