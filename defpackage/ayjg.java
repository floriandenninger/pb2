package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjg extends ayil {
    final /* synthetic */ aygf a;
    final /* synthetic */ ayjh b;

    public ayjg(ayjh ayjhVar, aygf aygfVar) {
        this.b = ayjhVar;
        this.a = aygfVar;
    }

    @Override // defpackage.ayil, defpackage.aygf
    public final void a(Status status, ayge aygeVar, aycd aycdVar) {
        this.b.b.a.a(status.f());
        this.a.a(status, aygeVar, aycdVar);
    }

    @Override // defpackage.ayil
    protected final aygf b() {
        return this.a;
    }
}
