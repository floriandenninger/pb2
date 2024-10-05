package defpackage;

import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zy {
    final ArrayDeque a;
    private final Runnable b;

    public zy() {
        this(null);
    }

    public final zo a(zw zwVar) {
        this.a.add(zwVar);
        zx zxVar = new zx(this, zwVar);
        zwVar.b(zxVar);
        return zxVar;
    }

    public final void b(aok aokVar, zw zwVar) {
        aof lifecycle = aokVar.getLifecycle();
        if (lifecycle.a() == aoe.DESTROYED) {
            return;
        }
        zwVar.b(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, zwVar));
    }

    public final void c() {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            zw zwVar = (zw) descendingIterator.next();
            if (zwVar.b) {
                zwVar.a();
                return;
            }
        }
        this.b.run();
    }

    public zy(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }
}
