package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayiy {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (this.a.remove(obj) && size == 1) {
            b();
        }
    }
}
