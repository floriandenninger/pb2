package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhd implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aycd b;
    final /* synthetic */ ayhf c;

    public ayhd(ayhf ayhfVar, Status status, aycd aycdVar) {
        this.c = ayhfVar;
        this.a = status;
        this.b = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.c(this.a, this.b);
    }
}
