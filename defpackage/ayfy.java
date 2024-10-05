package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayfy extends aygq {
    final /* synthetic */ Status a;
    final /* synthetic */ aycd b;
    final /* synthetic */ ayga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayfy(ayga aygaVar, Status status, aycd aycdVar) {
        super(aygaVar.b.d);
        this.c = aygaVar;
        this.a = status;
        this.b = aycdVar;
    }

    @Override // defpackage.aygq
    public final void a() {
        int i = aypd.a;
        Status status = this.a;
        aycd aycdVar = this.b;
        Status status2 = this.c.a;
        if (status2 != null) {
            aycdVar = new aycd();
            status = status2;
        }
        this.c.b.f = true;
        try {
            this.c.c.c(status, aycdVar);
        } finally {
            this.c.b.g();
            this.c.b.c.a(status.f());
        }
    }
}
