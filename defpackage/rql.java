package defpackage;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rql {
    public final SparseArray a;

    public rql() {
        this.a = new SparseArray();
    }

    public rql(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    private final j f(int i) {
        j jVar = (j) this.a.get(i);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j();
        this.a.put(i, jVar2);
        return jVar2;
    }

    public final void a(int i, Runnable runnable) {
        f(i).a.add(runnable);
    }

    public final void b(int i, k kVar) {
        j f = f(i);
        f.b.add(kVar);
        kVar.a(f.c);
    }

    public final void c(int i) {
        j jVar = (j) this.a.get(i);
        if (jVar == null) {
            return;
        }
        Iterator it = jVar.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void d(int i, boolean z) {
        j f = f(i);
        f.c = z;
        Iterator it = f.b.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(z);
        }
    }

    public final boolean e(int i) {
        j jVar = (j) this.a.get(i);
        return jVar != null && jVar.c;
    }
}
