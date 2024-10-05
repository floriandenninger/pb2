package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aymt implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aynl b;

    public aymt(aynl aynlVar, Status status) {
        this.b = aynlVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.y = true;
        this.b.u.a(this.a, ayge.PROCESSED, new aycd());
    }
}
