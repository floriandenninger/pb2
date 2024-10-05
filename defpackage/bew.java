package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bew {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, bex bexVar) {
        pse.c(handler);
        pse.c(bexVar);
        c(bexVar);
        this.a.add(new bev(handler, bexVar));
    }

    public final void b(final int i, final long j, final long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final bev bevVar = (bev) it.next();
            if (!bevVar.c) {
                bevVar.a.post(new Runnable() { // from class: beu
                    @Override // java.lang.Runnable
                    public final void run() {
                        bev bevVar2 = bev.this;
                        bevVar2.b.l(i, j, j2);
                    }
                });
            }
        }
    }

    public final void c(bex bexVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            bev bevVar = (bev) it.next();
            if (bevVar.b == bexVar) {
                bevVar.c = true;
                this.a.remove(bevVar);
            }
        }
    }
}
