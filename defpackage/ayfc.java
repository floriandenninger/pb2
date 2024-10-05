package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfc implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayge b;
    final /* synthetic */ aycd c;
    final /* synthetic */ ayfh d;

    public ayfc(ayfh ayfhVar, Status status, ayge aygeVar, aycd aycdVar) {
        this.d = ayfhVar;
        this.a = status;
        this.b = aygeVar;
        this.c = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.a, this.b, this.c);
    }
}
