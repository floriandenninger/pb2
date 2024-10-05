package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygt implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ ayhg b;

    public aygt(ayhg ayhgVar, StringBuilder sb) {
        this.b = ayhgVar;
        this.a = sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(Status.f.withDescription(this.a.toString()), true);
    }
}
