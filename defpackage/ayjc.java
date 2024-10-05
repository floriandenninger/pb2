package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjc implements Runnable {
    final /* synthetic */ ayjd a;

    public ayjc(ayjd ayjdVar) {
        this.a = ayjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayjp ayjpVar = this.a.b;
        ayli ayliVar = ayjpVar.k;
        ayjpVar.j = null;
        ayjpVar.k = null;
        ayliVar.j(Status.o.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
