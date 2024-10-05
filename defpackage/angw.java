package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angw implements Runnable {
    final /* synthetic */ aniu a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ anhy c;
    final /* synthetic */ anhy d;
    final /* synthetic */ angy e;

    public angw(aniu aniuVar, SettableFuture settableFuture, anhy anhyVar, anhy anhyVar2, angy angyVar) {
        this.a = aniuVar;
        this.b = settableFuture;
        this.c = anhyVar;
        this.d = anhyVar2;
        this.e = angyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isDone()) {
            this.b.qK(this.c);
        } else if (this.d.isCancelled() && this.e.compareAndSet(angx.NOT_RUN, angx.CANCELLED)) {
            this.a.cancel(false);
        }
    }
}
