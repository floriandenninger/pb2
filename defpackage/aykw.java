package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykw {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ aykx d;

    public aykw(aykx aykxVar) {
        this.d = aykxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean isEmpty = this.b.isEmpty();
            if (isEmpty) {
                this.d.y.j(status);
            }
        }
    }
}
