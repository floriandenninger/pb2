package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acrz {
    public static final acrz b = new acrx();
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract boolean a();

    public final void b(acry acryVar) {
        this.a.add(acryVar);
    }

    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((acry) it.next()).a();
        }
    }
}
