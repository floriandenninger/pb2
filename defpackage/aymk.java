package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymk implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ aynj b;
    final /* synthetic */ Future c;
    final /* synthetic */ Future d;
    final /* synthetic */ aynl e;

    public aymk(aynl aynlVar, Collection collection, aynj aynjVar, Future future, Future future2) {
        this.e = aynlVar;
        this.a = collection;
        this.b = aynjVar;
        this.c = future;
        this.d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status;
        for (aynj aynjVar : this.a) {
            if (aynjVar != this.b) {
                aynjVar.a.c(aynl.c);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.d;
        if (future2 != null) {
            future2.cancel(false);
        }
        aynl aynlVar = this.e;
        aykw aykwVar = aynlVar.C.a.z;
        synchronized (aykwVar.a) {
            aykwVar.b.remove(aynlVar);
            if (aykwVar.b.isEmpty()) {
                status = aykwVar.c;
                aykwVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            aykwVar.d.y.j(status);
        }
    }
}
