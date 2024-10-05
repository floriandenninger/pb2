package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayko implements Runnable {
    final /* synthetic */ aykt a;
    private final /* synthetic */ int b;

    public ayko(aykt ayktVar, int i) {
        this.b = i;
        this.a = ayktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aykt ayktVar = this.a;
                if (ayktVar.c.w == null) {
                    if (ayktVar.a.get() == aykx.g) {
                        this.a.a.set(null);
                    }
                    this.a.c.z.a(aykx.d);
                    return;
                }
                return;
            }
            this.a.c.f();
            return;
        }
        if (this.a.a.get() == aykx.g) {
            this.a.a.set(null);
        }
        Collection collection = this.a.c.w;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ayks) it.next()).b("Channel is forcefully shutdown", null);
            }
        }
        aykw aykwVar = this.a.c.z;
        Status status = aykx.c;
        aykwVar.a(status);
        synchronized (aykwVar.a) {
            arrayList = new ArrayList(aykwVar.b);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((aygd) arrayList.get(i2)).c(status);
        }
        aykwVar.d.y.k(status);
    }
}
