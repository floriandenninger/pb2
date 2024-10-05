package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambd {
    public int b;
    public boolean c;
    public final Object a = new Object();
    private final Set e = new HashSet();
    public final Application.ActivityLifecycleCallbacks d = new ambc(this);

    public final void a(boolean z) {
        uqq.j();
        synchronized (this.a) {
            this.c = z;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }
}
