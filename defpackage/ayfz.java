package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayfz extends aygq {
    final /* synthetic */ ayga a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayfz(ayga aygaVar) {
        super(aygaVar.b.d);
        this.a = aygaVar;
    }

    @Override // defpackage.aygq
    public final void a() {
        int i = aypd.a;
        ayga aygaVar = this.a;
        if (aygaVar.a != null) {
            return;
        }
        try {
            aygaVar.c.f();
        } catch (Throwable th) {
            this.a.b(Status.c.c(th).withDescription("Failed to call onReady."));
        }
    }
}
