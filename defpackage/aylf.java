package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylf extends ayba {
    final aylg b;

    public aylf(aylg aylgVar) {
        this.b = aylgVar;
    }

    @Override // defpackage.ayba
    public final ayaz a() {
        baql baqlVar = new baql();
        baqlVar.a = this.b;
        amkq.O(baqlVar.a != null, "config is not set");
        return new ayaz(Status.b, baqlVar.a);
    }
}
