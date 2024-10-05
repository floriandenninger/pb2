package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aygv implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayhg b;

    public aygv(ayhg ayhgVar, Status status) {
        this.b = ayhgVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(this.a.getDescription(), this.a.r);
    }
}
