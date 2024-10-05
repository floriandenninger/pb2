package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhr implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayhx b;

    public ayhr(ayhx ayhxVar, Status status) {
        this.b = ayhxVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.c(this.a);
    }
}
