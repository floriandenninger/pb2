package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykl implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aycm b;

    public aykl(aycm aycmVar, Status status) {
        this.b = aycmVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
